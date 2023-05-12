package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTooltipReactTooltipMod {
  
  @JSImport("bizcharts/lib/components/Tooltip/ReactTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any extends react.react.JSXElementConstructor<infer P> ? P : any extends keyof react.react.JSX.IntrinsicElements ? react.react.JSX.IntrinsicElements[any] : {} */ trait TooltipProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: js.UndefOr[
        js.Function5[
          /* title */ js.UndefOr[String], 
          /* items */ js.UndefOr[js.Array[Any]], 
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* event */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(
        value: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[Any]], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* event */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "children", js.Any.fromFunction5(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
