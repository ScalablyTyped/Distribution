package typings.awsSdkProtocolJsonRpc

import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-json-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class JsonRpcParser[StreamType] protected ()
    extends typings.awsSdkProtocolJsonRpc.jsonRpcParserMod.JsonRpcParser[StreamType] {
    def this(
      bodyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser */ js.Any,
      parseServiceException: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceExceptionParser */ js.Any,
      bodyCollector: StreamCollector,
      utf8Encoder: Encoder
    ) = this()
  }
  
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends typings.awsSdkProtocolJsonRpc.jsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
    def this(
      endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any,
      bodySerializer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer */ js.Any
    ) = this()
  }
}
