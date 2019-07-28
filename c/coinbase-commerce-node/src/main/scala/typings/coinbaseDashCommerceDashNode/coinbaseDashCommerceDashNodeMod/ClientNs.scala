package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase-commerce-node", "Client")
@js.native
object ClientNs extends js.Object {
  /**
    * Setup client.
    */
  def init(apiKey: String): Options = js.native
  def init(apiKey: String, baseApiUrl: String): Options = js.native
  def init(apiKey: String, baseApiUrl: String, apiVersion: String): Options = js.native
  def init(apiKey: String, baseApiUrl: String, apiVersion: String, timeout: Double): Options = js.native
}

