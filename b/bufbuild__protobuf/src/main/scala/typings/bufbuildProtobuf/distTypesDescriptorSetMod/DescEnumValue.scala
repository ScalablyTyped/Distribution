package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.enum_value
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumValueDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescEnumValue
  extends StObject
     with AnyDesc {
  
  /**
    * Return a string that (closely) matches the definition of the enumeration
    * value in the protobuf source.
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
  
  var kind: enum_value
  
  /**
    * The name of the enumeration value, as specified in the protobuf source.
    */
  val name: String
  
  /**
    * The numeric enumeration value, as specified in the protobuf source.
    */
  val number: Double
  
  /**
    * The enumeration this value belongs to.
    */
  val parent: DescEnum
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: EnumValueDescriptorProto
}
object DescEnumValue {
  
  inline def apply(
    declarationString: () => String,
    deprecated: Boolean,
    getComments: () => DescComments,
    name: String,
    number: Double,
    parent: DescEnum,
    proto: EnumValueDescriptorProto
  ): DescEnumValue = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "enum_value", name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescEnumValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescEnumValue] (val x: Self) extends AnyVal {
    
    inline def setDeclarationString(value: () => String): Self = StObject.set(x, "declarationString", js.Any.fromFunction0(value))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setKind(value: enum_value): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescEnum): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setProto(value: EnumValueDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
