package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFpgaImagesResult extends StObject {
  
  /**
    * Information about the FPGA images.
    */
  var FpgaImages: js.UndefOr[FpgaImageList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
}
object DescribeFpgaImagesResult {
  
  inline def apply(): DescribeFpgaImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImagesResult]
  }
  
  extension [Self <: DescribeFpgaImagesResult](x: Self) {
    
    inline def setFpgaImages(value: FpgaImageList): Self = StObject.set(x, "FpgaImages", value.asInstanceOf[js.Any])
    
    inline def setFpgaImagesUndefined: Self = StObject.set(x, "FpgaImages", js.undefined)
    
    inline def setFpgaImagesVarargs(value: FpgaImage*): Self = StObject.set(x, "FpgaImages", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
