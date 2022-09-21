package typings.blueprintjsSelect

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemRendererMod {
  
  type IItemModifiers = ItemModifiers
  
  type IItemRendererProps = ItemRendererProps
  
  trait ItemModifiers extends StObject {
    
    /** Whether this is the "active" (focused) item, meaning keyboard interactions will act upon it. */
    var active: Boolean
    
    /** Whether this item is disabled and should ignore interactions. */
    var disabled: Boolean
    
    /** Whether this item matches the predicate. A typical renderer could hide `false` values. */
    var matchesPredicate: Boolean
  }
  object ItemModifiers {
    
    inline def apply(active: Boolean, disabled: Boolean, matchesPredicate: Boolean): ItemModifiers = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], matchesPredicate = matchesPredicate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemModifiers]
    }
    
    extension [Self <: ItemModifiers](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setMatchesPredicate(value: Boolean): Self = StObject.set(x, "matchesPredicate", value.asInstanceOf[js.Any])
    }
  }
  
  type ItemRenderer[T] = js.Function2[/* item */ T, /* itemProps */ ItemRendererProps, Element | Null]
  
  trait ItemRendererProps extends StObject {
    
    /** Click event handler to select this item. */
    var handleClick: MouseEventHandler[HTMLElement]
    
    /**
      * Focus event handler to set this as the "active" item.
      *
      * N.B. this is optional to preserve back-compat; it will become required in the next major version.
      */
    var handleFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
    var modifiers: ItemModifiers
    
    /** The current query string used to filter the items. */
    var query: String
  }
  object ItemRendererProps {
    
    inline def apply(
      handleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
      modifiers: ItemModifiers,
      query: String
    ): ItemRendererProps = {
      val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), modifiers = modifiers.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRendererProps]
    }
    
    extension [Self <: ItemRendererProps](x: Self) {
      
      inline def setHandleClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction1(value))
      
      inline def setHandleFocus(value: () => Unit): Self = StObject.set(x, "handleFocus", js.Any.fromFunction0(value))
      
      inline def setHandleFocusUndefined: Self = StObject.set(x, "handleFocus", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModifiers(value: ItemModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
