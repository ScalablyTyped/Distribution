package typings.babelTraverse

import typings.babelTraverse.babelTraverseStrings.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon123 extends js.Object {
  var `type`: TypeParameterDeclaration
}

object Anon123 {
  @scala.inline
  def apply(`type`: TypeParameterDeclaration): Anon123 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon123]
  }
}

