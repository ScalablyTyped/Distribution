package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeometryAttributes")
@js.native
open class GeometryAttributes () extends StObject {
  
  /**
    * The bitangent attribute (normalized), which is used for tangent-space effects like bump mapping.
    * <p>
    * 32-bit floating-point.  3 components per attribute.
    * </p>
    */
  var bitangent: GeometryAttribute = js.native
  
  /**
    * The color attribute.
    * <p>
    * 8-bit unsigned integer. 4 components per attribute.
    * </p>
    */
  var color: GeometryAttribute = js.native
  
  /**
    * The normal attribute (normalized), which is commonly used for lighting.
    * <p>
    * 32-bit floating-point.  3 components per attribute.
    * </p>
    */
  var normal: GeometryAttribute = js.native
  
  /**
    * The 3D position attribute.
    * <p>
    * 64-bit floating-point (for precision).  3 components per attribute.
    * </p>
    */
  var position: GeometryAttribute = js.native
  
  /**
    * The 2D texture coordinate attribute.
    * <p>
    * 32-bit floating-point.  2 components per attribute
    * </p>
    */
  var st: GeometryAttribute = js.native
  
  /**
    * The tangent attribute (normalized), which is used for tangent-space effects like bump mapping.
    * <p>
    * 32-bit floating-point.  3 components per attribute.
    * </p>
    */
  var tangent: GeometryAttribute = js.native
}
