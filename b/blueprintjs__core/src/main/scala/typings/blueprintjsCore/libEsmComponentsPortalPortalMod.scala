package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialPortalProps
import typings.blueprintjsCore.anon.ValidationMapPortalLegacy
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsPortalPortalMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
  @js.native
  open class Portal protected () extends Component[PortalProps, IPortalState, Any] {
    def this(props: PortalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PortalProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MPortal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortal(prevProps: PortalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortal(): Unit = js.native
    
    @JSName("context")
    var context_Portal: PortalLegacyContext = js.native
    
    /* private */ var createContainerElement: Any = js.native
    
    /* private */ var portalElement: Any = js.native
  }
  /* static members */
  object Portal {
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal.contextTypes")
    @js.native
    def contextTypes: ValidationMapPortalLegacy = js.native
    inline def contextTypes_=(x: ValidationMapPortalLegacy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal.defaultProps")
    @js.native
    def defaultProps: PartialPortalProps = js.native
    inline def defaultProps_=(x: PartialPortalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type IPortalContext = PortalLegacyContext
  
  trait IPortalProps
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
  object IPortalProps {
    
    inline def apply(): IPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPortalProps]
    }
    
    extension [Self <: IPortalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setOnChildrenMount(value: () => Unit): Self = StObject.set(x, "onChildrenMount", js.Any.fromFunction0(value))
      
      inline def setOnChildrenMountUndefined: Self = StObject.set(x, "onChildrenMount", js.undefined)
    }
  }
  
  trait IPortalState extends StObject {
    
    var hasMounted: Boolean
  }
  object IPortalState {
    
    inline def apply(hasMounted: Boolean): IPortalState = {
      val __obj = js.Dynamic.literal(hasMounted = hasMounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPortalState]
    }
    
    extension [Self <: IPortalState](x: Self) {
      
      inline def setHasMounted(value: Boolean): Self = StObject.set(x, "hasMounted", value.asInstanceOf[js.Any])
    }
  }
  
  trait PortalLegacyContext extends StObject {
    
    /** Additional CSS classes to add to all `Portal` elements in this React context. */
    var blueprintPortalClassName: js.UndefOr[String] = js.undefined
  }
  object PortalLegacyContext {
    
    inline def apply(): PortalLegacyContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalLegacyContext]
    }
    
    extension [Self <: PortalLegacyContext](x: Self) {
      
      inline def setBlueprintPortalClassName(value: String): Self = StObject.set(x, "blueprintPortalClassName", value.asInstanceOf[js.Any])
      
      inline def setBlueprintPortalClassNameUndefined: Self = StObject.set(x, "blueprintPortalClassName", js.undefined)
    }
  }
  
  type PortalProps = IPortalProps
}
