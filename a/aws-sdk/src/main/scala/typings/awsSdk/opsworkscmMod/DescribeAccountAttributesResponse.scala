package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesResponse extends StObject {
  
  /**
    *  The attributes that are currently set for the account. 
    */
  var Attributes: js.UndefOr[AccountAttributes] = js.undefined
}
object DescribeAccountAttributesResponse {
  
  inline def apply(): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
  
  extension [Self <: DescribeAccountAttributesResponse](x: Self) {
    
    inline def setAttributes(value: AccountAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AccountAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}
