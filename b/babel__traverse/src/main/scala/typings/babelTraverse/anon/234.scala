package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `234` extends js.Object {
  var `type`: ObjectTypeAnnotation
}

object `234` {
  @scala.inline
  def apply(`type`: ObjectTypeAnnotation): `234` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`234`]
  }
}

