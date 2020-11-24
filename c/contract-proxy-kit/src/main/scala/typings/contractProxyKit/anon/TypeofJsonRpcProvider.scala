package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.ethers.mod.ethers.providers.JsonRpcProvider
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofJsonRpcProvider extends Instantiable0[JsonRpcProvider] {
  
  def defaultUrl(): String = js.native
  
  def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String] = js.native
  def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String] = js.native
}
