package typings.backboneDotMarionette

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backboneDotMarionette.backboneDotMarionetteMod.Behavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BehaviorClass
  extends /* index */ StringDictionary[js.Any] {
  var behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior]
}

object Anon_BehaviorClass {
  @scala.inline
  def apply(
    behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior],
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): Anon_BehaviorClass = {
    val __obj = js.Dynamic.literal(behaviorClass = behaviorClass.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_BehaviorClass]
  }
}

