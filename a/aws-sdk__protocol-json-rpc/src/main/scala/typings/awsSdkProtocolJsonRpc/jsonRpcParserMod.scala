package typings.awsSdkProtocolJsonRpc

import typings.awsSdkTypes.httpMod.HttpResponse
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-json-rpc/build/JsonRpcParser", JSImport.Namespace)
@js.native
object jsonRpcParserMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseParser<StreamType> * / any */ @js.native
  class JsonRpcParser[StreamType] protected () extends js.Object {
    def this(
      bodyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser */ js.Any,
      parseServiceException: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceExceptionParser */ js.Any,
      bodyCollector: StreamCollector,
      utf8Encoder: Encoder
    ) = this()
    
    val bodyCollector: js.Any = js.native
    
    val bodyParser: js.Any = js.native
    
    def parse[OutputType /* <: MetadataBearer */](
      operation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel */ js.Any,
      input: HttpResponse
    ): js.Promise[OutputType] = js.native
    
    val parseServiceException: js.Any = js.native
    
    var resolveBodyString: js.Any = js.native
    
    val utf8Encoder: js.Any = js.native
  }
}
