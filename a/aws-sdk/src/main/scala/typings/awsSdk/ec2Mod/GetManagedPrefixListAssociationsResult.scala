package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedPrefixListAssociationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the associations.
    */
  var PrefixListAssociations: js.UndefOr[PrefixListAssociationSet] = js.undefined
}
object GetManagedPrefixListAssociationsResult {
  
  @scala.inline
  def apply(): GetManagedPrefixListAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedPrefixListAssociationsResult]
  }
  
  @scala.inline
  implicit class GetManagedPrefixListAssociationsResultMutableBuilder[Self <: GetManagedPrefixListAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPrefixListAssociations(value: PrefixListAssociationSet): Self = StObject.set(x, "PrefixListAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListAssociationsUndefined: Self = StObject.set(x, "PrefixListAssociations", js.undefined)
    
    @scala.inline
    def setPrefixListAssociationsVarargs(value: PrefixListAssociation*): Self = StObject.set(x, "PrefixListAssociations", js.Array(value :_*))
  }
}
