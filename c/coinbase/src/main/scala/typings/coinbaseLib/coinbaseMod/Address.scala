package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "Address")
@js.native
class Address () extends Resource {
  /**
    * Bitcoin, Litecoin or Ethereum address
    */
  var address: java.lang.String = js.native
  /**
    * User defined label for the address
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * Resource type
    */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  /**
    * Type of resource, constant string "address"
    */
  @JSName("resource")
  var resource_Address: coinbaseLib.coinbaseLibStrings.address = js.native
  /**
    * List transactions that have been sent to a specific address.
    * Scope: wallet:transactions:read
    */
  def getTransactions(
    opts: js.Object,
    cb: js.Function2[
      /* error */ stdLib.Error | scala.Null, 
      /* result */ js.Array[Transaction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

