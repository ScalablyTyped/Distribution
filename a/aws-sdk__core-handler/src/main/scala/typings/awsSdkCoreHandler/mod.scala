package typings.awsSdkCoreHandler

import typings.awsSdkTypes.middlewareMod.Terminalware
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/core-handler", "coreHandler")
  @js.native
  def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](
    httpHandler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpHandler<Stream> */ js.Any,
    responseParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseParser<Stream> */ js.Any
  ): Terminalware = js.native
}
