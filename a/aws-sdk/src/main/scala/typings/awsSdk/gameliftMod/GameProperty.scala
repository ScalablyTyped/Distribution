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
}

