package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ethers.mod.ethers.Transaction
import typings.ethers.typesTransactionTransactionMod.TransactionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTransaction
  extends StObject
     with Instantiable0[Transaction] {
  
  /**
    *  Create a **Transaction** from a serialized transaction or a
    *  Transaction-like object.
    */
  def from(): typings.ethers.typesTransactionTransactionMod.Transaction = js.native
  def from(tx: String): typings.ethers.typesTransactionTransactionMod.Transaction = js.native
  def from(tx: TransactionLike[String]): typings.ethers.typesTransactionTransactionMod.Transaction = js.native
}
