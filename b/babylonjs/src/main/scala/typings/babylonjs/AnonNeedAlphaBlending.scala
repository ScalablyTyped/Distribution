package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNeedAlphaBlending extends js.Object {
  var needAlphaBlending: Boolean
  var needAlphaTesting: Boolean
  var needWorldViewMatrix: Boolean
  var needWorldViewProjectionMatrix: Boolean
}

object AnonNeedAlphaBlending {
  @scala.inline
  def apply(
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    needWorldViewMatrix: Boolean,
    needWorldViewProjectionMatrix: Boolean
  ): AnonNeedAlphaBlending = {
    val __obj = js.Dynamic.literal(needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], needWorldViewMatrix = needWorldViewMatrix.asInstanceOf[js.Any], needWorldViewProjectionMatrix = needWorldViewProjectionMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNeedAlphaBlending]
  }
}

