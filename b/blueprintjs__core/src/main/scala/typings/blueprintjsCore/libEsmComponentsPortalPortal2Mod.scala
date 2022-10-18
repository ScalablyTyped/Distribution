package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.blueprintPortalClassName
import typings.blueprintjsCore.libEsmCommonContextMod.Validator
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmComponentsPortalPortalMod.PortalLegacyContext
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsPortalPortal2Mod {
  
  object Portal2 {
    
    inline def apply(props: Portal2Props): ReactPortal | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactPortal | Null]
    inline def apply(props: Portal2Props, legacyContext: PortalLegacyContext): ReactPortal | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], legacyContext.asInstanceOf[js.Any])).asInstanceOf[ReactPortal | Null]
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal2", "Portal2")
    @js.native
    val ^ : js.Any = js.native
    
    /* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.ValidationMap<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.PortalLegacyContext> */
    object contextTypes {
      
      @JSImport("@blueprintjs/core/lib/esm/components/portal/portal2", "Portal2.contextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@blueprintjs/core/lib/esm/components/portal/portal2", "Portal2.contextTypes.blueprintPortalClassName")
      @js.native
      def blueprintPortalClassName: js.UndefOr[
            Validator[typings.blueprintjsCore.blueprintjsCoreStrings.blueprintPortalClassName]
          ] = js.native
      inline def blueprintPortalClassName_=(x: js.UndefOr[Validator[blueprintPortalClassName]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blueprintPortalClassName")(x.asInstanceOf[js.Any])
    }
    
    object defaultProps {
      
      @JSImport("@blueprintjs/core/lib/esm/components/portal/portal2", "Portal2.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@blueprintjs/core/lib/esm/components/portal/portal2", "Portal2.defaultProps.container")
      @js.native
      def container: js.UndefOr[HTMLElement] = js.native
      inline def container_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal2", "Portal2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait Portal2Props
    extends StObject
       with IProps {
    
    /** Contents to send through the portal. */
    var children: ReactNode
    
    /**
      * The HTML element that children will be mounted to.
      *
      * @default document.body
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Callback invoked when the children of this `Portal` have been added to the DOM.
      */
    var onChildrenMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Portal2Props {
    
    inline def apply(): Portal2Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Portal2Props]
    }
    
    extension [Self <: Portal2Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setOnChildrenMount(value: () => Unit): Self = StObject.set(x, "onChildrenMount", js.Any.fromFunction0(value))
      
      inline def setOnChildrenMountUndefined: Self = StObject.set(x, "onChildrenMount", js.undefined)
    }
  }
}
