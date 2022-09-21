package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineView extends StObject {
  
  /** Defines an optional camera used to render the view (will use active camera else) */
  var camera: js.UndefOr[Camera] = js.undefined
  
  /** Indicates if the destination view canvas should be cleared before copying the parent canvas. Can help if the scene clear color has alpha < 1 */
  var clearBeforeCopy: js.UndefOr[Boolean] = js.undefined
  
  /** Defines a custom function to handle canvas size changes. (the canvas to render into is provided to the callback) */
  var customResize: js.UndefOr[js.Function1[/* canvas */ HTMLCanvasElement, Unit]] = js.undefined
  
  /** Indicates if the view is enabled (true by default) */
  var enabled: Boolean
  
  /**
    * A randomly generated unique id
    */
  val id: String
  
  /** Defines the canvas where to render the view */
  var target: HTMLCanvasElement
}
object EngineView {
  
  inline def apply(enabled: Boolean, id: String, target: HTMLCanvasElement): EngineView = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineView]
  }
  
  extension [Self <: EngineView](x: Self) {
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setClearBeforeCopy(value: Boolean): Self = StObject.set(x, "clearBeforeCopy", value.asInstanceOf[js.Any])
    
    inline def setClearBeforeCopyUndefined: Self = StObject.set(x, "clearBeforeCopy", js.undefined)
    
    inline def setCustomResize(value: /* canvas */ HTMLCanvasElement => Unit): Self = StObject.set(x, "customResize", js.Any.fromFunction1(value))
    
    inline def setCustomResizeUndefined: Self = StObject.set(x, "customResize", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: HTMLCanvasElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
