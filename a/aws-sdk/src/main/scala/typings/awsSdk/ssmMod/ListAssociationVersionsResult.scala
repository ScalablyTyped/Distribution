package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociationVersionsResult extends StObject {
  
  /**
    * Information about all versions of the association for the specified association ID.
    */
  var AssociationVersions: js.UndefOr[AssociationVersionList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object ListAssociationVersionsResult {
  
  inline def apply(): ListAssociationVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationVersionsResult]
  }
  
  extension [Self <: ListAssociationVersionsResult](x: Self) {
    
    inline def setAssociationVersions(value: AssociationVersionList): Self = StObject.set(x, "AssociationVersions", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionsUndefined: Self = StObject.set(x, "AssociationVersions", js.undefined)
    
    inline def setAssociationVersionsVarargs(value: AssociationVersionInfo*): Self = StObject.set(x, "AssociationVersions", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
