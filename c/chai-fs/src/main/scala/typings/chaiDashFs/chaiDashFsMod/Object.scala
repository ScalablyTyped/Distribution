package typings.chaiDashFs.chaiDashFsMod

import typings.chaiDashFs.chaiDashFsMod.Global.ChaiNs.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var should: Assertion
}

object Object {
  @scala.inline
  def apply(should: Assertion): Object = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Object]
  }
}

