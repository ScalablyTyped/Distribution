package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstancesModificationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Reserved Instance modification information.
    */
  var ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList] = js.undefined
}
object DescribeReservedInstancesModificationsResult {
  
  inline def apply(): DescribeReservedInstancesModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesModificationsResult]
  }
  
  extension [Self <: DescribeReservedInstancesModificationsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedInstancesModifications(value: ReservedInstancesModificationList): Self = StObject.set(x, "ReservedInstancesModifications", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesModificationsUndefined: Self = StObject.set(x, "ReservedInstancesModifications", js.undefined)
    
    inline def setReservedInstancesModificationsVarargs(value: ReservedInstancesModification*): Self = StObject.set(x, "ReservedInstancesModifications", js.Array(value :_*))
  }
}
