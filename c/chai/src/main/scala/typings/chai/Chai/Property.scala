package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property extends StObject {
  
  def apply(name: String): Assertion = js.native
  def apply(name: String, message: String): Assertion = js.native
  def apply(name: String, value: Any): Assertion = js.native
  def apply(name: String, value: Any, message: String): Assertion = js.native
  def apply(name: js.Symbol): Assertion = js.native
  def apply(name: js.Symbol, message: String): Assertion = js.native
  def apply(name: js.Symbol, value: Any): Assertion = js.native
  def apply(name: js.Symbol, value: Any, message: String): Assertion = js.native
}
