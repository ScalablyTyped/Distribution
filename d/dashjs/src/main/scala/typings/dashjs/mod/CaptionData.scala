package typings.dashjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dashjs.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionData extends js.Object {
  
  var cueID: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var embeddedImages: js.UndefOr[StringDictionary[String]] = js.native
  
  var end: Double = js.native
  
  var images: js.UndefOr[js.Array[String]] = js.native
  
  var isd: js.UndefOr[js.Object] = js.native
  
  var start: Double = js.native
  
  var styles: js.UndefOr[Align] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object CaptionData {
  
  @scala.inline
  def apply(end: Double, start: Double): CaptionData = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionData]
  }
  
  @scala.inline
  implicit class CaptionDataOps[Self <: CaptionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCueID(value: String): Self = this.set("cueID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCueID: Self = this.set("cueID", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEmbeddedImages(value: StringDictionary[String]): Self = this.set("embeddedImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedImages: Self = this.set("embeddedImages", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: String*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setIsd(value: js.Object): Self = this.set("isd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsd: Self = this.set("isd", js.undefined)
    
    @scala.inline
    def setStyles(value: Align): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
