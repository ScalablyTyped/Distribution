package typings.blueprintjsCore

import typings.blueprintjsCore.anon.ValidationMapIPortalConte
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
  @js.native
  class Portal protected ()
    extends Component[IPortalProps, IPortalState, js.Any] {
    def this(props: IPortalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IPortalProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MPortal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortal(prevProps: IPortalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortal(): Unit = js.native
    
    @JSName("context")
    var context_Portal: IPortalContext = js.native
    
    var createContainerElement: js.Any = js.native
    
    var portalElement: js.Any = js.native
    
    var unstableRenderNoPortal: js.Any = js.native
  }
  /* static members */
  object Portal {
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal.contextTypes")
    @js.native
    def contextTypes: ValidationMapIPortalConte = js.native
    @scala.inline
    def contextTypes_=(x: ValidationMapIPortalConte): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal.defaultProps")
    @js.native
    def defaultProps: IPortalProps = js.native
    @scala.inline
    def defaultProps_=(x: IPortalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IPortalContext extends StObject {
    
    /** Additional CSS classes to add to all `Portal` elements in this React context. */
    var blueprintPortalClassName: js.UndefOr[String] = js.undefined
  }
  object IPortalContext {
    
    @scala.inline
    def apply(): IPortalContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPortalContext]
    }
    
    @scala.inline
    implicit class IPortalContextMutableBuilder[Self <: IPortalContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlueprintPortalClassName(value: String): Self = StObject.set(x, "blueprintPortalClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueprintPortalClassNameUndefined: Self = StObject.set(x, "blueprintPortalClassName", js.undefined)
    }
  }
  
  trait IPortalProps
    extends StObject
       with IProps {
    
    /**
      * The HTML element that children will be mounted to.
      * @default document.body
      */
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Callback invoked when the children of this `Portal` have been added to the DOM.
      */
    var onChildrenMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IPortalProps {
    
    @scala.inline
    def apply(): IPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPortalProps]
    }
    
    @scala.inline
    implicit class IPortalPropsMutableBuilder[Self <: IPortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setOnChildrenMount(value: () => Unit): Self = StObject.set(x, "onChildrenMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnChildrenMountUndefined: Self = StObject.set(x, "onChildrenMount", js.undefined)
    }
  }
  
  trait IPortalState extends StObject {
    
    var hasMounted: Boolean
  }
  object IPortalState {
    
    @scala.inline
    def apply(hasMounted: Boolean): IPortalState = {
      val __obj = js.Dynamic.literal(hasMounted = hasMounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPortalState]
    }
    
    @scala.inline
    implicit class IPortalStateMutableBuilder[Self <: IPortalState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasMounted(value: Boolean): Self = StObject.set(x, "hasMounted", value.asInstanceOf[js.Any])
    }
  }
}
