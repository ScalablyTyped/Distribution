package typings.babylonjs.edgesRendererMod

import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.smartArrayMod.SmartArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEdgesRenderer extends IDisposable {
  
  /**
    * List of instances to render in case the source mesh has instances
    */
  var customInstances: SmartArray[Matrix] = js.native
  
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  def isReady(): Boolean = js.native
  
  /**
    * Renders the edges of the attached mesh,
    */
  def render(): Unit = js.native
}
object IEdgesRenderer {
  
  @scala.inline
  def apply(
    customInstances: SmartArray[Matrix],
    dispose: () => Unit,
    isEnabled: Boolean,
    isReady: () => Boolean,
    render: () => Unit
  ): IEdgesRenderer = {
    val __obj = js.Dynamic.literal(customInstances = customInstances.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[IEdgesRenderer]
  }
  
  @scala.inline
  implicit class IEdgesRendererOps[Self <: IEdgesRenderer] (val x: Self) extends AnyVal {
    
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
    def setCustomInstances(value: SmartArray[Matrix]): Self = this.set("customInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: () => Boolean): Self = this.set("isReady", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
  }
}
