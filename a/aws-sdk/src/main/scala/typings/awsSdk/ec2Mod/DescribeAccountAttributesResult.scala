package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAttributesResult extends StObject {
  
  /**
    * Information about the account attributes.
    */
  var AccountAttributes: js.UndefOr[AccountAttributeList] = js.native
}
object DescribeAccountAttributesResult {
  
  @scala.inline
  def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  
  @scala.inline
  implicit class DescribeAccountAttributesResultMutableBuilder[Self <: DescribeAccountAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAttributes(value: AccountAttributeList): Self = StObject.set(x, "AccountAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAttributesUndefined: Self = StObject.set(x, "AccountAttributes", js.undefined)
    
    @scala.inline
    def setAccountAttributesVarargs(value: AccountAttribute*): Self = StObject.set(x, "AccountAttributes", js.Array(value :_*))
  }
}
