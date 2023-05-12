package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.oneof
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.OneofDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescOneof
  extends StObject
     with AnyDesc {
  
  /**
    * Marked as deprecated in the protobuf source.
    * Note that oneof groups cannot be marked as deprecated, this property
    * only exists for consistency and will always be false.
    */
  val deprecated: Boolean
  
  /**
    * The fields declared in this oneof group.
    */
  val fields: js.Array[DescField]
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  var kind: oneof
  
  /**
    * The name of the oneof group, as specified in the protobuf source.
    */
  val name: String
  
  /**
    * The message this oneof group was declared in.
    */
  val parent: DescMessage
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: OneofDescriptorProto
}
object DescOneof {
  
  inline def apply(
    deprecated: Boolean,
    fields: js.Array[DescField],
    getComments: () => DescComments,
    name: String,
    parent: DescMessage,
    proto: OneofDescriptorProto
  ): DescOneof = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "oneof", name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescOneof]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescOneof] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[DescField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: DescField*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setKind(value: oneof): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescMessage): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setProto(value: OneofDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
