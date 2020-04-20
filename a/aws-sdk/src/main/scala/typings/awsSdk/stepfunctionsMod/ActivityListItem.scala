package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityListItem extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the activity.
    */
  var activityArn: Arn = js.native
  /**
    * The date the activity is created.
    */
  var creationDate: Timestamp = js.native
  /**
    * The name of the activity. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name = js.native
}

object ActivityListItem {
  @scala.inline
  def apply(activityArn: Arn, creationDate: Timestamp, name: Name): ActivityListItem = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityListItem]
  }
}

