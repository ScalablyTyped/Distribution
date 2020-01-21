package typings.backboneMarionette

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backboneMarionette.mod.Behavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBehaviorClass
  extends /* index */ StringDictionary[js.Any] {
  var behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior]
}

object AnonBehaviorClass {
  @scala.inline
  def apply(
    behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior],
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): AnonBehaviorClass = {
    val __obj = js.Dynamic.literal(behaviorClass = behaviorClass.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonBehaviorClass]
  }
}

