package typings.contractProxyKit

import org.scalablytyped.runtime.Instantiable1
import typings.ethers.mod.ethers.providers.Provider
import typings.ethers.typesMod.Networkish
import typings.ethers.typesMod.TransactionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassProvider extends Instantiable1[/* network */ Networkish, Provider] {
  def checkTransactionResponse(transaction: js.Any): TransactionResponse = js.native
}

