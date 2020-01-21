package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobTemplateRequest extends js.Object {
  /**
    * The name of the job template to be deleted.
    */
  var Name: string = js.native
}

object DeleteJobTemplateRequest {
  @scala.inline
  def apply(Name: string): DeleteJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteJobTemplateRequest]
  }
}

