package typings.backboneMarionette.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backboneMarionette.mod.Behavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictindex
  extends /* index */ StringDictionary[js.Any] {
  var behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior]
}

object Dictindex {
  @scala.inline
  def apply(
    behaviorClass: Instantiable1[js.UndefOr[/* options */ js.Any], Behavior],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Dictindex = {
    val __obj = js.Dynamic.literal(behaviorClass = behaviorClass.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictindex]
  }
}

