package typings.awsSdkProtocolRest

import typings.awsSdkTypes.httpMod.HttpResponse
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restParserMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseParser<StreamType> * / any */ @JSImport("@aws-sdk/protocol-rest/build/RestParser", "RestParser")
  @js.native
  class RestParser[StreamType] protected () extends StObject {
    def this(
      bodyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser */ js.Any,
      bodyCollector: StreamCollector,
      parseServiceException: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceExceptionParser */ js.Any,
      utf8Encoder: Encoder,
      base64Decoder: Decoder
    ) = this()
    
    val base64Decoder: js.Any = js.native
    
    val bodyCollector: js.Any = js.native
    
    val bodyParser: js.Any = js.native
    
    def parse[OutputType /* <: MetadataBearer */](
      operation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel */ js.Any,
      input: HttpResponse
    ): js.Promise[OutputType] = js.native
    
    var parseBody: js.Any = js.native
    
    var parseHeaders: js.Any = js.native
    
    var parseScalarBody: js.Any = js.native
    
    var parseScalarHeader: js.Any = js.native
    
    val parseServiceException: js.Any = js.native
    
    var parseStatusCode: js.Any = js.native
    
    var resolveBody: js.Any = js.native
    
    var resolveBodyString: js.Any = js.native
    
    var responseIsSuccessful: js.Any = js.native
    
    val utf8Encoder: js.Any = js.native
  }
}
