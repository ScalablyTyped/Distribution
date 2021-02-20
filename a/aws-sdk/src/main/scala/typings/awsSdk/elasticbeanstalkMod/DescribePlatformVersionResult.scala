package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlatformVersionResult extends StObject {
  
  /**
    * Detailed information about the platform version.
    */
  var PlatformDescription: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformDescription] = js.native
}
object DescribePlatformVersionResult {
  
  @scala.inline
  def apply(): DescribePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlatformVersionResult]
  }
  
  @scala.inline
  implicit class DescribePlatformVersionResultMutableBuilder[Self <: DescribePlatformVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformDescription(value: PlatformDescription): Self = StObject.set(x, "PlatformDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformDescriptionUndefined: Self = StObject.set(x, "PlatformDescription", js.undefined)
  }
}
