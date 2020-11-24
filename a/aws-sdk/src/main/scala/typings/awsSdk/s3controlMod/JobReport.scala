package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobReport extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.
    */
  var Bucket: js.UndefOr[S3BucketArnString] = js.native
  
  /**
    * Indicates whether the specified job will generate a job-completion report.
    */
  var Enabled: Boolean = js.native
  
  /**
    * The format of the specified job-completion report.
    */
  var Format: js.UndefOr[JobReportFormat] = js.native
  
  /**
    * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 stores the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
    */
  var Prefix: js.UndefOr[ReportPrefixString] = js.native
  
  /**
    * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
    */
  var ReportScope: js.UndefOr[JobReportScope] = js.native
}
object JobReport {
  
  @scala.inline
  def apply(Enabled: Boolean): JobReport = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobReport]
  }
  
  @scala.inline
  implicit class JobReportOps[Self <: JobReport] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: S3BucketArnString): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    
    @scala.inline
    def setFormat(value: JobReportFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    
    @scala.inline
    def setPrefix(value: ReportPrefixString): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setReportScope(value: JobReportScope): Self = this.set("ReportScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportScope: Self = this.set("ReportScope", js.undefined)
  }
}
