package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampStructure extends js.Object {
  /**
    *  A Timestamp. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var value: Timestamp = js.native
}

object TimestampStructure {
  @scala.inline
  def apply(value: Timestamp): TimestampStructure = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampStructure]
  }
}

