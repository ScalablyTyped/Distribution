package typings.bizcharts

import typings.bizcharts.anon.PreInteractions
import typings.bizcharts.libInterfaceMod.IViewProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsViewMod {
  
  @JSImport("bizcharts/lib/components/View", JSImport.Default)
  @js.native
  open class default protected () extends View {
    def this(props: IViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IViewProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("bizcharts/lib/components/View", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts/lib/components/View", "default.defaultProps")
    @js.native
    def defaultProps: PreInteractions = js.native
    inline def defaultProps_=(x: PreInteractions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bizcharts/lib/components/View", "View")
  @js.native
  open class View protected ()
    extends Component[IViewProps, js.Object, Any] {
    def this(props: IViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IViewProps, context: Any) = this()
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MView(): Unit = js.native
    
    var name: String = js.native
    
    /* private */ var viewHelper: Any = js.native
  }
  /* static members */
  object View {
    
    @JSImport("bizcharts/lib/components/View", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts/lib/components/View", "View.defaultProps")
    @js.native
    def defaultProps: PreInteractions = js.native
    inline def defaultProps_=(x: PreInteractions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
