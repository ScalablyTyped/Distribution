package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DistanceDisplayConditionGeometryInstanceAttribute")
@js.native
open class DistanceDisplayConditionGeometryInstanceAttribute () extends StObject {
  def this(near: Double) = this()
  def this(near: Double, far: Double) = this()
  def this(near: Unit, far: Double) = this()
  
  /**
    * The datatype of each component in the attribute, e.g., individual elements in
    * {@link DistanceDisplayConditionGeometryInstanceAttribute#value}.
    */
  val componentDatatype: ComponentDatatype = js.native
  
  /**
    * The number of components in the attributes, i.e., {@link DistanceDisplayConditionGeometryInstanceAttribute#value}.
    */
  val componentsPerAttribute: Double = js.native
  
  /**
    * When <code>true</code> and <code>componentDatatype</code> is an integer format,
    * indicate that the components should be mapped to the range [0, 1] (unsigned)
    * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
    */
  val normalize: Boolean = js.native
  
  /**
    * The values for the attributes stored in a typed array.
    */
  var value: js.typedarray.Float32Array = js.native
}
/* static members */
object DistanceDisplayConditionGeometryInstanceAttribute {
  
  @JSImport("cesium", "DistanceDisplayConditionGeometryInstanceAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new {@link DistanceDisplayConditionGeometryInstanceAttribute} instance given the provided an enabled flag and {@link DistanceDisplayCondition}.
    * @example
    * const distanceDisplayCondition = new Cesium.DistanceDisplayCondition(100.0, 10000.0);
    * const instance = new Cesium.GeometryInstance({
    *   geometry : geometry,
    *   attributes : {
    *     distanceDisplayCondition : Cesium.DistanceDisplayConditionGeometryInstanceAttribute.fromDistanceDisplayCondition(distanceDisplayCondition)
    *   }
    * });
    * @param distanceDisplayCondition - The distance display condition.
    * @returns The new {@link DistanceDisplayConditionGeometryInstanceAttribute} instance.
    */
  inline def fromDistanceDisplayCondition(distanceDisplayCondition: DistanceDisplayCondition): DistanceDisplayConditionGeometryInstanceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDistanceDisplayCondition")(distanceDisplayCondition.asInstanceOf[js.Any]).asInstanceOf[DistanceDisplayConditionGeometryInstanceAttribute]
  
  /**
    * Converts a distance display condition to a typed array that can be used to assign a distance display condition attribute.
    * @example
    * const attributes = primitive.getGeometryInstanceAttributes('an id');
    * attributes.distanceDisplayCondition = Cesium.DistanceDisplayConditionGeometryInstanceAttribute.toValue(distanceDisplayCondition, attributes.distanceDisplayCondition);
    * @param distanceDisplayCondition - The distance display condition value.
    * @param [result] - The array to store the result in, if undefined a new instance will be created.
    * @returns The modified result parameter or a new instance if result was undefined.
    */
  inline def toValue(distanceDisplayCondition: DistanceDisplayCondition): js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(distanceDisplayCondition.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
  inline def toValue(distanceDisplayCondition: DistanceDisplayCondition, result: js.typedarray.Float32Array): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(distanceDisplayCondition.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
}
