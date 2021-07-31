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
  
  @scala.inline
  def apply(): DescribeFpgaImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImagesResult]
  }
  
  @scala.inline
  implicit class DescribeFpgaImagesResultMutableBuilder[Self <: DescribeFpgaImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFpgaImages(value: FpgaImageList): Self = StObject.set(x, "FpgaImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImagesUndefined: Self = StObject.set(x, "FpgaImages", js.undefined)
    
    @scala.inline
    def setFpgaImagesVarargs(value: FpgaImage*): Self = StObject.set(x, "FpgaImages", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
