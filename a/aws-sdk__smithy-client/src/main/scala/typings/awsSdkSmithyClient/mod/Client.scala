package typings.awsSdkSmithyClient.mod

import typings.awsSdkSmithyClient.clientMod.SmithyResolvedConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/smithy-client", "Client")
@js.native
class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
  extends typings.awsSdkSmithyClient.clientMod.Client[HandlerOptions, ClientInput, ClientOutput, ResolvedClientConfiguration] {
  def this(config: ResolvedClientConfiguration) = this()
}
