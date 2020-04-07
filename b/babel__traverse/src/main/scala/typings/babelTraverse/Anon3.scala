package typings.babelTraverse

import typings.babelTraverse.babelTraverseStrings.MixedTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var `type`: MixedTypeAnnotation
}

object Anon3 {
  @scala.inline
  def apply(`type`: MixedTypeAnnotation): Anon3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

