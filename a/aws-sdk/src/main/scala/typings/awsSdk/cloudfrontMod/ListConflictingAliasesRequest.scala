package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConflictingAliasesRequest extends StObject {
  
  /**
    * The alias (also called a CNAME) to search for conflicting aliases.
    */
  var Alias: aliasString
  
  /**
    * The ID of a distribution in your account that has an attached SSL/TLS certificate that includes the provided alias.
    */
  var DistributionId: distributionIdString
  
  /**
    * Use this field when paginating results to indicate where to begin in the list of conflicting aliases. The response includes conflicting aliases in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of conflicting aliases that you want in the response.
    */
  var MaxItems: js.UndefOr[listConflictingAliasesMaxItemsInteger] = js.undefined
}
object ListConflictingAliasesRequest {
  
  inline def apply(Alias: aliasString, DistributionId: distributionIdString): ListConflictingAliasesRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], DistributionId = DistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConflictingAliasesRequest]
  }
  
  extension [Self <: ListConflictingAliasesRequest](x: Self) {
    
    inline def setAlias(value: aliasString): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setDistributionId(value: distributionIdString): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: listConflictingAliasesMaxItemsInteger): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
