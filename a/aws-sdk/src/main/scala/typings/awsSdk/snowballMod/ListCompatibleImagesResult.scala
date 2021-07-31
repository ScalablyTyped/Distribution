package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCompatibleImagesResult extends StObject {
  
  /**
    * A JSON-formatted object that describes a compatible AMI, including the ID and name for a Snow device AMI.
    */
  var CompatibleImages: js.UndefOr[CompatibleImageList] = js.undefined
  
  /**
    * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListCompatibleImagesResult {
  
  @scala.inline
  def apply(): ListCompatibleImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompatibleImagesResult]
  }
  
  @scala.inline
  implicit class ListCompatibleImagesResultMutableBuilder[Self <: ListCompatibleImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleImages(value: CompatibleImageList): Self = StObject.set(x, "CompatibleImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleImagesUndefined: Self = StObject.set(x, "CompatibleImages", js.undefined)
    
    @scala.inline
    def setCompatibleImagesVarargs(value: CompatibleImage*): Self = StObject.set(x, "CompatibleImages", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
