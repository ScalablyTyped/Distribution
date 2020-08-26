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
  def apply(): JobResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResource]
  }
  @scala.inline
  implicit class JobResourceOps[Self <: JobResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEc2AmiResourcesVarargs(value: Ec2AmiResource*): Self = this.set("Ec2AmiResources", js.Array(value :_*))
    @scala.inline
    def setEc2AmiResources(value: Ec2AmiResourceList): Self = this.set("Ec2AmiResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2AmiResources: Self = this.set("Ec2AmiResources", js.undefined)
    @scala.inline
    def setLambdaResourcesVarargs(value: LambdaResource*): Self = this.set("LambdaResources", js.Array(value :_*))
    @scala.inline
    def setLambdaResources(value: LambdaResourceList): Self = this.set("LambdaResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaResources: Self = this.set("LambdaResources", js.undefined)
    @scala.inline
    def setS3ResourcesVarargs(value: S3Resource*): Self = this.set("S3Resources", js.Array(value :_*))
    @scala.inline
    def setS3Resources(value: S3ResourceList): Self = this.set("S3Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Resources: Self = this.set("S3Resources", js.undefined)
  }
  
}

