package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * The message body.
    */
  var Body: typings.awsSdk.sesMod.Body = js.native
  /**
    * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
    */
  var Subject: Content = js.native
}

object Message {
  @scala.inline
  def apply(Body: Body, Subject: Content): Message = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

