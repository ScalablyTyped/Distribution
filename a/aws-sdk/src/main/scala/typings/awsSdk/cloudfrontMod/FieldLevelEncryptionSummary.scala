package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLevelEncryptionSummary extends StObject {
  
  /**
    * An optional comment about the field-level encryption item.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    *  A summary of a content type-profile mapping. 
    */
  var ContentTypeProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.ContentTypeProfileConfig] = js.undefined
  
  /**
    * The unique ID of a field-level encryption item.
    */
  var Id: String
  
  /**
    * The last time that the summary of field-level encryption items was modified.
    */
  var LastModifiedTime: timestamp
  
  /**
    *  A summary of a query argument-profile mapping. 
    */
  var QueryArgProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.QueryArgProfileConfig] = js.undefined
}
object FieldLevelEncryptionSummary {
  
  @scala.inline
  def apply(Id: String, LastModifiedTime: timestamp): FieldLevelEncryptionSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionSummary]
  }
  
  @scala.inline
  implicit class FieldLevelEncryptionSummaryMutableBuilder[Self <: FieldLevelEncryptionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setContentTypeProfileConfig(value: ContentTypeProfileConfig): Self = StObject.set(x, "ContentTypeProfileConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeProfileConfigUndefined: Self = StObject.set(x, "ContentTypeProfileConfig", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryArgProfileConfig(value: QueryArgProfileConfig): Self = StObject.set(x, "QueryArgProfileConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryArgProfileConfigUndefined: Self = StObject.set(x, "QueryArgProfileConfig", js.undefined)
  }
}
