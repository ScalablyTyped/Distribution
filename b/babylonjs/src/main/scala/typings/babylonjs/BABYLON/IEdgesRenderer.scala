package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEdgesRenderer
  extends StObject
     with IDisposable {
  
  /**
    * List of instances to render in case the source mesh has instances
    */
  var customInstances: SmartArray[Matrix]
  
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  var isEnabled: Boolean
  
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  def isReady(): Boolean
  
  /**
    * Renders the edges of the attached mesh,
    */
  def render(): Unit
}
object IEdgesRenderer {
  
  inline def apply(
    customInstances: SmartArray[Matrix],
    dispose: () => Unit,
    isEnabled: Boolean,
    isReady: () => Boolean,
    render: () => Unit
  ): IEdgesRenderer = {
    val __obj = js.Dynamic.literal(customInstances = customInstances.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[IEdgesRenderer]
  }
  
  extension [Self <: IEdgesRenderer](x: Self) {
    
    inline def setCustomInstances(value: SmartArray[Matrix]): Self = StObject.set(x, "customInstances", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsReady(value: () => Boolean): Self = StObject.set(x, "isReady", js.Any.fromFunction0(value))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
