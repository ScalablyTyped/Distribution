package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniformSpecifier extends StObject {
  
  var `type`: UniformType
  
  var value: Boolean | Double | Cartesian2 | Cartesian3 | Cartesian4 | Matrix2 | Matrix3 | Matrix4 | TextureUniform
}
object UniformSpecifier {
  
  inline def apply(
    `type`: UniformType,
    value: Boolean | Double | Cartesian2 | Cartesian3 | Cartesian4 | Matrix2 | Matrix3 | Matrix4 | TextureUniform
  ): UniformSpecifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformSpecifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniformSpecifier] (val x: Self) extends AnyVal {
    
    inline def setType(value: UniformType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: Boolean | Double | Cartesian2 | Cartesian3 | Cartesian4 | Matrix2 | Matrix3 | Matrix4 | TextureUniform
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
