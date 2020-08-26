package typings.backboneMarionette.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.backboneMarionette.mod.Behavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictindex
  extends /* index */ StringDictionary[js.Any] {
  var behaviorClass: Instantiable1[/* options */ js.UndefOr[js.Any], Behavior] = js.native
}

object Dictindex {
  @scala.inline
  def apply(behaviorClass: Instantiable1[/* options */ js.UndefOr[js.Any], Behavior]): Dictindex = {
    val __obj = js.Dynamic.literal(behaviorClass = behaviorClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  @scala.inline
  implicit class DictindexOps[Self <: Dictindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBehaviorClass(value: Instantiable1[/* options */ js.UndefOr[js.Any], Behavior]): Self = this.set("behaviorClass", value.asInstanceOf[js.Any])
  }
  
}

