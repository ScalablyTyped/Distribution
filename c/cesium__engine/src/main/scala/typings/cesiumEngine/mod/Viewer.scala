package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewer extends StObject {
  
  var scene: Scene
}
object Viewer {
  
  inline def apply(scene: Scene): Viewer = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Viewer] (val x: Self) extends AnyVal {
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
