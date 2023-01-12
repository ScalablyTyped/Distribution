package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSceneObject extends StObject {
  
  var `type`: XRSceneObjectType
}
object XRSceneObject {
  
  inline def apply(`type`: XRSceneObjectType): XRSceneObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSceneObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRSceneObject] (val x: Self) extends AnyVal {
    
    inline def setType(value: XRSceneObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
