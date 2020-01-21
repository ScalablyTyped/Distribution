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
  def apply(
    ImageUri: ImageUri,
    ContainerArguments: MonitoringContainerArguments = null,
    ContainerEntrypoint: ContainerEntrypoint = null,
    PostAnalyticsProcessorSourceUri: S3Uri = null,
    RecordPreprocessorSourceUri: S3Uri = null
  ): MonitoringAppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    if (ContainerArguments != null) __obj.updateDynamic("ContainerArguments")(ContainerArguments.asInstanceOf[js.Any])
    if (ContainerEntrypoint != null) __obj.updateDynamic("ContainerEntrypoint")(ContainerEntrypoint.asInstanceOf[js.Any])
    if (PostAnalyticsProcessorSourceUri != null) __obj.updateDynamic("PostAnalyticsProcessorSourceUri")(PostAnalyticsProcessorSourceUri.asInstanceOf[js.Any])
    if (RecordPreprocessorSourceUri != null) __obj.updateDynamic("RecordPreprocessorSourceUri")(RecordPreprocessorSourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringAppSpecification]
  }
}

