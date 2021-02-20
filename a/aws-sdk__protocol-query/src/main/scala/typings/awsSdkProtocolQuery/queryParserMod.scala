package typings.awsSdkProtocolQuery

import typings.awsSdkTypes.httpMod.HttpResponse
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryParserMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseParser<StreamType> * / any */ @JSImport("@aws-sdk/protocol-query/build/QueryParser", "QueryParser")
  @js.native
  class QueryParser[StreamType] protected () extends StObject {
    def this(
      bodyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser */ js.Any,
      parseServiceException: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceExceptionParser */ js.Any,
      streamCollector: StreamCollector,
      utf8Encoder: Encoder
    ) = this()
    
    val bodyParser: js.Any = js.native
    
    def parse[OutputType /* <: MetadataBearer */](
      operation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel */ js.Any,
      input: HttpResponse
    ): js.Promise[OutputType] = js.native
    
    val parseServiceException: js.Any = js.native
    
    var resolveBodyString: js.Any = js.native
    
    val streamCollector: js.Any = js.native
    
    var updateMetadata: js.Any = js.native
    
    val utf8Encoder: js.Any = js.native
  }
}
