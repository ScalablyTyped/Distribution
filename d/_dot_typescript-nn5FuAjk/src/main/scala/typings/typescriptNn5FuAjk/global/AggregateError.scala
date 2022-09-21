package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.AggregateErrorConstructor
import typings.typescriptNn5FuAjk.ErrorOptions
import typings.typescriptNn5FuAjk.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AggregateError")
@js.native
open class AggregateError protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.AggregateError {
  def this(errors: Iterable[Any]) = this()
  def this(errors: Iterable[Any], message: java.lang.String) = this()
  def this(errors: Iterable[Any], message: java.lang.String, options: ErrorOptions) = this()
  def this(errors: Iterable[Any], message: Unit, options: ErrorOptions) = this()
  
  /* CompleteClass */
  var errors: typings.typescriptNn5FuAjk.Array[Any] = js.native
  
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* CompleteClass */
  var name: java.lang.String = js.native
}
object AggregateError {
  
  inline def apply: AggregateErrorConstructor = js.Dynamic.global.selectDynamic("AggregateError").asInstanceOf[AggregateErrorConstructor]
}
