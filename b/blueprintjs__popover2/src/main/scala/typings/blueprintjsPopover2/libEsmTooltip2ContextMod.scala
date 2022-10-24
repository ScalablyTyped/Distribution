package typings.blueprintjsPopover2

import typings.react.mod.Context
import typings.react.mod.Dispatch
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTooltip2ContextMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/tooltip2Context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/popover2/lib/esm/tooltip2Context", "Tooltip2Context")
  @js.native
  val Tooltip2Context: Context[js.Tuple2[Tooltip2ContextState, Dispatch[Tooltip2Action]]] = js.native
  
  inline def Tooltip2Provider(param0: Tooltip2ProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip2Provider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsPopover2.anon.Type
    - typings.blueprintjsPopover2.anon.`0`
  */
  trait Tooltip2Action extends StObject
  object Tooltip2Action {
    
    inline def `0`(): typings.blueprintjsPopover2.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RESET_DISABLED_STATE")
      __obj.asInstanceOf[typings.blueprintjsPopover2.anon.`0`]
    }
    
    inline def Type(): typings.blueprintjsPopover2.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("FORCE_DISABLED_STATE")
      __obj.asInstanceOf[typings.blueprintjsPopover2.anon.Type]
    }
  }
  
  trait Tooltip2ContextState extends StObject {
    
    var forceDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object Tooltip2ContextState {
    
    inline def apply(): Tooltip2ContextState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip2ContextState]
    }
    
    extension [Self <: Tooltip2ContextState](x: Self) {
      
      inline def setForceDisabled(value: Boolean): Self = StObject.set(x, "forceDisabled", value.asInstanceOf[js.Any])
      
      inline def setForceDisabledUndefined: Self = StObject.set(x, "forceDisabled", js.undefined)
    }
  }
  
  trait Tooltip2ProviderProps extends StObject {
    
    var children: ReactNode | (js.Function1[/* ctxState */ Tooltip2ContextState, ReactNode])
    
    var forceDisable: js.UndefOr[Boolean] = js.undefined
  }
  object Tooltip2ProviderProps {
    
    inline def apply(): Tooltip2ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip2ProviderProps]
    }
    
    extension [Self <: Tooltip2ProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* ctxState */ Tooltip2ContextState, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ctxState */ Tooltip2ContextState => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForceDisable(value: Boolean): Self = StObject.set(x, "forceDisable", value.asInstanceOf[js.Any])
      
      inline def setForceDisableUndefined: Self = StObject.set(x, "forceDisable", js.undefined)
    }
  }
}
