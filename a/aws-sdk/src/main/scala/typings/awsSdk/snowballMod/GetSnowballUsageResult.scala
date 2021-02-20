package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnowballUsageResult extends StObject {
  
  /**
    * The service limit for number of Snow devices this account can have at once. The default service limit is 1 (one).
    */
  var SnowballLimit: js.UndefOr[Integer] = js.native
  
  /**
    * The number of Snow devices that this account is currently using.
    */
  var SnowballsInUse: js.UndefOr[Integer] = js.native
}
object GetSnowballUsageResult {
  
  @scala.inline
  def apply(): GetSnowballUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnowballUsageResult]
  }
  
  @scala.inline
  implicit class GetSnowballUsageResultMutableBuilder[Self <: GetSnowballUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnowballLimit(value: Integer): Self = StObject.set(x, "SnowballLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballLimitUndefined: Self = StObject.set(x, "SnowballLimit", js.undefined)
    
    @scala.inline
    def setSnowballsInUse(value: Integer): Self = StObject.set(x, "SnowballsInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballsInUseUndefined: Self = StObject.set(x, "SnowballsInUse", js.undefined)
  }
}
