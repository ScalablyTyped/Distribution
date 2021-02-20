package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectRequest extends StObject {
  
  /**
    * The name of the dataset to associate this project with.
    */
  var DatasetName: typings.awsSdk.databrewMod.DatasetName = js.native
  
  /**
    * A unique name for the new project.
    */
  var Name: ProjectName = js.native
  
  /**
    * The name of an existing recipe to associate with the project.
    */
  var RecipeName: typings.awsSdk.databrewMod.RecipeName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role to be assumed for this request.
    */
  var RoleArn: Arn = js.native
  
  var Sample: js.UndefOr[typings.awsSdk.databrewMod.Sample] = js.native
  
  /**
    * Metadata tags to apply to this project.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateProjectRequest {
  
  @scala.inline
  def apply(DatasetName: DatasetName, Name: ProjectName, RecipeName: RecipeName, RoleArn: Arn): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RecipeName = RecipeName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit class CreateProjectRequestMutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeName(value: RecipeName): Self = StObject.set(x, "RecipeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSample(value: Sample): Self = StObject.set(x, "Sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUndefined: Self = StObject.set(x, "Sample", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
