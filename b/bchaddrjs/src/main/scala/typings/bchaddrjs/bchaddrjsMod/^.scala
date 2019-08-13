package typings.bchaddrjs.bchaddrjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bchaddrjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def detectAddressFormat(address: String): String = js.native
  def detectAddressNetwork(address: String): String = js.native
  def detectAddressType(address: String): String = js.native
  def isBitpayAddress(address: String): Boolean = js.native
  def isCashAddress(address: String): Boolean = js.native
  def isLegacyAddress(address: String): Boolean = js.native
  def isMainnetAddress(address: String): Boolean = js.native
  def isP2PKHAddress(address: String): Boolean = js.native
  def isP2SHAddress(address: String): Boolean = js.native
  def isTestnetAddress(address: String): Boolean = js.native
  def isValidAddress(input: js.Any): Boolean = js.native
  def toBitpayAddress(address: String): String = js.native
  def toCashAddress(address: String): String = js.native
  def toLegacyAddress(address: String): String = js.native
}

