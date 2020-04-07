package typings.babelTraverse

import typings.babelTraverse.babelTraverseStrings.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: TSInferType
}

object AnonType {
  @scala.inline
  def apply(`type`: TSInferType): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

