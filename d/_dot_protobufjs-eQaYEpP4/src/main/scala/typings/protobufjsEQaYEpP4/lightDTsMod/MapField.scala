package typings.protobufjsEQaYEpP4.lightDTsMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjsEQaYEpP4.mod.Constructor
import typings.protobufjsEQaYEpP4.mod.FieldDecorator
import typings.protobufjsEQaYEpP4.mod.IMapField
import typings.protobufjsEQaYEpP4.mod.Long
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.bool
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.bytes
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.double
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.fixed32
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.fixed64
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.float
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.int32
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.int64
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.sfixed32
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.sfixed64
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.sint32
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.sint64
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.string
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.uint32
import typings.protobufjsEQaYEpP4.protobufjsEQaYEpP4Strings.uint64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".protobufjs-eQaYEpP4/light.d.ts", "MapField")
@js.native
open class MapField protected ()
  extends typings.protobufjsEQaYEpP4.mod.MapField {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String, id: Double, keyType: String, `type`: String) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[Any],
    comment: String
  ) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: Unit, comment: String) = this()
}
/* static members */
object MapField {
  
  @JSImport(".protobufjs-eQaYEpP4/light.d.ts", "MapField")
  @js.native
  val ^ : js.Any = js.native
  
  inline def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | typings.protobufjsEQaYEpP4.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  inline def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | typings.protobufjsEQaYEpP4.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: js.Object
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: StringDictionary[
    Double | Long | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | typings.protobufjsEQaYEpP4.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: Constructor[js.Object]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IMapField): typings.protobufjsEQaYEpP4.mod.MapField = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjsEQaYEpP4.mod.MapField]
}
