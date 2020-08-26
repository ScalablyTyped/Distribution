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
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setKey(value: string): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: string): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

