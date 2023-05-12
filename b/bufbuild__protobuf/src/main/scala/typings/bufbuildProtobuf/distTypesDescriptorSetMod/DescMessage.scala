package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescMessage
  extends StObject
     with AnyDesc {
  
  /**
    * Marked as deprecated in the protobuf source.
    */
  val deprecated: Boolean
  
  /**
    * Fields declared for this message, including fields declared in a oneof
    * group.
    */
  val fields: js.Array[DescField]
  
  /**
    * The file this message was declared in.
    */
  val file: DescFile
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  var kind: message_
  
  /**
    * Fields and oneof groups for this message, ordered by their appearance in the
    * protobuf source.
    */
  val members: js.Array[DescField | DescOneof]
  
  /**
    * The name of the message, as specified in the protobuf source.
    */
  val name: String
  
  /**
    * Enumerations declared within the message, if any.
    */
  val nestedEnums: js.Array[DescEnum]
  
  /**
    * Extensions declared within the message, if any.
    */
  val nestedExtensions: js.Array[DescExtension]
  
  /**
    * Messages declared within the message, if any.
    * This does not include synthetic messages like map entries.
    */
  val nestedMessages: js.Array[DescMessage]
  
  /**
    * Oneof groups declared for this message.
    * This does not include synthetic oneofs for proto3 optionals.
    */
  val oneofs: js.Array[DescOneof]
  
  /**
    * The parent message, if this message was declared inside a message declaration.
    */
  val parent: js.UndefOr[DescMessage] = js.undefined
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: DescriptorProto
  
  /**
    * The fully qualified name of the message. (We omit the leading dot.)
    */
  val typeName: String
}
object DescMessage {
  
  inline def apply(
    deprecated: Boolean,
    fields: js.Array[DescField],
    file: DescFile,
    getComments: () => DescComments,
    members: js.Array[DescField | DescOneof],
    name: String,
    nestedEnums: js.Array[DescEnum],
    nestedExtensions: js.Array[DescExtension],
    nestedMessages: js.Array[DescMessage],
    oneofs: js.Array[DescOneof],
    proto: DescriptorProto,
    typeName: String
  ): DescMessage = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "message", members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestedEnums = nestedEnums.asInstanceOf[js.Any], nestedExtensions = nestedExtensions.asInstanceOf[js.Any], nestedMessages = nestedMessages.asInstanceOf[js.Any], oneofs = oneofs.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescMessage] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[DescField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: DescField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFile(value: DescFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setKind(value: message_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[DescField | DescOneof]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: (DescField | DescOneof)*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNestedEnums(value: js.Array[DescEnum]): Self = StObject.set(x, "nestedEnums", value.asInstanceOf[js.Any])
    
    inline def setNestedEnumsVarargs(value: DescEnum*): Self = StObject.set(x, "nestedEnums", js.Array(value*))
    
    inline def setNestedExtensions(value: js.Array[DescExtension]): Self = StObject.set(x, "nestedExtensions", value.asInstanceOf[js.Any])
    
    inline def setNestedExtensionsVarargs(value: DescExtension*): Self = StObject.set(x, "nestedExtensions", js.Array(value*))
    
    inline def setNestedMessages(value: js.Array[DescMessage]): Self = StObject.set(x, "nestedMessages", value.asInstanceOf[js.Any])
    
    inline def setNestedMessagesVarargs(value: DescMessage*): Self = StObject.set(x, "nestedMessages", js.Array(value*))
    
    inline def setOneofs(value: js.Array[DescOneof]): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
    
    inline def setOneofsVarargs(value: DescOneof*): Self = StObject.set(x, "oneofs", js.Array(value*))
    
    inline def setParent(value: DescMessage): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProto(value: DescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
