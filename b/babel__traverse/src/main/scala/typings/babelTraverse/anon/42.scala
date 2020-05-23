package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `42` extends js.Object {
  var `type`: DeclareClass
}

object `42` {
  @scala.inline
  def apply(`type`: DeclareClass): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`42`]
  }
}

