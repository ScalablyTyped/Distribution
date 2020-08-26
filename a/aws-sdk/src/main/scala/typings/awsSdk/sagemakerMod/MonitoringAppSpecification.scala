package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringAppSpecification extends js.Object {
  /**
    * An array of arguments for the container used to run the monitoring job.
    */
  var ContainerArguments: js.UndefOr[MonitoringContainerArguments] = js.native
  /**
    * Specifies the entrypoint for a container used to run the monitoring job.
    */
  var ContainerEntrypoint: js.UndefOr[typings.awsSdk.sagemakerMod.ContainerEntrypoint] = js.native
  /**
    * The container image to be run by the monitoring job.
    */
  var ImageUri: typings.awsSdk.sagemakerMod.ImageUri = js.native
  /**
    * An Amazon S3 URI to a script that is called after analysis has been performed. Applicable only for the built-in (first party) containers.
    */
  var PostAnalyticsProcessorSourceUri: js.UndefOr[S3Uri] = js.native
  /**
    * An Amazon S3 URI to a script that is called per row prior to running analysis. It can base64 decode the payload and convert it into a flatted json so that the built-in container can use the converted data. Applicable only for the built-in (first party) containers.
    */
  var RecordPreprocessorSourceUri: js.UndefOr[S3Uri] = js.native
}

object MonitoringAppSpecification {
  @scala.inline
  def apply(ImageUri: ImageUri): MonitoringAppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringAppSpecification]
  }
  @scala.inline
  implicit class MonitoringAppSpecificationOps[Self <: MonitoringAppSpecification] (val x: Self) extends AnyVal {
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
    def setImageUri(value: ImageUri): Self = this.set("ImageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerArgumentsVarargs(value: ContainerArgument*): Self = this.set("ContainerArguments", js.Array(value :_*))
    @scala.inline
    def setContainerArguments(value: MonitoringContainerArguments): Self = this.set("ContainerArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerArguments: Self = this.set("ContainerArguments", js.undefined)
    @scala.inline
    def setContainerEntrypointVarargs(value: ContainerEntrypointString*): Self = this.set("ContainerEntrypoint", js.Array(value :_*))
    @scala.inline
    def setContainerEntrypoint(value: ContainerEntrypoint): Self = this.set("ContainerEntrypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerEntrypoint: Self = this.set("ContainerEntrypoint", js.undefined)
    @scala.inline
    def setPostAnalyticsProcessorSourceUri(value: S3Uri): Self = this.set("PostAnalyticsProcessorSourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostAnalyticsProcessorSourceUri: Self = this.set("PostAnalyticsProcessorSourceUri", js.undefined)
    @scala.inline
    def setRecordPreprocessorSourceUri(value: S3Uri): Self = this.set("RecordPreprocessorSourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordPreprocessorSourceUri: Self = this.set("RecordPreprocessorSourceUri", js.undefined)
  }
  
}

