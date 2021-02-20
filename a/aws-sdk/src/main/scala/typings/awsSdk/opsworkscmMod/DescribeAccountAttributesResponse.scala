package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAttributesResponse extends StObject {
  
  /**
    *  The attributes that are currently set for the account. 
    */
  var Attributes: js.UndefOr[AccountAttributes] = js.native
}
object DescribeAccountAttributesResponse {
  
  @scala.inline
  def apply(): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
  
  @scala.inline
  implicit class DescribeAccountAttributesResponseMutableBuilder[Self <: DescribeAccountAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AccountAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: AccountAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}
