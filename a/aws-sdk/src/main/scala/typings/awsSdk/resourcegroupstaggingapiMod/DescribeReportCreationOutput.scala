package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReportCreationOutput extends js.Object {
  
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
  implicit class DescribeReportCreationOutputOps[Self <: DescribeReportCreationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setS3Location(value: S3Location): Self = this.set("S3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Location: Self = this.set("S3Location", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
