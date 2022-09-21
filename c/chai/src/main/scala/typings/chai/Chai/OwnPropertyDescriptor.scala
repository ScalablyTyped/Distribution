package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnPropertyDescriptor extends StObject {
  
  def apply(name: String): Assertion = js.native
  def apply(name: String, descriptor: js.PropertyDescriptor): Assertion = js.native
  def apply(name: String, descriptor: js.PropertyDescriptor, message: String): Assertion = js.native
  def apply(name: String, message: String): Assertion = js.native
  def apply(name: js.Symbol): Assertion = js.native
  def apply(name: js.Symbol, descriptor: js.PropertyDescriptor): Assertion = js.native
  def apply(name: js.Symbol, descriptor: js.PropertyDescriptor, message: String): Assertion = js.native
  def apply(name: js.Symbol, message: String): Assertion = js.native
}
