package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GeometryAttribute")
@js.native
open class GeometryAttribute () extends StObject {
  def this(options: typings.cesiumEngine.anon.ComponentDatatype) = this()
  
  /**
    * The datatype of each component in the attribute, e.g., individual elements in
    * {@link GeometryAttribute#values}.
    */
  var componentDatatype: ComponentDatatype = js.native
  
  /**
    * A number between 1 and 4 that defines the number of components in an attributes.
    * For example, a position attribute with x, y, and z components would have 3 as
    * shown in the code example.
    * @example
    * attribute.componentDatatype = Cesium.ComponentDatatype.FLOAT;
    * attribute.componentsPerAttribute = 3;
    * attribute.values = new Float32Array([
    *   0.0, 0.0, 0.0,
    *   7500000.0, 0.0, 0.0,
    *   0.0, 7500000.0, 0.0
    * ]);
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
    * attribute.values = new Uint8Array([
    *   Cesium.Color.floatToByte(color.red),
    *   Cesium.Color.floatToByte(color.green),
    *   Cesium.Color.floatToByte(color.blue),
    *   Cesium.Color.floatToByte(color.alpha)
    * ]);
    */
  var normalize: Boolean = js.native
  
  /**
    * The values for the attributes stored in a typed array.  In the code example,
    * every three elements in <code>values</code> defines one attributes since
    * <code>componentsPerAttribute</code> is 3.
    * @example
    * attribute.componentDatatype = Cesium.ComponentDatatype.FLOAT;
    * attribute.componentsPerAttribute = 3;
    * attribute.values = new Float32Array([
    *   0.0, 0.0, 0.0,
    *   7500000.0, 0.0, 0.0,
    *   0.0, 7500000.0, 0.0
    * ]);
    */
  var values: js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
}
