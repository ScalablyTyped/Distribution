package typings.awsSdkProtocolQuery

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.serdeMod.RequestSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-query/build/QuerySerializer", JSImport.Namespace)
@js.native
object querySerializerMod extends js.Object {
  
  @js.native
  class QuerySerializer[StreamType] protected ()
    extends RequestSerializer[StreamType, js.Any] {
    def this(
      endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpEndpoint */ js.Any,
      bodySerializer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodySerializer<string> */ js.Any
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
