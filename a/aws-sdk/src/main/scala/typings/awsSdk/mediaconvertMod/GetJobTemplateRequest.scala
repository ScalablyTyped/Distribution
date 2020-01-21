package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobTemplateRequest extends js.Object {
  /**
    * The name of the job template.
    */
  var Name: string = js.native
}

object GetJobTemplateRequest {
  @scala.inline
  def apply(Name: string): GetJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetJobTemplateRequest]
  }
}

