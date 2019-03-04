package typings
package chaiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var should: chaiLib.ChaiNs.Assertion
}

object Object {
  @scala.inline
  def apply(should: chaiLib.ChaiNs.Assertion): Object = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Object]
  }
}

