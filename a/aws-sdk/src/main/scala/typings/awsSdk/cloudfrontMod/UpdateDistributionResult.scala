package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDistributionResult extends StObject {
  
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typings.awsSdk.cloudfrontMod.Distribution] = js.native
  
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
}
object UpdateDistributionResult {
  
  @scala.inline
  def apply(): UpdateDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDistributionResult]
  }
  
  @scala.inline
  implicit class UpdateDistributionResultMutableBuilder[Self <: UpdateDistributionResult] (val x: Self) extends AnyVal {
    
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
