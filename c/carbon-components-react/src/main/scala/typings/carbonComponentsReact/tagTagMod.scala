package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactBooleans.`false`
import typings.carbonComponentsReact.carbonComponentsReactBooleans.`true`
import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagTagMod {
  
  @JSImport("carbon-components-react/lib/components/Tag/Tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable:unified-signatures
  inline def default(props: FCProps[ChipTagProps | FilterTagProps]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/Tag/Tag", "types")
  @js.native
  val types: js.Array[TagTypeName] = js.native
  
  trait ChipTagProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var filter: js.UndefOr[`false`] = js.undefined
    
    var `type`: js.UndefOr[TagTypeName] = js.undefined
  }
  object ChipTagProps {
    
    inline def apply(): ChipTagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChipTagProps]
    }
    
    extension [Self <: ChipTagProps](x: Self) {
      
      inline def setFilter(value: `false`): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setType(value: TagTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FilterTagProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var filter: `true`
    
    var onClose: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
    
    var `type`: js.UndefOr[TagTypeName] = js.undefined
  }
  object FilterTagProps {
    
    inline def apply(): FilterTagProps = {
      val __obj = js.Dynamic.literal(filter = true)
      __obj.asInstanceOf[FilterTagProps]
    }
    
    extension [Self <: FilterTagProps](x: Self) {
      
      inline def setFilter(value: `true`): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setType(value: TagTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.red
    - typings.carbonComponentsReact.carbonComponentsReactStrings.magenta
    - typings.carbonComponentsReact.carbonComponentsReactStrings.purple
    - typings.carbonComponentsReact.carbonComponentsReactStrings.blue
    - typings.carbonComponentsReact.carbonComponentsReactStrings.cyan
    - typings.carbonComponentsReact.carbonComponentsReactStrings.teal
    - typings.carbonComponentsReact.carbonComponentsReactStrings.green
    - typings.carbonComponentsReact.carbonComponentsReactStrings.gray
    - typings.carbonComponentsReact.carbonComponentsReactStrings.`cool-gray`
    - typings.carbonComponentsReact.carbonComponentsReactStrings.`warm-gray`
    - typings.carbonComponentsReact.carbonComponentsReactStrings.`high-contrast`
  */
  trait TagTypeName extends StObject
  object TagTypeName {
    
    inline def blue: typings.carbonComponentsReact.carbonComponentsReactStrings.blue = "blue".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.blue]
    
    inline def `cool-gray`: typings.carbonComponentsReact.carbonComponentsReactStrings.`cool-gray` = "cool-gray".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.`cool-gray`]
    
    inline def cyan: typings.carbonComponentsReact.carbonComponentsReactStrings.cyan = "cyan".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.cyan]
    
    inline def gray: typings.carbonComponentsReact.carbonComponentsReactStrings.gray = "gray".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.gray]
    
    inline def green: typings.carbonComponentsReact.carbonComponentsReactStrings.green = "green".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.green]
    
    inline def `high-contrast`: typings.carbonComponentsReact.carbonComponentsReactStrings.`high-contrast` = "high-contrast".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.`high-contrast`]
    
    inline def magenta: typings.carbonComponentsReact.carbonComponentsReactStrings.magenta = "magenta".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.magenta]
    
    inline def purple: typings.carbonComponentsReact.carbonComponentsReactStrings.purple = "purple".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.purple]
    
    inline def red: typings.carbonComponentsReact.carbonComponentsReactStrings.red = "red".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.red]
    
    inline def teal: typings.carbonComponentsReact.carbonComponentsReactStrings.teal = "teal".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.teal]
    
    inline def `warm-gray`: typings.carbonComponentsReact.carbonComponentsReactStrings.`warm-gray` = "warm-gray".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.`warm-gray`]
  }
}
