package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterMapEntry extends js.Object {
  /**
    *  The QuestionID from the HIT that is used to identify which question requires Mechanical Turk to score as part of the ScoreMyKnownAnswers/2011-09-01 Review Policy. 
    */
  var Key: js.UndefOr[String] = js.native
  /**
    *  The list of answers to the question specified in the MapEntry Key element. The Worker must match all values in order for the answer to be scored correctly. 
    */
  var Values: js.UndefOr[StringList] = js.native
}

object ParameterMapEntry {
  @scala.inline
  def apply(Key: String = null, Values: StringList = null): ParameterMapEntry = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterMapEntry]
  }
}

