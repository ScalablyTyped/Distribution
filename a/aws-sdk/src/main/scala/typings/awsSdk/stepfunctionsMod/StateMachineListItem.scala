package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachineListItem extends js.Object {
  /**
    * The date the state machine is created.
    */
  var creationDate: Timestamp = js.native
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: Arn = js.native
  /**
    * 
    */
  var `type`: StateMachineType = js.native
}

object StateMachineListItem {
  @scala.inline
  def apply(creationDate: Timestamp, name: Name, stateMachineArn: Arn, `type`: StateMachineType): StateMachineListItem = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMachineListItem]
  }
}

