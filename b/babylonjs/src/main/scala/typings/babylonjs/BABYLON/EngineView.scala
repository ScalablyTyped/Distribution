package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineView extends js.Object {
  
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
  implicit class EngineViewOps[Self <: EngineView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTarget(value: HTMLCanvasElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
  }
}
