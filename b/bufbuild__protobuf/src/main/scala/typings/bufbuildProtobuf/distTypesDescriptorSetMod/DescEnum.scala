package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.`enum`
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescEnum
  extends StObject
     with AnyDesc {
  
  /**
    * Marked as deprecated in the protobuf source.
    */
  val deprecated: Boolean
  
  /**
    * The file this enumeration was declared in.
    */
  val file: DescFile
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  var kind: `enum`
  
  /**
    * The name of the enumeration, as declared in the protobuf source.
    */
  val name: String
  
  /**
    * The parent message, if this enumeration was declared inside a message declaration.
    */
  val parent: js.UndefOr[DescMessage] = js.undefined
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: EnumDescriptorProto
  
  /**
    * A prefix shared by all enum values.
    * For example, `MY_ENUM_` for `enum MyEnum {MY_ENUM_A=0; MY_ENUM_B=1;}`
    */
  val sharedPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified name of the enumeration. (We omit the leading dot.)
    */
  val typeName: String
  
  /**
    * Values declared for this enumeration.
    */
  val values: js.Array[DescEnumValue]
}
object DescEnum {
  
  inline def apply(
    deprecated: Boolean,
    file: DescFile,
    getComments: () => DescComments,
    name: String,
    proto: EnumDescriptorProto,
    typeName: String,
    values: js.Array[DescEnumValue]
  ): DescEnum = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "enum", name = name.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescEnum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescEnum] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setFile(value: DescFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setKind(value: `enum`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescMessage): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProto(value: EnumDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setSharedPrefix(value: String): Self = StObject.set(x, "sharedPrefix", value.asInstanceOf[js.Any])
    
    inline def setSharedPrefixUndefined: Self = StObject.set(x, "sharedPrefix", js.undefined)
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[DescEnumValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: DescEnumValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
