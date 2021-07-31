package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHubRequest extends StObject {
  
  /**
    * The ARN of the Hub resource to retrieve.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.undefined
}
object DescribeHubRequest {
  
  @scala.inline
  def apply(): DescribeHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHubRequest]
  }
  
  @scala.inline
  implicit class DescribeHubRequestMutableBuilder[Self <: DescribeHubRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHubArn(value: NonEmptyString): Self = StObject.set(x, "HubArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHubArnUndefined: Self = StObject.set(x, "HubArn", js.undefined)
  }
}
