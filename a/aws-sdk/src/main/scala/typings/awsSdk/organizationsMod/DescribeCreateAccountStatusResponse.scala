package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCreateAccountStatusResponse extends StObject {
  
  /**
    * A structure that contains the current status of an account creation request.
    */
  var CreateAccountStatus: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatus] = js.undefined
}
object DescribeCreateAccountStatusResponse {
  
  @scala.inline
  def apply(): DescribeCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCreateAccountStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeCreateAccountStatusResponseMutableBuilder[Self <: DescribeCreateAccountStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAccountStatus(value: CreateAccountStatus): Self = StObject.set(x, "CreateAccountStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAccountStatusUndefined: Self = StObject.set(x, "CreateAccountStatus", js.undefined)
  }
}
