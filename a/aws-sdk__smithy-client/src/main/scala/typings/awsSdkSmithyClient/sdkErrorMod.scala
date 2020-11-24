package typings.awsSdkSmithyClient

import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/smithy-client/dist/cjs/sdk-error", JSImport.Namespace)
@js.native
object sdkErrorMod extends js.Object {
  
  type SdkError = Error with SmithyException with MetadataBearer
}
