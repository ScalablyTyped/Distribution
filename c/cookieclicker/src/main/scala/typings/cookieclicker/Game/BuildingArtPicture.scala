package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingArtPicture extends StObject {
  
  var frame: Double
  
  var id: Double
  
  var pic: String
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object BuildingArtPicture {
  
  inline def apply(frame: Double, id: Double, pic: String, x: Double, y: Double, z: Double): BuildingArtPicture = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingArtPicture]
  }
  
  extension [Self <: BuildingArtPicture](x: Self) {
    
    inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
