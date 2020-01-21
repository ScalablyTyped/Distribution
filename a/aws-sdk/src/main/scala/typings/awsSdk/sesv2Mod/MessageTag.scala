package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTag extends js.Object {
  /**
    * The name of the message tag. The message tag name has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var Name: MessageTagName = js.native
  /**
    * The value of the message tag. The message tag value has to meet the following criteria:   It can only contain ASCII letters (a–z, A–Z), numbers (0–9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var Value: MessageTagValue = js.native
}

object MessageTag {
  @scala.inline
  def apply(Name: MessageTagName, Value: MessageTagValue): MessageTag = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageTag]
  }
}

