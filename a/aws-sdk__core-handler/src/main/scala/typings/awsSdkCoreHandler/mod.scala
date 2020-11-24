package typings.awsSdkCoreHandler

import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/core-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](
    httpHandler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpHandler<Stream> */ js.Any,
    responseParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseParser<Stream> */ js.Any
  ): Terminalware = js.native
}
