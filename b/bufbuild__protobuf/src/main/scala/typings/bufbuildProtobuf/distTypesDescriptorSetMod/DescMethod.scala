package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.rpc
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MethodDescriptorProto
import typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodIdempotency
import typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescMethod
  extends StObject
     with AnyDesc {
  
  /**
    * Marked as deprecated in the protobuf source.
    */
  val deprecated: Boolean
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  /**
    * The idempotency level declared in the protobuf source, if any.
    */
  val idempotency: js.UndefOr[MethodIdempotency] = js.undefined
  
  /**
    * The message type for requests.
    */
  val input: DescMessage
  
  var kind: rpc
  
  /**
    * One of the four available method types.
    */
  val methodKind: MethodKind
  
  /**
    * The name of the RPC, as specified in the protobuf source.
    */
  val name: String
  
  /**
    * The message type for responses.
    */
  val output: DescMessage
  
  /**
    * The parent service.
    */
  val parent: DescService
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: MethodDescriptorProto
}
object DescMethod {
  
  inline def apply(
    deprecated: Boolean,
    getComments: () => DescComments,
    input: DescMessage,
    methodKind: MethodKind,
    name: String,
    output: DescMessage,
    parent: DescService,
    proto: MethodDescriptorProto
  ): DescMethod = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), input = input.asInstanceOf[js.Any], kind = "rpc", methodKind = methodKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescMethod] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setIdempotency(value: MethodIdempotency): Self = StObject.set(x, "idempotency", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyUndefined: Self = StObject.set(x, "idempotency", js.undefined)
    
    inline def setInput(value: DescMessage): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setKind(value: rpc): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMethodKind(value: MethodKind): Self = StObject.set(x, "methodKind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: DescMessage): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescService): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setProto(value: MethodDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
  }
}
