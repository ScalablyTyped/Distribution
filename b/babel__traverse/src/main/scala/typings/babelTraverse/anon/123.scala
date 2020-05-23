package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `123` extends js.Object {
  var `type`: TypeParameterDeclaration
}

object `123` {
  @scala.inline
  def apply(`type`: TypeParameterDeclaration): `123` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`123`]
  }
}

