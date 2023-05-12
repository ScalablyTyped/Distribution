package typings.cesium.mod

import typings.cesium.anon.ArrayLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "MetadataClassProperty")
@js.native
open class MetadataClassProperty protected () extends StObject {
  def this(options: ArrayLength) = this()
  
  /**
    * A default value to use when an entity's property value is not defined.
    */
  val default: Boolean | Double | String | js.Array[Any] = js.native
  
  /**
    * The number of array elements. Only defined for fixed-size
    * arrays.
    */
  val arrayLength: Double = js.native
  
  /**
    * The component type of the property. This includes integer
    * (e.g. INT8 or UINT16), and floating point (FLOAT32 and FLOAT64) values
    */
  val componentType: MetadataComponentType = js.native
  
  /**
    * The description of the property.
    */
  val description: String = js.native
  
  /**
    * The enum type of the property. Only defined when type is ENUM.
    */
  val enumType: MetadataEnum = js.native
  
  /**
    * An object containing extensions.
    */
  val extensions: Any = js.native
  
  /**
    * Extra user-defined properties.
    */
  val extras: Any = js.native
  
  /**
    * The ID of the property.
    */
  val id: String = js.native
  
  /**
    * True if a property is an array (either fixed length or variable length),
    * false otherwise.
    */
  val isArray: Boolean = js.native
  
  /**
    * True if a property is a variable length array, false otherwise.
    */
  val isVariableLengthArray: Boolean = js.native
  
  /**
    * A number or an array of numbers storing the maximum allowable value of this property. Only defined when type is a numeric type.
    */
  val max: Double | (js.Array[js.Array[Double] | Double]) = js.native
  
  /**
    * A number or an array of numbers storing the minimum allowable value of this property. Only defined when type is a numeric type.
    */
  val min: Double | (js.Array[js.Array[Double] | Double]) = js.native
  
  /**
    * The name of the property.
    */
  val name: String = js.native
  
  /**
    * The no-data sentinel value that represents null values
    */
  val noData: Boolean | Double | String | js.Array[Any] = js.native
  
  /**
    * Whether the property is normalized.
    */
  val normalized: Boolean = js.native
  
  /**
    * The offset to be added to property values as part of the value transform.
    */
  val offset: Double | (js.Array[js.Array[Double] | Double]) = js.native
  
  /**
    * Whether the property is required.
    */
  val required: Boolean = js.native
  
  /**
    * The scale to be multiplied to property values as part of the value transform.
    */
  val scale: Double | (js.Array[js.Array[Double] | Double]) = js.native
  
  /**
    * An identifier that describes how this property should be interpreted.
    */
  val semantic: String = js.native
  
  /**
    * The type of the property such as SCALAR, VEC2, VEC3
    */
  val `type`: MetadataType = js.native
}
