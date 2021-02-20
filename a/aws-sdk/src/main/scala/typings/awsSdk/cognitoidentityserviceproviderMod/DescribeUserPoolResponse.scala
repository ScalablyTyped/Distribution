package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserPoolResponse extends StObject {
  
  /**
    * The container of metadata returned by the server to describe the pool.
    */
  var UserPool: js.UndefOr[UserPoolType] = js.native
}
object DescribeUserPoolResponse {
  
  @scala.inline
  def apply(): DescribeUserPoolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolResponse]
  }
  
  @scala.inline
  implicit class DescribeUserPoolResponseMutableBuilder[Self <: DescribeUserPoolResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPool(value: UserPoolType): Self = StObject.set(x, "UserPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolUndefined: Self = StObject.set(x, "UserPool", js.undefined)
  }
}
