package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var `type`: TSTypeAssertion
}

object `1` {
  @scala.inline
  def apply(`type`: TSTypeAssertion): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

