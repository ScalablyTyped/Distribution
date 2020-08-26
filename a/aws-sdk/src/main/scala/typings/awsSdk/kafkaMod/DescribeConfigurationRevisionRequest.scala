package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRevisionRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
    
    */
  var Arn: string = js.native
  /**
    * 
    A string that uniquely identifies a revision of an MSK configuration.
    
    */
  var Revision: long = js.native
}

object DescribeConfigurationRevisionRequest {
  @scala.inline
  def apply(Arn: string, Revision: long): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
  @scala.inline
  implicit class DescribeConfigurationRevisionRequestOps[Self <: DescribeConfigurationRevisionRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: long): Self = this.set("Revision", value.asInstanceOf[js.Any])
  }
  
}

