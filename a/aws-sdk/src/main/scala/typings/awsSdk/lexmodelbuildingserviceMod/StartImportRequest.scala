package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportRequest extends js.Object {
  
  /**
    * Specifies the action that the StartImport operation should take when there is an existing resource with the same name.   FAIL_ON_CONFLICT - The import operation is stopped on the first conflict between a resource in the import file and an existing resource. The name of the resource causing the conflict is in the failureReason field of the response to the GetImport operation. OVERWRITE_LATEST - The import operation proceeds even if there is a conflict with an existing resource. The $LASTEST version of the existing resource is overwritten with the data from the import file.  
    */
  var mergeStrategy: MergeStrategy = js.native
  
  /**
    * A zip archive in binary format. The archive should contain one file, a JSON file containing the resource to import. The resource should match the type specified in the resourceType field.
    */
  var payload: _Blob = js.native
  
  /**
    * Specifies the type of resource to export. Each resource also exports any resources that it depends on.    A bot exports dependent intents.   An intent exports dependent slot types.  
    */
  var resourceType: ResourceType = js.native
  
  /**
    * A list of tags to add to the imported bot. You can only add tags when you import a bot, you can't add tags to an intent or slot type.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object StartImportRequest {
  
  @scala.inline
  def apply(mergeStrategy: MergeStrategy, payload: _Blob, resourceType: ResourceType): StartImportRequest = {
    val __obj = js.Dynamic.literal(mergeStrategy = mergeStrategy.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportRequest]
  }
  
  @scala.inline
  implicit class StartImportRequestOps[Self <: StartImportRequest] (val x: Self) extends AnyVal {
    
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
    def setMergeStrategy(value: MergeStrategy): Self = this.set("mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: _Blob): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
