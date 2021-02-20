package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionLatestCacheResetResult extends StObject {
  
  /**
    * The timestamp of the last cache reset (e.g., 1479734909.17) in Unix time format.
    */
  var createTime: js.UndefOr[IsoDate] = js.native
  
  /**
    * The status of the last cache reset.
    */
  var status: js.UndefOr[String] = js.native
}
object GetDistributionLatestCacheResetResult {
  
  @scala.inline
  def apply(): GetDistributionLatestCacheResetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionLatestCacheResetResult]
  }
  
  @scala.inline
  implicit class GetDistributionLatestCacheResetResultMutableBuilder[Self <: GetDistributionLatestCacheResetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: IsoDate): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
