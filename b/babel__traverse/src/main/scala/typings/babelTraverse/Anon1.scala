package typings.babelTraverse

import typings.babelTraverse.babelTraverseStrings.TSTypeAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var `type`: TSTypeAssertion
}

object Anon1 {
  @scala.inline
  def apply(`type`: TSTypeAssertion): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

