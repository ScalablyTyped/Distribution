package typings.blueprintjsCore

import typings.blueprintjsCore.anon.HandleDialogClose
import typings.blueprintjsCore.anon.PartialOmitHotkeysDialog2
import typings.blueprintjsCore.blueprintjsCoreStrings.ADD_HOTKEYS
import typings.blueprintjsCore.blueprintjsCoreStrings.CLOSE_DIALOG
import typings.blueprintjsCore.blueprintjsCoreStrings.OPEN_DIALOG
import typings.blueprintjsCore.blueprintjsCoreStrings.REMOVE_HOTKEYS
import typings.blueprintjsCore.libEsmHooksHotkeysHotkeyConfigMod.HotkeyConfig
import typings.react.mod.Context
import typings.react.mod.Dispatch
import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmContextHotkeysHotkeysProviderMod {
  
  @JSImport("@blueprintjs/core/lib/esm/context/hotkeys/hotkeysProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/context/hotkeys/hotkeysProvider", "HotkeysContext")
  @js.native
  val HotkeysContext: Context[HotkeysContextInstance] = js.native
  
  inline def HotkeysProvider(hasChildrenDialogPropsRenderDialogValue: HotkeysProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysProvider")(hasChildrenDialogPropsRenderDialogValue.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.anon.Payload
    - typings.blueprintjsCore.anon.Type
  */
  trait HotkeysAction extends StObject
  object HotkeysAction {
    
    inline def Payload(payload: js.Array[HotkeyConfig], `type`: ADD_HOTKEYS | REMOVE_HOTKEYS): typings.blueprintjsCore.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.blueprintjsCore.anon.Payload]
    }
    
    inline def Type(`type`: CLOSE_DIALOG | OPEN_DIALOG): typings.blueprintjsCore.anon.Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.blueprintjsCore.anon.Type]
    }
  }
  
  type HotkeysContextInstance = js.Tuple2[HotkeysContextState, Dispatch[HotkeysAction]]
  
  trait HotkeysContextState extends StObject {
    
    /**
      * Whether the context instance is being used within a tree which has a <HotkeysProvider>.
      * It's technically ok if this is false, but not recommended, since that means any hotkeys
      * bound with that context instance will not show up in the hotkeys help dialog.
      */
    var hasProvider: Boolean
    
    /** List of hotkeys accessible in the current scope, registered by currently mounted components, can be global or local. */
    var hotkeys: js.Array[HotkeyConfig]
    
    /** Whether the global hotkeys dialog is open. */
    var isDialogOpen: Boolean
  }
  object HotkeysContextState {
    
    inline def apply(hasProvider: Boolean, hotkeys: js.Array[HotkeyConfig], isDialogOpen: Boolean): HotkeysContextState = {
      val __obj = js.Dynamic.literal(hasProvider = hasProvider.asInstanceOf[js.Any], hotkeys = hotkeys.asInstanceOf[js.Any], isDialogOpen = isDialogOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotkeysContextState]
    }
    
    extension [Self <: HotkeysContextState](x: Self) {
      
      inline def setHasProvider(value: Boolean): Self = StObject.set(x, "hasProvider", value.asInstanceOf[js.Any])
      
      inline def setHotkeys(value: js.Array[HotkeyConfig]): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      inline def setHotkeysVarargs(value: HotkeyConfig*): Self = StObject.set(x, "hotkeys", js.Array(value*))
      
      inline def setIsDialogOpen(value: Boolean): Self = StObject.set(x, "isDialogOpen", value.asInstanceOf[js.Any])
    }
  }
  
  trait HotkeysProviderProps extends StObject {
    
    /** The component subtree which will have access to this hotkeys context. */
    var children: ReactChild
    
    /** Optional props to customize the rendered hotkeys dialog. */
    var dialogProps: js.UndefOr[PartialOmitHotkeysDialog2] = js.undefined
    
    /** If provided, this dialog render function will be used in place of the default implementation. */
    var renderDialog: js.UndefOr[
        js.Function2[/* state */ HotkeysContextState, /* contextActions */ HandleDialogClose, Element]
      ] = js.undefined
    
    /** If provided, we will use this context instance instead of generating our own. */
    var value: js.UndefOr[HotkeysContextInstance] = js.undefined
  }
  object HotkeysProviderProps {
    
    inline def apply(children: ReactChild): HotkeysProviderProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotkeysProviderProps]
    }
    
    extension [Self <: HotkeysProviderProps](x: Self) {
      
      inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDialogProps(value: PartialOmitHotkeysDialog2): Self = StObject.set(x, "dialogProps", value.asInstanceOf[js.Any])
      
      inline def setDialogPropsUndefined: Self = StObject.set(x, "dialogProps", js.undefined)
      
      inline def setRenderDialog(value: (/* state */ HotkeysContextState, /* contextActions */ HandleDialogClose) => Element): Self = StObject.set(x, "renderDialog", js.Any.fromFunction2(value))
      
      inline def setRenderDialogUndefined: Self = StObject.set(x, "renderDialog", js.undefined)
      
      inline def setValue(value: HotkeysContextInstance): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
