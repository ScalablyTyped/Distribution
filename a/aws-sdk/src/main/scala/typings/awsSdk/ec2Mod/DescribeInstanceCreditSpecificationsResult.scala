package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceCreditSpecificationsResult extends StObject {
  
  /**
    * Information about the credit option for CPU usage of an instance.
    */
  var InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeInstanceCreditSpecificationsResult {
  
  @scala.inline
  def apply(): DescribeInstanceCreditSpecificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceCreditSpecificationsResult]
  }
  
  @scala.inline
  implicit class DescribeInstanceCreditSpecificationsResultMutableBuilder[Self <: DescribeInstanceCreditSpecificationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCreditSpecifications(value: InstanceCreditSpecificationList): Self = StObject.set(x, "InstanceCreditSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCreditSpecificationsUndefined: Self = StObject.set(x, "InstanceCreditSpecifications", js.undefined)
    
    @scala.inline
    def setInstanceCreditSpecificationsVarargs(value: InstanceCreditSpecification*): Self = StObject.set(x, "InstanceCreditSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
