package typings.babelTraverse

import typings.babelTraverse.babelTraverseStrings.ClassBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon32 extends js.Object {
  var `type`: ClassBody
}

object Anon32 {
  @scala.inline
  def apply(`type`: ClassBody): Anon32 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon32]
  }
}

