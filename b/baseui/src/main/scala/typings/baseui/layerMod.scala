package typings.baseui

import typings.baseui.baseuiStrings.auto
import typings.baseui.layerLayersManagerMod.default
import typings.baseui.layerTypesMod.LayerProps
import typings.baseui.layerTypesMod.LayersContextProps
import typings.baseui.layerTypesMod.LayersManagerProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("baseui/layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Layer(props: LayerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Layer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/layer", "LayersContext")
  @js.native
  val LayersContext: Context[LayersContextProps] = js.native
  
  @JSImport("baseui/layer", "LayersManager")
  @js.native
  open class LayersManager protected () extends default {
    def this(props: LayersManagerProps) = this()
  }
  
  object TETHER_PLACEMENT {
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.auto")
    @js.native
    val auto: typings.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.bottom")
    @js.native
    val bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typings.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typings.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.leftBottom")
    @js.native
    val leftBottom: typings.baseui.baseuiStrings.leftBottom = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.leftTop")
    @js.native
    val leftTop: typings.baseui.baseuiStrings.leftTop = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.rightBottom")
    @js.native
    val rightBottom: typings.baseui.baseuiStrings.rightBottom = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.rightTop")
    @js.native
    val rightTop: typings.baseui.baseuiStrings.rightTop = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.topLeft")
    @js.native
    val topLeft: typings.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT.topRight")
    @js.native
    val topRight: typings.baseui.baseuiStrings.topRight = js.native
  }
  
  @JSImport("baseui/layer", "TetherBehavior")
  @js.native
  open class TetherBehavior ()
    extends typings.baseui.layerTetherMod.default
  object TetherBehavior {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps.anchorRef")
      @js.native
      def anchorRef: Any = js.native
      inline def anchorRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchorRef")(x.asInstanceOf[js.Any])
      
      inline def onPopperUpdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onPopperUpdate")().asInstanceOf[Any]
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps.placement")
      @js.native
      def placement: auto = js.native
      inline def placement_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/layer", "TetherBehavior.defaultProps.popperRef")
      @js.native
      def popperRef: Any = js.native
      inline def popperRef_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperRef")(x.asInstanceOf[js.Any])
    }
  }
}
