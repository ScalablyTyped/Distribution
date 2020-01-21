package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobResource extends js.Object {
  /**
    * The Amazon Machine Images (AMIs) associated with this job.
    */
  var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList] = js.native
  /**
    * The Python-language Lambda functions for this job.
    */
  var LambdaResources: js.UndefOr[LambdaResourceList] = js.native
  /**
    * An array of S3Resource objects.
    */
  var S3Resources: js.UndefOr[S3ResourceList] = js.native
}

object JobResource {
  @scala.inline
  def apply(
    Ec2AmiResources: Ec2AmiResourceList = null,
    LambdaResources: LambdaResourceList = null,
    S3Resources: S3ResourceList = null
  ): JobResource = {
    val __obj = js.Dynamic.literal()
    if (Ec2AmiResources != null) __obj.updateDynamic("Ec2AmiResources")(Ec2AmiResources.asInstanceOf[js.Any])
    if (LambdaResources != null) __obj.updateDynamic("LambdaResources")(LambdaResources.asInstanceOf[js.Any])
    if (S3Resources != null) __obj.updateDynamic("S3Resources")(S3Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobResource]
  }
}

