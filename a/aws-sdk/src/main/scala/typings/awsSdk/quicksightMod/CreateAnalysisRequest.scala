package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnalysisRequest extends js.Object {
  
  /**
    * The ID for the analysis that you're creating. This ID displays in the URL of the analysis.
    */
  var AnalysisId: RestrictiveResourceId = js.native
  
  /**
    * The ID of the AWS account where you are creating an analysis.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * A descriptive name for the analysis that you're creating. This name displays for the analysis in the QuickSight console. 
    */
  var Name: AnalysisName = js.native
  
  /**
    * The parameter names and override values that you want to use. An analysis can have any parameter type, and some parameters might accept multiple values. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.quicksightMod.Parameters] = js.native
  
  /**
    * A structure that describes the principals and the resource-level permissions on an analysis. You can use the Permissions structure to grant permissions by providing a list of AWS Identity and Access Management (IAM) action information for each principal listed by Amazon Resource Name (ARN).  To specify no permissions, omit Permissions.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  
  /**
    * A source entity to use for the analysis that you're creating. This metadata structure contains details that describe a source template and one or more datasets.
    */
  var SourceEntity: AnalysisSourceEntity = js.native
  
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the analysis.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ARN for the theme to apply to the analysis that you're creating. To see the theme in the QuickSight console, make sure that you have access to it.
    */
  var ThemeArn: js.UndefOr[Arn] = js.native
}
object CreateAnalysisRequest {
  
  @scala.inline
  def apply(
    AnalysisId: RestrictiveResourceId,
    AwsAccountId: AwsAccountId,
    Name: AnalysisName,
    SourceEntity: AnalysisSourceEntity
  ): CreateAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnalysisRequest]
  }
  
  @scala.inline
  implicit class CreateAnalysisRequestOps[Self <: CreateAnalysisRequest] (val x: Self) extends AnyVal {
    
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
    def setAnalysisId(value: RestrictiveResourceId): Self = this.set("AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AnalysisName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceEntity(value: AnalysisSourceEntity): Self = this.set("SourceEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setThemeArn(value: Arn): Self = this.set("ThemeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeArn: Self = this.set("ThemeArn", js.undefined)
  }
}
