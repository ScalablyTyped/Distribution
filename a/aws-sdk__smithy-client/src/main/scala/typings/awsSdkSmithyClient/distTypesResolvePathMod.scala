package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolvePathMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/resolve-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolvedPath(
    resolvedPath: String,
    input: Any,
    memberName: String,
    labelValueProvider: js.Function0[js.UndefOr[String]],
    uriLabel: String,
    isGreedyLabel: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvedPath")(resolvedPath.asInstanceOf[js.Any], input.asInstanceOf[js.Any], memberName.asInstanceOf[js.Any], labelValueProvider.asInstanceOf[js.Any], uriLabel.asInstanceOf[js.Any], isGreedyLabel.asInstanceOf[js.Any])).asInstanceOf[String]
}
