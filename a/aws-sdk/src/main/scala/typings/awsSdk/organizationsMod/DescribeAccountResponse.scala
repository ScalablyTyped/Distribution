package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountResponse extends StObject {
  
  /**
    * A structure that contains information about the requested account.
    */
  var Account: js.UndefOr[typings.awsSdk.organizationsMod.Account] = js.native
}
object DescribeAccountResponse {
  
  @scala.inline
  def apply(): DescribeAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountResponseMutableBuilder[Self <: DescribeAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
