package typings.cesium.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Element | String
  
  var flightDuration: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var scene: typings.cesium.mod.Scene
  
  var url: js.UndefOr[String] = js.undefined
}
object Container {
  
  @scala.inline
  def apply(container: Element | String, scene: typings.cesium.mod.Scene): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightDuration(value: Double): Self = StObject.set(x, "flightDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlightDurationUndefined: Self = StObject.set(x, "flightDuration", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
