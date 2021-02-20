package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUsage extends StObject {
  
  /**
    * The number of Lambda functions.
    */
  var FunctionCount: js.UndefOr[Long] = js.native
  
  /**
    * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.native
}
object AccountUsage {
  
  @scala.inline
  def apply(): AccountUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUsage]
  }
  
  @scala.inline
  implicit class AccountUsageMutableBuilder[Self <: AccountUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionCount(value: Long): Self = StObject.set(x, "FunctionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionCountUndefined: Self = StObject.set(x, "FunctionCount", js.undefined)
    
    @scala.inline
    def setTotalCodeSize(value: Long): Self = StObject.set(x, "TotalCodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCodeSizeUndefined: Self = StObject.set(x, "TotalCodeSize", js.undefined)
  }
}
