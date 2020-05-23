package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeedAlphaBlending extends js.Object {
  var needAlphaBlending: Boolean
  var needAlphaTesting: Boolean
  var needWorldViewMatrix: Boolean
  var needWorldViewProjectionMatrix: Boolean
}

object NeedAlphaBlending {
  @scala.inline
  def apply(
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    needWorldViewMatrix: Boolean,
    needWorldViewProjectionMatrix: Boolean
  ): NeedAlphaBlending = {
    val __obj = js.Dynamic.literal(needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], needWorldViewMatrix = needWorldViewMatrix.asInstanceOf[js.Any], needWorldViewProjectionMatrix = needWorldViewProjectionMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedAlphaBlending]
  }
}

