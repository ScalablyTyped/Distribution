package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountIntegrationsRequest extends StObject {
  
  /**
    * Boolean to indicate if hidden integration should be returned. Defaults to False.
    */
  var IncludeHidden: js.UndefOr[optionalBoolean] = js.undefined
  
  /**
    * The maximum number of objects returned per page.
    */
  var MaxResults: js.UndefOr[maxSize100] = js.undefined
  
  /**
    * The pagination token from the previous ListAccountIntegrations API call.
    */
  var NextToken: js.UndefOr[token] = js.undefined
  
  /**
    * The URI of the S3 bucket or any other type of data source.
    */
  var Uri: string1To255
}
object ListAccountIntegrationsRequest {
  
  inline def apply(Uri: string1To255): ListAccountIntegrationsRequest = {
    val __obj = js.Dynamic.literal(Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountIntegrationsRequest]
  }
  
  extension [Self <: ListAccountIntegrationsRequest](x: Self) {
    
    inline def setIncludeHidden(value: optionalBoolean): Self = StObject.set(x, "IncludeHidden", value.asInstanceOf[js.Any])
    
    inline def setIncludeHiddenUndefined: Self = StObject.set(x, "IncludeHidden", js.undefined)
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUri(value: string1To255): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
