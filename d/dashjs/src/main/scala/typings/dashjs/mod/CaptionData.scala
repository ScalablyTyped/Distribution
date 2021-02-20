package typings.dashjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dashjs.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionData extends StObject {
  
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
  implicit class CaptionDataMutableBuilder[Self <: CaptionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCueID(value: String): Self = StObject.set(x, "cueID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCueIDUndefined: Self = StObject.set(x, "cueID", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEmbeddedImages(value: StringDictionary[String]): Self = StObject.set(x, "embeddedImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedImagesUndefined: Self = StObject.set(x, "embeddedImages", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setIsd(value: js.Object): Self = StObject.set(x, "isd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsdUndefined: Self = StObject.set(x, "isd", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: Align): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
