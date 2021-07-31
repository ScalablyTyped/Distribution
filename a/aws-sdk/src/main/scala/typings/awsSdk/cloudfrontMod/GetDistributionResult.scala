package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionResult extends StObject {
  
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typings.awsSdk.cloudfrontMod.Distribution] = js.undefined
  
  /**
    * The current version of the distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetDistributionResult {
  
  @scala.inline
  def apply(): GetDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionResult]
  }
  
  @scala.inline
  implicit class GetDistributionResultMutableBuilder[Self <: GetDistributionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
