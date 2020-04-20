package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackTrigger extends js.Object {
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Arn: string = js.native
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Type: string = js.native
}

object RollbackTrigger {
  @scala.inline
  def apply(Arn: string, Type: string): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTrigger]
  }
}

