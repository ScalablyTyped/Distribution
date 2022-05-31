package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HDRInfo extends StObject {
  
  /**
    * The index of the beginning of the data in the binary file.
    */
  var dataPosition: Double
  
  /**
    * The height of the texture in pixels.
    */
  var height: Double
  
  /**
    * The width of the texture in pixels.
    */
  var width: Double
}
object HDRInfo {
  
  inline def apply(dataPosition: Double, height: Double, width: Double): HDRInfo = {
    val __obj = js.Dynamic.literal(dataPosition = dataPosition.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HDRInfo]
  }
  
  extension [Self <: HDRInfo](x: Self) {
    
    inline def setDataPosition(value: Double): Self = StObject.set(x, "dataPosition", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
