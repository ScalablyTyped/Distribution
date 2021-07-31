package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageLensConfigurationTaggingResult extends StObject {
  
  /**
    * The tags of S3 Storage Lens configuration requested.
    */
  var Tags: js.UndefOr[StorageLensTags] = js.undefined
}
object GetStorageLensConfigurationTaggingResult {
  
  @scala.inline
  def apply(): GetStorageLensConfigurationTaggingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageLensConfigurationTaggingResult]
  }
  
  @scala.inline
  implicit class GetStorageLensConfigurationTaggingResultMutableBuilder[Self <: GetStorageLensConfigurationTaggingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: StorageLensTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: StorageLensTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
