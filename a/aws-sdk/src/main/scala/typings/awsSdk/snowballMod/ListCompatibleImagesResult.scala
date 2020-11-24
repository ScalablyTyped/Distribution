package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCompatibleImagesResult extends js.Object {
  
  /**
    * A JSON-formatted object that describes a compatible AMI, including the ID and name for a Snow device AMI.
    */
  var CompatibleImages: js.UndefOr[CompatibleImageList] = js.native
  
  /**
    * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListCompatibleImagesResult {
  
  @scala.inline
  def apply(): ListCompatibleImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompatibleImagesResult]
  }
  
  @scala.inline
  implicit class ListCompatibleImagesResultOps[Self <: ListCompatibleImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompatibleImagesVarargs(value: CompatibleImage*): Self = this.set("CompatibleImages", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleImages(value: CompatibleImageList): Self = this.set("CompatibleImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleImages: Self = this.set("CompatibleImages", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
