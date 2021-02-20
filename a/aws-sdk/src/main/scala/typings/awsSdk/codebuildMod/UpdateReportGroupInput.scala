package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateReportGroupInput extends StObject {
  
  /**
    *  The ARN of the report group to update. 
    */
  var arn: NonEmptyString = js.native
  
  /**
    *  Used to specify an updated export type. Valid values are:     S3: The report results are exported to an S3 bucket.     NO_EXPORT: The report results are not exported.   
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
  
  /**
    *  An updated list of tag key and value pairs associated with this report group.  These tags are available for use by AWS services that support AWS CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object UpdateReportGroupInput {
  
  @scala.inline
  def apply(arn: NonEmptyString): UpdateReportGroupInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReportGroupInput]
  }
  
  @scala.inline
  implicit class UpdateReportGroupInputMutableBuilder[Self <: UpdateReportGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportConfig(value: ReportExportConfig): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
