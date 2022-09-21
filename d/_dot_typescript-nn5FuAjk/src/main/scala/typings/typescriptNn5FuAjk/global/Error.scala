package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.ErrorConstructor
import typings.typescriptNn5FuAjk.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Error")
@js.native
open class Error ()
  extends StObject
     with typings.typescriptNn5FuAjk.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, options: ErrorOptions) = this()
  def this(message: Unit, options: ErrorOptions) = this()
  
  /* CompleteClass */
  var message: java.lang.String = js.native
  
  /* CompleteClass */
  var name: java.lang.String = js.native
}
object Error {
  
  inline def apply: ErrorConstructor = js.Dynamic.global.selectDynamic("Error").asInstanceOf[ErrorConstructor]
}
