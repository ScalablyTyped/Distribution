package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEmailTemplatesResponse extends StObject {
  
  /**
    * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent ListEmailTemplates call to retrieve the next 10 email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var TemplatesMetadata: js.UndefOr[EmailTemplateMetadataList] = js.native
}
object ListEmailTemplatesResponse {
  
  @scala.inline
  def apply(): ListEmailTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListEmailTemplatesResponseMutableBuilder[Self <: ListEmailTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTemplatesMetadata(value: EmailTemplateMetadataList): Self = StObject.set(x, "TemplatesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesMetadataUndefined: Self = StObject.set(x, "TemplatesMetadata", js.undefined)
    
    @scala.inline
    def setTemplatesMetadataVarargs(value: EmailTemplateMetadata*): Self = StObject.set(x, "TemplatesMetadata", js.Array(value :_*))
  }
}
