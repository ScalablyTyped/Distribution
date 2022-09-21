package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.PromiseFulfilledResult[T]
  - typings.typescriptNn5FuAjk.PromiseRejectedResult
*/
trait PromiseSettledResult[T] extends StObject
object PromiseSettledResult {
  
  inline def PromiseFulfilledResult[T](value: T): typings.typescriptNn5FuAjk.PromiseFulfilledResult[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.PromiseFulfilledResult[T]]
  }
  
  inline def PromiseRejectedResult(reason: Any): typings.typescriptNn5FuAjk.PromiseRejectedResult = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.PromiseRejectedResult]
  }
}
