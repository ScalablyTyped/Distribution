package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFieldCommon extends StObject {
  
  /**
    * Return a string that (closely) matches the definition of the field in the
    * protobuf source.
    */
  def declarationString(): String
  
  /**
    * Marked as deprecated in the protobuf source.
    */
  val deprecated: Boolean
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  /**
    * A user-defined name for the JSON format, set with the field option
    * [json_name="foo"].
    */
  val jsonName: js.UndefOr[String] = js.undefined
  
  /**
    * The field name, as specified in the protobuf source
    */
  val name: String
  
  /**
    * The field number, as specified in the protobuf source.
    */
  val number: Double
  
  /**
    * The `oneof` group this field belongs to, if any.
    */
  val oneof: js.UndefOr[DescOneof] = js.undefined
  
  /**
    * Whether this field was declared with `optional` in the protobuf source.
    */
  val optional: Boolean
  
  /**
    * Pack this repeated field?
    */
  val packed: Boolean
  
  /**
    * Is this field packed by default? Only valid for enum fields, and for
    * scalar fields except BYTES and STRING.
    * In proto3 syntax, fields are packed by default. In proto2 syntax, fields
    * are unpacked by default.
    */
  val packedByDefault: Boolean
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: FieldDescriptorProto
}
object DescFieldCommon {
  
  inline def apply(
    declarationString: () => String,
    deprecated: Boolean,
    getComments: () => DescComments,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    proto: FieldDescriptorProto
  ): DescFieldCommon = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldCommon] (val x: Self) extends AnyVal {
    
    inline def setDeclarationString(value: () => String): Self = StObject.set(x, "declarationString", js.Any.fromFunction0(value))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOneof(value: DescOneof): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    inline def setOneofUndefined: Self = StObject.set(x, "oneof", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedByDefault(value: Boolean): Self = StObject.set(x, "packedByDefault", value.asInstanceOf[js.Any])
    
    inline def setProto(value: FieldDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
