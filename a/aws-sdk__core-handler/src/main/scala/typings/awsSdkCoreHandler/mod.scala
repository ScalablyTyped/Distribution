package typings.awsSdkCoreHandler

import typings.awsSdkTypes.distTypesMiddlewareMod.Terminalware
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/core-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coreHandler[OutputConstraint /* <: MetadataBearer */, Stream](
    httpHandler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpHandler<Stream> */ Any,
    responseParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponseParser<Stream> */ Any
  ): Terminalware = (^.asInstanceOf[js.Dynamic].applyDynamic("coreHandler")(httpHandler.asInstanceOf[js.Any], responseParser.asInstanceOf[js.Any])).asInstanceOf[Terminalware]
}
