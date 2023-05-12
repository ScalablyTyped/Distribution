package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.ComponentsPerAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GeometryInstanceAttribute")
@js.native
open class GeometryInstanceAttribute protected () extends StObject {
  def this(options: ComponentsPerAttribute) = this()
  
  /**
    * The datatype of each component in the attribute, e.g., individual elements in
    * {@link GeometryInstanceAttribute#value}.
    */
  var componentDatatype: ComponentDatatype = js.native
  
  /**
    * A number between 1 and 4 that defines the number of components in an attributes.
    * For example, a position attribute with x, y, and z components would have 3 as
    * shown in the code example.
    * @example
    * show : new Cesium.GeometryInstanceAttribute({
    *   componentDatatype : Cesium.ComponentDatatype.UNSIGNED_BYTE,
    *   componentsPerAttribute : 1,
    *   normalize : true,
    *   value : [1.0]
    * })
    */
  var componentsPerAttribute: Double = js.native
  
  /**
    * When <code>true</code> and <code>componentDatatype</code> is an integer format,
    * indicate that the components should be mapped to the range [0, 1] (unsigned)
    * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
    * <p>
    * This is commonly used when storing colors using {@link ComponentDatatype.UNSIGNED_BYTE}.
    * </p>
    * @example
    * attribute.componentDatatype = Cesium.ComponentDatatype.UNSIGNED_BYTE;
    * attribute.componentsPerAttribute = 4;
    * attribute.normalize = true;
    * attribute.value = [
    *   Cesium.Color.floatToByte(color.red),
    *   Cesium.Color.floatToByte(color.green),
    *   Cesium.Color.floatToByte(color.blue),
    *   Cesium.Color.floatToByte(color.alpha)
    * ];
    */
  var normalize: Boolean = js.native
  
  /**
    * The values for the attributes stored in a typed array.  In the code example,
    * every three elements in <code>values</code> defines one attributes since
    * <code>componentsPerAttribute</code> is 3.
    * @example
    * show : new Cesium.GeometryInstanceAttribute({
    *   componentDatatype : Cesium.ComponentDatatype.UNSIGNED_BYTE,
    *   componentsPerAttribute : 1,
    *   normalize : true,
    *   value : [1.0]
    * })
    */
  var value: js.Array[Double] = js.native
}
