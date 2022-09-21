package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coinbase", "Address")
@js.native
open class Address ()
  extends StObject
     with Resource {
  
  /**
    * Bitcoin, Litecoin or Ethereum address
    */
  var address: String = js.native
  
  def getTransactions(
    pagination: Null,
    cb: js.Function3[
      /* error */ js.Error | Null, 
      /* result */ js.Array[Transaction], 
      /* pagination */ Pagination, 
      Unit
    ]
  ): Unit = js.native
  /**
    * List transactions that have been sent to a specific address.
    * Scope: wallet:transactions:read
    */
  def getTransactions(
    pagination: Pagination,
    cb: js.Function3[
      /* error */ js.Error | Null, 
      /* result */ js.Array[Transaction], 
      /* pagination */ Pagination, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * User defined label for the address
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Resource type
    */
  /* CompleteClass */
  var resource: ResourceType = js.native
  /**
    * Type of resource, constant string "address"
    */
  @JSName("resource")
  var resource_Address: address = js.native
}
