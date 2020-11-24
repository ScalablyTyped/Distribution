package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageLensConfigurationTaggingResult extends js.Object {
  
  /**
    * The tags of S3 Storage Lens configuration requested.
    */
  var Tags: js.UndefOr[StorageLensTags] = js.native
}
object GetStorageLensConfigurationTaggingResult {
  
  @scala.inline
  def apply(): GetStorageLensConfigurationTaggingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageLensConfigurationTaggingResult]
  }
  
  @scala.inline
  implicit class GetStorageLensConfigurationTaggingResultOps[Self <: GetStorageLensConfigurationTaggingResult] (val x: Self) extends AnyVal {
    
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
    def setTagsVarargs(value: StorageLensTag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: StorageLensTags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
