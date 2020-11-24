package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportDefinition extends js.Object {
  
  /**
    * A list of manifests that you want Amazon Web Services to create for this report.
    */
  var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.native
  
  /**
    * A list of strings that indicate additional content that Amazon Web Services includes in the report, such as individual resource IDs. 
    */
  var AdditionalSchemaElements: SchemaElementList = js.native
  
  var Compression: CompressionFormat = js.native
  
  var Format: ReportFormat = js.native
  
  /**
    * Whether you want Amazon Web Services to update your reports after they have been finalized if Amazon Web Services detects charges related to previous months. These charges can include refunds, credits, or support fees.
    */
  var RefreshClosedReports: js.UndefOr[typings.awsSdk.curMod.RefreshClosedReports] = js.native
  
  var ReportName: typings.awsSdk.curMod.ReportName = js.native
  
  /**
    * Whether you want Amazon Web Services to overwrite the previous version of each report or to deliver the report in addition to the previous versions.
    */
  var ReportVersioning: js.UndefOr[typings.awsSdk.curMod.ReportVersioning] = js.native
  
  var S3Bucket: typings.awsSdk.curMod.S3Bucket = js.native
  
  var S3Prefix: typings.awsSdk.curMod.S3Prefix = js.native
  
  var S3Region: AWSRegion = js.native
  
  var TimeUnit: typings.awsSdk.curMod.TimeUnit = js.native
}
object ReportDefinition {
  
  @scala.inline
  def apply(
    AdditionalSchemaElements: SchemaElementList,
    Compression: CompressionFormat,
    Format: ReportFormat,
    ReportName: ReportName,
    S3Bucket: S3Bucket,
    S3Prefix: S3Prefix,
    S3Region: AWSRegion,
    TimeUnit: TimeUnit
  ): ReportDefinition = {
    val __obj = js.Dynamic.literal(AdditionalSchemaElements = AdditionalSchemaElements.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ReportName = ReportName.asInstanceOf[js.Any], S3Bucket = S3Bucket.asInstanceOf[js.Any], S3Prefix = S3Prefix.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDefinition]
  }
  
  @scala.inline
  implicit class ReportDefinitionOps[Self <: ReportDefinition] (val x: Self) extends AnyVal {
    
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
    def setAdditionalSchemaElementsVarargs(value: SchemaElement*): Self = this.set("AdditionalSchemaElements", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSchemaElements(value: SchemaElementList): Self = this.set("AdditionalSchemaElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: CompressionFormat): Self = this.set("Compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ReportFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportName(value: ReportName): Self = this.set("ReportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: S3Prefix): Self = this.set("S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Region(value: AWSRegion): Self = this.set("S3Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnit(value: TimeUnit): Self = this.set("TimeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalArtifactsVarargs(value: AdditionalArtifact*): Self = this.set("AdditionalArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalArtifacts(value: AdditionalArtifactList): Self = this.set("AdditionalArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalArtifacts: Self = this.set("AdditionalArtifacts", js.undefined)
    
    @scala.inline
    def setRefreshClosedReports(value: RefreshClosedReports): Self = this.set("RefreshClosedReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshClosedReports: Self = this.set("RefreshClosedReports", js.undefined)
    
    @scala.inline
    def setReportVersioning(value: ReportVersioning): Self = this.set("ReportVersioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportVersioning: Self = this.set("ReportVersioning", js.undefined)
  }
}
