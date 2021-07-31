package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsSubscriptionRequest extends StObject {
  
  /**
    * The ARN of the standard that you want to enable. To view the list of available standards and their ARNs, use the  DescribeStandards  operation.
    */
  var StandardsArn: NonEmptyString
  
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: js.UndefOr[StandardsInputParameterMap] = js.undefined
}
object StandardsSubscriptionRequest {
  
  @scala.inline
  def apply(StandardsArn: NonEmptyString): StandardsSubscriptionRequest = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscriptionRequest]
  }
  
  @scala.inline
  implicit class StandardsSubscriptionRequestMutableBuilder[Self <: StandardsSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsInput(value: StandardsInputParameterMap): Self = StObject.set(x, "StandardsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsInputUndefined: Self = StObject.set(x, "StandardsInput", js.undefined)
  }
}
