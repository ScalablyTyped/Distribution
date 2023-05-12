package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMipmap extends StObject {
  
  /**
    * The data of the mipmap level
    */
  var data: js.typedarray.Uint8Array | Null
  
  /**
    * The height of the mipmap level
    */
  var height: Double
  
  /**
    * The width of the mipmap level
    */
  var width: Double
}
object IMipmap {
  
  inline def apply(height: Double, width: Double): IMipmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], data = null)
    __obj.asInstanceOf[IMipmap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMipmap] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
