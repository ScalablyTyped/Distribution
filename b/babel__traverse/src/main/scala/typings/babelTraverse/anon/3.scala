package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MixedTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var `type`: MixedTypeAnnotation
}

object `3` {
  @scala.inline
  def apply(`type`: MixedTypeAnnotation): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

