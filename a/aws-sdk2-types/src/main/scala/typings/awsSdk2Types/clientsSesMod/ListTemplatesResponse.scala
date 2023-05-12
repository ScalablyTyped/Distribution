package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplatesResponse extends StObject {
  
  /**
    * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSesMod.NextToken] = js.undefined
  
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var TemplatesMetadata: js.UndefOr[TemplateMetadataList] = js.undefined
}
object ListTemplatesResponse {
  
  inline def apply(): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTemplatesMetadata(value: TemplateMetadataList): Self = StObject.set(x, "TemplatesMetadata", value.asInstanceOf[js.Any])
    
    inline def setTemplatesMetadataUndefined: Self = StObject.set(x, "TemplatesMetadata", js.undefined)
    
    inline def setTemplatesMetadataVarargs(value: TemplateMetadata*): Self = StObject.set(x, "TemplatesMetadata", js.Array(value*))
  }
}
