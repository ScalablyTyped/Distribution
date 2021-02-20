package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePlatformVersionResult extends StObject {
  
  /**
    * Detailed information about the version of the custom platform.
    */
  var PlatformSummary: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformSummary] = js.native
}
object DeletePlatformVersionResult {
  
  @scala.inline
  def apply(): DeletePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePlatformVersionResult]
  }
  
  @scala.inline
  implicit class DeletePlatformVersionResultMutableBuilder[Self <: DeletePlatformVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformSummary(value: PlatformSummary): Self = StObject.set(x, "PlatformSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformSummaryUndefined: Self = StObject.set(x, "PlatformSummary", js.undefined)
  }
}
