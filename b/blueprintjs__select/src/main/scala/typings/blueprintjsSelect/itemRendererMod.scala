package typings.blueprintjsSelect

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemRendererMod {
  
  @js.native
  trait IItemModifiers extends StObject {
    
    /** Whether this is the "active" (focused) item, meaning keyboard interactions will act upon it. */
    var active: Boolean = js.native
    
    /** Whether this item is disabled and should ignore interactions. */
    var disabled: Boolean = js.native
    
    /** Whether this item matches the predicate. A typical renderer could hide `false` values. */
    var matchesPredicate: Boolean = js.native
  }
  object IItemModifiers {
    
    @scala.inline
    def apply(active: Boolean, disabled: Boolean, matchesPredicate: Boolean): IItemModifiers = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], matchesPredicate = matchesPredicate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IItemModifiers]
    }
    
    @scala.inline
    implicit class IItemModifiersMutableBuilder[Self <: IItemModifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesPredicate(value: Boolean): Self = StObject.set(x, "matchesPredicate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IItemRendererProps extends StObject {
    
    /** Click event handler to select this item. */
    var handleClick: MouseEventHandler[HTMLElement] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
    var modifiers: IItemModifiers = js.native
    
    /** The current query string used to filter the items. */
    var query: String = js.native
  }
  object IItemRendererProps {
    
    @scala.inline
    def apply(
      handleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
      modifiers: IItemModifiers,
      query: String
    ): IItemRendererProps = {
      val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), modifiers = modifiers.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[IItemRendererProps]
    }
    
    @scala.inline
    implicit class IItemRendererPropsMutableBuilder[Self <: IItemRendererProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setModifiers(value: IItemModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type ItemRenderer[T] = js.Function2[/* item */ T, /* itemProps */ IItemRendererProps, Element | Null]
}
