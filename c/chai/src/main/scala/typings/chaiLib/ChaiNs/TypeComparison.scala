package typings
package chaiLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeComparison extends js.Object {
  @JSName("instanceOf")
  var instanceOf_Original: InstanceOf = js.native
  @JSName("instanceof")
  var instanceof_Original: InstanceOf = js.native
  def apply(`type`: java.lang.String): Assertion = js.native
  def apply(`type`: java.lang.String, message: java.lang.String): Assertion = js.native
  def instanceOf(constructor: chaiLib.Object): Assertion = js.native
  def instanceOf(constructor: chaiLib.Object, message: java.lang.String): Assertion = js.native
  def instanceof(constructor: chaiLib.Object): Assertion = js.native
  def instanceof(constructor: chaiLib.Object, message: java.lang.String): Assertion = js.native
}

