package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountCustomizationRequest extends StObject {
  
  /**
    * The ID for the AWS account that you want to describe QuickSight customizations for.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The QuickSight namespace that you want to describe QuickSight customizations for.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.native
  
  /**
    * The Resolved flag works with the other parameters to determine which view of QuickSight customizations is returned. You can add this flag to your command to use the same view that QuickSight uses to identify which customizations to apply to the console. Omit this flag, or set it to no-resolved, to reveal customizations that are configured at different levels. 
    */
  var Resolved: js.UndefOr[scala.Boolean] = js.native
}
object DescribeAccountCustomizationRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId): DescribeAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountCustomizationRequest]
  }
  
  @scala.inline
  implicit class DescribeAccountCustomizationRequestMutableBuilder[Self <: DescribeAccountCustomizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setResolved(value: scala.Boolean): Self = StObject.set(x, "Resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedUndefined: Self = StObject.set(x, "Resolved", js.undefined)
  }
}
