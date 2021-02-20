package typings.awsSdkProtocolJsonRpc

import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/protocol-json-rpc", "JsonRpcParser")
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
  
  @JSImport("@aws-sdk/protocol-json-rpc", "JsonRpcSerializer")
  @js.native
  class JsonRpcSerializer[StreamType] protected ()
    extends typings.awsSdkProtocolJsonRpc.jsonRpcSerializerMod.JsonRpcSerializer[StreamType] {
    def this(
      endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any,
      bodySerializer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer */ js.Any
    ) = this()
  }
}
