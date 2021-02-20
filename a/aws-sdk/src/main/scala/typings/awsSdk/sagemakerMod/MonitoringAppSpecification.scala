package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringAppSpecification extends StObject {
  
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
  implicit class MonitoringAppSpecificationMutableBuilder[Self <: MonitoringAppSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerArguments(value: MonitoringContainerArguments): Self = StObject.set(x, "ContainerArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerArgumentsUndefined: Self = StObject.set(x, "ContainerArguments", js.undefined)
    
    @scala.inline
    def setContainerArgumentsVarargs(value: ContainerArgument*): Self = StObject.set(x, "ContainerArguments", js.Array(value :_*))
    
    @scala.inline
    def setContainerEntrypoint(value: ContainerEntrypoint): Self = StObject.set(x, "ContainerEntrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerEntrypointUndefined: Self = StObject.set(x, "ContainerEntrypoint", js.undefined)
    
    @scala.inline
    def setContainerEntrypointVarargs(value: ContainerEntrypointString*): Self = StObject.set(x, "ContainerEntrypoint", js.Array(value :_*))
    
    @scala.inline
    def setImageUri(value: ImageUri): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostAnalyticsProcessorSourceUri(value: S3Uri): Self = StObject.set(x, "PostAnalyticsProcessorSourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostAnalyticsProcessorSourceUriUndefined: Self = StObject.set(x, "PostAnalyticsProcessorSourceUri", js.undefined)
    
    @scala.inline
    def setRecordPreprocessorSourceUri(value: S3Uri): Self = StObject.set(x, "RecordPreprocessorSourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordPreprocessorSourceUriUndefined: Self = StObject.set(x, "RecordPreprocessorSourceUri", js.undefined)
  }
}
