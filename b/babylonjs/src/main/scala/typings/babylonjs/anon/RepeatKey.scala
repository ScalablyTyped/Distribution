package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatKey extends js.Object {
  var repeatKey: js.UndefOr[String] = js.undefined
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.undefined
}

object RepeatKey {
  @scala.inline
  def apply(repeatKey: String = null, replaceStrings: js.Array[Replace] = null): RepeatKey = {
    val __obj = js.Dynamic.literal()
    if (repeatKey != null) __obj.updateDynamic("repeatKey")(repeatKey.asInstanceOf[js.Any])
    if (replaceStrings != null) __obj.updateDynamic("replaceStrings")(replaceStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatKey]
  }
}

