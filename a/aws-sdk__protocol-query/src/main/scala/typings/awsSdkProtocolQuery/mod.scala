package typings.awsSdkProtocolQuery

import typings.awsSdkTypes.serdeMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/protocol-query", "QueryParser")
  @js.native
  class QueryParser[StreamType] protected ()
    extends typings.awsSdkProtocolQuery.queryParserMod.QueryParser[StreamType] {
    def this(
      bodyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser */ js.Any,
      parseServiceException: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceExceptionParser */ js.Any,
      streamCollector: StreamCollector,
      utf8Encoder: Encoder
    ) = this()
  }
  
  @JSImport("@aws-sdk/protocol-query", "QuerySerializer")
  @js.native
  class QuerySerializer[StreamType] protected ()
    extends typings.awsSdkProtocolQuery.querySerializerMod.QuerySerializer[StreamType] {
    def this(
      endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any,
      bodySerializer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer<string> */ js.Any
    ) = this()
  }
}
