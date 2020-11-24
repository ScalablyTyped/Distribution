package typings.awsSdkRoute53IdNormalizerMiddleware.mod

import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/route53-id-normalizer-middleware", "idNormalizerMiddleware")
@js.native
object idNormalizerMiddleware extends js.Object {
  
  def apply[Input /* <: IdentifierBearer */, Output /* <: js.Object */](next: Handler[Input, Output]): Handler[Input, Output] = js.native
}
