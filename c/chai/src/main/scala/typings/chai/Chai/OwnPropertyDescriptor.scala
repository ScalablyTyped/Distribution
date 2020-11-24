package typings.chai.Chai

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnPropertyDescriptor extends js.Object {
  
  def apply(name: String): Assertion = js.native
  def apply(name: String, descriptor: PropertyDescriptor): Assertion = js.native
  def apply(name: String, descriptor: PropertyDescriptor, message: String): Assertion = js.native
  def apply(name: String, message: String): Assertion = js.native
}
