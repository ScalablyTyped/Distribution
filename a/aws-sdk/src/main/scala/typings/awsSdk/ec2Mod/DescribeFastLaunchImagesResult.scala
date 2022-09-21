package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFastLaunchImagesResult extends StObject {
  
  /**
    * A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
    */
  var FastLaunchImages: js.UndefOr[DescribeFastLaunchImagesSuccessSet] = js.undefined
  
  /**
    * The token to use for the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeFastLaunchImagesResult {
  
  inline def apply(): DescribeFastLaunchImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastLaunchImagesResult]
  }
  
  extension [Self <: DescribeFastLaunchImagesResult](x: Self) {
    
    inline def setFastLaunchImages(value: DescribeFastLaunchImagesSuccessSet): Self = StObject.set(x, "FastLaunchImages", value.asInstanceOf[js.Any])
    
    inline def setFastLaunchImagesUndefined: Self = StObject.set(x, "FastLaunchImages", js.undefined)
    
    inline def setFastLaunchImagesVarargs(value: DescribeFastLaunchImagesSuccessItem*): Self = StObject.set(x, "FastLaunchImages", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
