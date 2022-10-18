package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.ethers.mod.ethers.providers.JsonRpcProvider
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectTransactions.mod.AccessList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofJsonRpcProvider
  extends StObject
     with Instantiable0[JsonRpcProvider] {
  
  def defaultUrl(): String = js.native
  
  def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String | AccessList] = js.native
  def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String | AccessList] = js.native
}
