package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlatformVersionRequest extends StObject {
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.undefined
}
object DescribePlatformVersionRequest {
  
  inline def apply(): DescribePlatformVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlatformVersionRequest]
  }
  
  extension [Self <: DescribePlatformVersionRequest](x: Self) {
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
  }
}
