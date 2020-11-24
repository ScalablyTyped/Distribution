package typings.contentfulManagement.webhookMod

import typings.contentfulManagement.contentfulManagementStrings.DELETE
import typings.contentfulManagement.contentfulManagementStrings.GET
import typings.contentfulManagement.contentfulManagementStrings.PATCH
import typings.contentfulManagement.contentfulManagementStrings.POST
import typings.contentfulManagement.contentfulManagementStrings.PUT
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashjsonSemicolon charsetEqualssignutf-8`
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashx-www-form-urlencoded`
import typings.contentfulManagement.contentfulManagementStrings.applicationSlashjson
import typings.contentfulManagement.contentfulManagementStrings.applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson
import typings.typeFest.basicMod.JsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookTransformation extends js.Object {
  
  var body: js.UndefOr[JsonValue] = js.native
  
  var contentType: js.UndefOr[
    Null | applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson | (`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`) | applicationSlashjson | (`applicationSlashjsonSemicolon charsetEqualssignutf-8`) | `applicationSlashx-www-form-urlencoded` | (`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`)
  ] = js.native
  
  var includeContentLength: js.UndefOr[Boolean | Null] = js.native
  
  var method: js.UndefOr[Null | POST | GET | PUT | PATCH | DELETE] = js.native
}
object WebhookTransformation {
  
  @scala.inline
  def apply(): WebhookTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookTransformation]
  }
  
  @scala.inline
  implicit class WebhookTransformationOps[Self <: WebhookTransformation] (val x: Self) extends AnyVal {
    
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
    def setBody(value: JsonValue): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setContentType(
      value: applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson | (`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`) | applicationSlashjson | (`applicationSlashjsonSemicolon charsetEqualssignutf-8`) | `applicationSlashx-www-form-urlencoded` | (`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`)
    ): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContentTypeNull: Self = this.set("contentType", null)
    
    @scala.inline
    def setIncludeContentLength(value: Boolean): Self = this.set("includeContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeContentLength: Self = this.set("includeContentLength", js.undefined)
    
    @scala.inline
    def setIncludeContentLengthNull: Self = this.set("includeContentLength", null)
    
    @scala.inline
    def setMethod(value: POST | GET | PUT | PATCH | DELETE): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMethodNull: Self = this.set("method", null)
  }
}
