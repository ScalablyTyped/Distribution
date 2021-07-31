package typings.chai.Chai

import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnPropertyDescriptor extends StObject {
  
  def apply(name: String): Assertion = js.native
  def apply(name: String, descriptor: PropertyDescriptor): Assertion = js.native
  def apply(name: String, descriptor: PropertyDescriptor, message: String): Assertion = js.native
  def apply(name: String, message: String): Assertion = js.native
}
