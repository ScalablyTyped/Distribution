package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: TSInferType
}

object Type {
  @scala.inline
  def apply(`type`: TSInferType): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

