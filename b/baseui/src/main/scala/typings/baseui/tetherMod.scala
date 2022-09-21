package typings.baseui

import typings.baseui.anon.IsMounted
import typings.baseui.baseuiStrings.auto
import typings.baseui.layerTypesMod.PopperDataObject
import typings.baseui.layerTypesMod.TetherProps
import typings.baseui.layerTypesMod.TetherState
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tetherMod {
  
  @JSImport("baseui/layer/tether", JSImport.Default)
  @js.native
  open class default () extends Tether
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/layer/tether", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/layer/tether", "default.defaultProps.anchorRef")
      @js.native
      def anchorRef: Any = js.native
      inline def anchorRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(x.asInstanceOf[js.Any])
      
      inline def onPopperUpdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onPopperUpdate")().asInstanceOf[Any]
      
      @JSImport("baseui/layer/tether", "default.defaultProps.placement")
      @js.native
      def placement: auto = js.native
      inline def placement_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/layer/tether", "default.defaultProps.popperRef")
      @js.native
      def popperRef: Any = js.native
      inline def popperRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tether extends Component[TetherProps, TetherState, Any] {
    
    var anchorHeight: Double = js.native
    
    var anchorWidth: Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTether(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTether(prevProps: TetherProps, prevState: TetherState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTether(): Unit = js.native
    
    def destroyPopover(): Unit = js.native
    
    def initializePopper(): Unit = js.native
    
    def onPopperUpdate(data: PopperDataObject): Unit = js.native
    
    var popper: js.UndefOr[typings.popperJs.mod.default] = js.native
    
    var popperHeight: Double = js.native
    
    var popperWidth: Double = js.native
    
    @JSName("state")
    var state_Tether: IsMounted = js.native
  }
}
