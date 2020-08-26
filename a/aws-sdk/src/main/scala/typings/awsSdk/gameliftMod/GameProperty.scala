package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameProperty extends js.Object {
  /**
    * The game property identifier.
    */
  var Key: GamePropertyKey = js.native
  /**
    * The game property value.
    */
  var Value: GamePropertyValue = js.native
}

object GameProperty {
  @scala.inline
  def apply(Key: GamePropertyKey, Value: GamePropertyValue): GameProperty = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameProperty]
  }
  @scala.inline
  implicit class GamePropertyOps[Self <: GameProperty] (val x: Self) extends AnyVal {
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
    def setKey(value: GamePropertyKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: GamePropertyValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

