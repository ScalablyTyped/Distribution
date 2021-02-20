package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataSetRequest extends StObject {
  
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: typings.awsSdk.dataexchangeMod.AssetType = js.native
  
  /**
    * A description for the data set. This value can be up to 16,348 characters long.
    */
  var Description: typings.awsSdk.dataexchangeMod.Description = js.native
  
  /**
    * The name of the data set.
    */
  var Name: typings.awsSdk.dataexchangeMod.Name = js.native
  
  /**
    * A data set tag is an optional label that you can assign to a data set when you create it. Each tag consists of a key and an optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM policies to control access to these data sets and revisions.
    */
  var Tags: js.UndefOr[MapOfString] = js.native
}
object CreateDataSetRequest {
  
  @scala.inline
  def apply(AssetType: AssetType, Description: Description, Name: Name): CreateDataSetRequest = {
    val __obj = js.Dynamic.literal(AssetType = AssetType.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetRequest]
  }
  
  @scala.inline
  implicit class CreateDataSetRequestMutableBuilder[Self <: CreateDataSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: MapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
