package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldLevelEncryptionSummary extends js.Object {
  
  /**
    * An optional comment about the field-level encryption item.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    *  A summary of a content type-profile mapping. 
    */
  var ContentTypeProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.ContentTypeProfileConfig] = js.native
  
  /**
    * The unique ID of a field-level encryption item.
    */
  var Id: String = js.native
  
  /**
    * The last time that the summary of field-level encryption items was modified.
    */
  var LastModifiedTime: timestamp = js.native
  
  /**
    *  A summary of a query argument-profile mapping. 
    */
  var QueryArgProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.QueryArgProfileConfig] = js.native
}
object FieldLevelEncryptionSummary {
  
  @scala.inline
  def apply(Id: String, LastModifiedTime: timestamp): FieldLevelEncryptionSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionSummary]
  }
  
  @scala.inline
  implicit class FieldLevelEncryptionSummaryOps[Self <: FieldLevelEncryptionSummary] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    
    @scala.inline
    def setContentTypeProfileConfig(value: ContentTypeProfileConfig): Self = this.set("ContentTypeProfileConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTypeProfileConfig: Self = this.set("ContentTypeProfileConfig", js.undefined)
    
    @scala.inline
    def setQueryArgProfileConfig(value: QueryArgProfileConfig): Self = this.set("QueryArgProfileConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryArgProfileConfig: Self = this.set("QueryArgProfileConfig", js.undefined)
  }
}
