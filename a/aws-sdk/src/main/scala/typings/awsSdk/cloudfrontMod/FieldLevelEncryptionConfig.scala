package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldLevelEncryptionConfig extends js.Object {
  
  /**
    * A unique number that ensures the request can't be replayed.
    */
  var CallerReference: String = js.native
  
  /**
    * An optional comment about the configuration.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
    */
  var ContentTypeProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.ContentTypeProfileConfig] = js.native
  
  /**
    * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
    */
  var QueryArgProfileConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.QueryArgProfileConfig] = js.native
}
object FieldLevelEncryptionConfig {
  
  @scala.inline
  def apply(CallerReference: String): FieldLevelEncryptionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionConfig]
  }
  
  @scala.inline
  implicit class FieldLevelEncryptionConfigOps[Self <: FieldLevelEncryptionConfig] (val x: Self) extends AnyVal {
    
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
    def setCallerReference(value: String): Self = this.set("CallerReference", value.asInstanceOf[js.Any])
    
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
