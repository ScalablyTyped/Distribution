package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Networks")
@js.native
object NetworksNs extends js.Object {
  trait Network extends js.Object {
    val alias: java.lang.String
    val name: java.lang.String
  }
  
  val livenet: Network = js.native
  val mainnet: Network = js.native
  val testnet: Network = js.native
  def add(data: js.Any): Network = js.native
  def get(args: Network, keys: java.lang.String): Network = js.native
  def get(args: Network, keys: js.Array[java.lang.String]): Network = js.native
  def get(args: java.lang.String, keys: java.lang.String): Network = js.native
  def get(args: java.lang.String, keys: js.Array[java.lang.String]): Network = js.native
  def get(args: scala.Double, keys: java.lang.String): Network = js.native
  def get(args: scala.Double, keys: js.Array[java.lang.String]): Network = js.native
  def remove(network: Network): scala.Unit = js.native
}

