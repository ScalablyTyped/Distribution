package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcTenancyResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object ModifyVpcTenancyResult {
  
  @scala.inline
  def apply(): ModifyVpcTenancyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcTenancyResult]
  }
  
  @scala.inline
  implicit class ModifyVpcTenancyResultMutableBuilder[Self <: ModifyVpcTenancyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
