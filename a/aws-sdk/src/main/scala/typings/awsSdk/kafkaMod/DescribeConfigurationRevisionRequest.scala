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
}

