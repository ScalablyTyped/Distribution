package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineView extends StObject {
  
  /** Defines an optional camera used to render the view (will use active camera else) */
  var camera: js.UndefOr[Camera] = js.native
  
  /** Defines the canvas where to render the view */
  var target: HTMLCanvasElement = js.native
}
object EngineView {
  
  @scala.inline
  def apply(target: HTMLCanvasElement): EngineView = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineView]
  }
  
  @scala.inline
  implicit class EngineViewMutableBuilder[Self <: EngineView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLCanvasElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
