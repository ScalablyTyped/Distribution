package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepeatKey extends js.Object {
  var repeatKey: js.UndefOr[String] = js.undefined
  var replaceStrings: js.UndefOr[js.Array[AnonReplace]] = js.undefined
}

object AnonRepeatKey {
  @scala.inline
  def apply(repeatKey: String = null, replaceStrings: js.Array[AnonReplace] = null): AnonRepeatKey = {
    val __obj = js.Dynamic.literal()
    if (repeatKey != null) __obj.updateDynamic("repeatKey")(repeatKey.asInstanceOf[js.Any])
    if (replaceStrings != null) __obj.updateDynamic("replaceStrings")(replaceStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRepeatKey]
  }
}

