package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation Tag
    Data Type.
    */
  var Key: string = js.native
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation 
    Tag
    
    Data Type.
    */
  var Value: string = js.native
}

object Tag {
  @scala.inline
  def apply(Key: string, Value: string): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

