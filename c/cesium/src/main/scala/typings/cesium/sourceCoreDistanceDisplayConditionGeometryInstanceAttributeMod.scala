package typings.cesium

import typings.cesium.mod.DistanceDisplayCondition
import typings.cesium.mod.DistanceDisplayConditionGeometryInstanceAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreDistanceDisplayConditionGeometryInstanceAttributeMod {
  
  @JSImport("cesium/Source/Core/DistanceDisplayConditionGeometryInstanceAttribute", JSImport.Default)
  @js.native
  open class default () extends DistanceDisplayConditionGeometryInstanceAttribute {
    def this(near: Double) = this()
    def this(near: Double, far: Double) = this()
    def this(near: Unit, far: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/DistanceDisplayConditionGeometryInstanceAttribute", JSImport.Default)
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
}
