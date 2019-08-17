package typings.atAwsDashSdkUtilDashUserDashAgentDashNode

import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-user-agent-node", JSImport.Namespace)
@js.native
object atAwsDashSdkUtilDashUserDashAgentDashNodeMod extends js.Object {
  def appendToUserAgent(request: HttpRequest[Uint8Array], userAgentPartial: String): Unit = js.native
  def defaultUserAgent(packageName: String, packageVersion: String): String = js.native
}

