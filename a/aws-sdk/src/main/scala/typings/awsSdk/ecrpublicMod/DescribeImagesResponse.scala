package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImagesResponse extends StObject {
  
  /**
    * A list of ImageDetail objects that contain data about the image.
    */
  var imageDetails: js.UndefOr[ImageDetailList] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeImages request. When the results of a DescribeImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeImagesResponse {
  
  inline def apply(): DescribeImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesResponse]
  }
  
  extension [Self <: DescribeImagesResponse](x: Self) {
    
    inline def setImageDetails(value: ImageDetailList): Self = StObject.set(x, "imageDetails", value.asInstanceOf[js.Any])
    
    inline def setImageDetailsUndefined: Self = StObject.set(x, "imageDetails", js.undefined)
    
    inline def setImageDetailsVarargs(value: ImageDetail*): Self = StObject.set(x, "imageDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
