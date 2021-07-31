package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiConfig extends StObject {
  
  /**
    * The ARN of the worker task template used to render the worker UI and tools for labeling job tasks. Use this parameter when you are creating a labeling job for 3D point cloud and video fram labeling jobs. Use your labeling job task type to select one of the following ARN's and use it with this parameter when you create a labeling job. Replace aws-region with the AWS region you are creating your labeling job in.  3D Point Cloud HumanTaskUiArns  Use this HumanTaskUiArn for 3D point cloud object detection and 3D point cloud object detection adjustment labeling jobs.     arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection     Use this HumanTaskUiArn for 3D point cloud object tracking and 3D point cloud object tracking adjustment labeling jobs.     arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking     Use this HumanTaskUiArn for 3D point cloud semantic segmentation and 3D point cloud semantic segmentation adjustment labeling jobs.    arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation     Video Frame HumanTaskUiArns  Use this HumanTaskUiArn for video frame object detection and video frame object detection adjustment labeling jobs.     arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection     Use this HumanTaskUiArn for video frame object tracking and video frame object tracking adjustment labeling jobs.     arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking   
    */
  var HumanTaskUiArn: js.UndefOr[typings.awsSdk.sagemakerMod.HumanTaskUiArn] = js.undefined
  
  /**
    * The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to render the worker UI and tools for labeling job tasks. For more information about the contents of a UI template, see  Creating Your Custom Labeling Task Template.
    */
  var UiTemplateS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object UiConfig {
  
  @scala.inline
  def apply(): UiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiConfig]
  }
  
  @scala.inline
  implicit class UiConfigMutableBuilder[Self <: UiConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanTaskUiArnUndefined: Self = StObject.set(x, "HumanTaskUiArn", js.undefined)
    
    @scala.inline
    def setUiTemplateS3Uri(value: S3Uri): Self = StObject.set(x, "UiTemplateS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiTemplateS3UriUndefined: Self = StObject.set(x, "UiTemplateS3Uri", js.undefined)
  }
}
