package typings.awsSdkProtocolJsonRpc

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.serdeMod.RequestSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-json-rpc/build/JsonRpcSerializer", JSImport.Namespace)
@js.native
object jsonRpcSerializerMod extends js.Object {
  
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends RequestSerializer[StreamType, js.Any] {
    def this(
      endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any,
      bodySerializer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer */ js.Any
    ) = this()
    
    /* CompleteClass */
    override def apply(T0: /* input */ js.Any, T1: js.Any): js.Promise[StreamType] = js.native
    
    val bodySerializer: js.Any = js.native
    
    val endpoint: js.Any = js.native
    
    def serialize(
      operation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel */ js.Any,
      input: js.Any
    ): HttpRequest = js.native
  }
}
