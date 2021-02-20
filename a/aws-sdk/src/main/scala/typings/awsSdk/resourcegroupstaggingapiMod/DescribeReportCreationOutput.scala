package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReportCreationOutput extends StObject {
  
  /**
    * Details of the common errors that all operations return.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ErrorMessage] = js.native
  
  /**
    * The path to the Amazon S3 bucket where the report was stored on creation.
    */
  var S3Location: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.S3Location] = js.native
  
  /**
    * Reports the status of the operation. The operation status can be one of the following:    RUNNING - Report creation is in progress.    SUCCEEDED - Report creation is complete. You can open the report from the Amazon S3 bucket that you specified when you ran StartReportCreation.    FAILED - Report creation timed out or the Amazon S3 bucket is not accessible.     NO REPORT - No report was generated in the last 90 days.  
    */
  var Status: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.Status] = js.native
}
object DescribeReportCreationOutput {
  
  @scala.inline
  def apply(): DescribeReportCreationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReportCreationOutput]
  }
  
  @scala.inline
  implicit class DescribeReportCreationOutputMutableBuilder[Self <: DescribeReportCreationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setS3Location(value: S3Location): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LocationUndefined: Self = StObject.set(x, "S3Location", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
