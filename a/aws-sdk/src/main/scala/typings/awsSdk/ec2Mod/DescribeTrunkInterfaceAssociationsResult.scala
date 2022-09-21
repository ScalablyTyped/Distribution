package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrunkInterfaceAssociationsResult extends StObject {
  
  /**
    * Information about the trunk associations.
    */
  var InterfaceAssociations: js.UndefOr[TrunkInterfaceAssociationList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeTrunkInterfaceAssociationsResult {
  
  inline def apply(): DescribeTrunkInterfaceAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrunkInterfaceAssociationsResult]
  }
  
  extension [Self <: DescribeTrunkInterfaceAssociationsResult](x: Self) {
    
    inline def setInterfaceAssociations(value: TrunkInterfaceAssociationList): Self = StObject.set(x, "InterfaceAssociations", value.asInstanceOf[js.Any])
    
    inline def setInterfaceAssociationsUndefined: Self = StObject.set(x, "InterfaceAssociations", js.undefined)
    
    inline def setInterfaceAssociationsVarargs(value: TrunkInterfaceAssociation*): Self = StObject.set(x, "InterfaceAssociations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
