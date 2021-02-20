package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesModificationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The Reserved Instance modification information.
    */
  var ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList] = js.native
}
object DescribeReservedInstancesModificationsResult {
  
  @scala.inline
  def apply(): DescribeReservedInstancesModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesModificationsResult]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesModificationsResultMutableBuilder[Self <: DescribeReservedInstancesModificationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservedInstancesModifications(value: ReservedInstancesModificationList): Self = StObject.set(x, "ReservedInstancesModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesModificationsUndefined: Self = StObject.set(x, "ReservedInstancesModifications", js.undefined)
    
    @scala.inline
    def setReservedInstancesModificationsVarargs(value: ReservedInstancesModification*): Self = StObject.set(x, "ReservedInstancesModifications", js.Array(value :_*))
  }
}
