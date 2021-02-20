package typings.awsSdkProtocolRest

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.serdeMod.RequestSerializer
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restSerializerMod {
  
  @JSImport("@aws-sdk/protocol-rest/build/RestSerializer", "RestSerializer")
  @js.native
  class RestSerializer[StreamType] protected ()
    extends RequestSerializer[StreamType, js.Any] {
    def this(
      endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any,
      bodySerializer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer<string> */ js.Any,
      base64Encoder: Encoder,
      utf8Decoder: Decoder
    ) = this()
    
    /* CompleteClass */
    override def apply(T0: /* input */ js.Any, T1: js.Any): js.Promise[StreamType] = js.native
    
    val base64Encoder: js.Any = js.native
    
    val bodySerializer: js.Any = js.native
    
    val endpoint: js.Any = js.native
    
    /**
      * Used to parse modeled paths that already include query strings.
      * Does not attempt to unescape values.
      * @param queryString
      */
    var parseQueryString: js.Any = js.native
    
    var populateHeader: js.Any = js.native
    
    var populateQuery: js.Any = js.native
    
    var populateUri: js.Any = js.native
    
    def serialize(
      operation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperationModel */ js.Any,
      input: js.Any
    ): HttpRequest = js.native
    
    var serializeBody: js.Any = js.native
    
    var serializeNonBody: js.Any = js.native
    
    var utf8Decoder: js.Any = js.native
  }
  
  type UserInput = StringDictionary[js.Any]
}
