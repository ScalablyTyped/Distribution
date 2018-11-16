package typings
package chaiDashThingsLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayAssertion extends js.Object {
  var all: chaiLib.ChaiNs.Assertion = js.native
  @JSName("contain")
  var contain_Original: ArrayInclude = js.native
  @JSName("include")
  var include_Original: ArrayInclude = js.native
  var not: ArrayAssertion = js.native
  def contain(item: js.Any): js.Any = js.native
  def include(item: js.Any): js.Any = js.native
}

