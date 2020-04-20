package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * The details for the CreateJob request.
    */
  var Details: RequestDetails = js.native
  /**
    * The type of job to be created.
    */
  var Type: typings.awsSdk.dataexchangeMod.Type = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(Details: RequestDetails, Type: Type): CreateJobRequest = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
}

