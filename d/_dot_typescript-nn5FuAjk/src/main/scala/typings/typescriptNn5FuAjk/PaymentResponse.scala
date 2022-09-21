package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is returned after a user selects a payment method and approves a payment request.
  * Available only in secure contexts.
  */
@js.native
trait PaymentResponse
  extends StObject
     with EventTarget {
  
  def complete(): Promise[Unit] = js.native
  def complete(result: PaymentComplete): Promise[Unit] = js.native
  
  val details: Any = js.native
  
  val methodName: java.lang.String = js.native
  
  val requestId: java.lang.String = js.native
  
  def retry(): Promise[Unit] = js.native
  def retry(errorFields: PaymentValidationErrors): Promise[Unit] = js.native
  
  def toJSON(): Any = js.native
}
