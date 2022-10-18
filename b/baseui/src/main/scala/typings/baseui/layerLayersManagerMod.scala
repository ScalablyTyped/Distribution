package typings.baseui

import typings.baseui.layerTypesMod.LayersContextProps
import typings.baseui.layerTypesMod.LayersManagerProps
import typings.baseui.layerTypesMod.LayersManagerState
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerLayersManagerMod {
  
  @JSImport("baseui/layer/layers-manager", JSImport.Default)
  @js.native
  open class default protected () extends LayersManager {
    def this(props: LayersManagerProps) = this()
  }
  
  @JSImport("baseui/layer/layers-manager", "Consumer")
  @js.native
  val Consumer: typings.react.mod.Consumer[LayersContextProps] = js.native
  
  @JSImport("baseui/layer/layers-manager", "LayersContext")
  @js.native
  val LayersContext: Context[LayersContextProps] = js.native
  
  @JSImport("baseui/layer/layers-manager", "Provider")
  @js.native
  val Provider: typings.react.mod.Provider[LayersContextProps] = js.native
  
  @js.native
  trait LayersManager extends Component[LayersManagerProps, LayersManagerState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MLayersManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLayersManager(): Unit = js.native
    
    var containerRef: RefObject[Any] = js.native
    
    var host: RefObject[HTMLElement] = js.native
    
    def onAddDocClickHandler(docClickHandler: js.Function1[/* event */ MouseEvent, Any]): Unit = js.native
    
    def onAddEscapeHandler(escapeKeyHandler: js.Function0[Any]): Unit = js.native
    
    def onAddKeyDownHandler(keyDownHandler: js.Function0[Any]): Unit = js.native
    
    def onAddKeyPressHandler(keyPressHandler: js.Function0[Any]): Unit = js.native
    
    def onAddKeyUpHandler(keyUpHandler: js.Function0[Any]): Unit = js.native
    
    def onDocumentClick(event: MouseEvent): Unit = js.native
    
    def onKeyDown(event: KeyboardEvent): Unit = js.native
    
    def onKeyPress(event: KeyboardEvent): Unit = js.native
    
    def onKeyUp(event: KeyboardEvent): Unit = js.native
    
    def onRemoveDocClickHandler(docClickHandler: js.Function1[/* event */ MouseEvent, Any]): Unit = js.native
    
    def onRemoveEscapeHandler(escapeKeyHandler: js.Function0[Any]): Unit = js.native
    
    def onRemoveKeyDownHandler(keyDownHandler: js.Function0[Any]): Unit = js.native
    
    def onRemoveKeyPressHandler(keyPressHandler: js.Function0[Any]): Unit = js.native
    
    def onRemoveKeyUpHandler(keyUpHandler: js.Function0[Any]): Unit = js.native
  }
}
