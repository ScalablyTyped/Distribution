package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ReadableStreamDefaultReadValueResult[T]
  - typings.typescriptNn5FuAjk.ReadableStreamDefaultReadDoneResult
*/
trait ReadableStreamDefaultReadResult[T] extends StObject
object ReadableStreamDefaultReadResult {
  
  inline def ReadableStreamDefaultReadDoneResult(value: Unit): typings.typescriptNn5FuAjk.ReadableStreamDefaultReadDoneResult = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ReadableStreamDefaultReadDoneResult]
  }
  
  inline def ReadableStreamDefaultReadValueResult[T](value: T): typings.typescriptNn5FuAjk.ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ReadableStreamDefaultReadValueResult[T]]
  }
}
