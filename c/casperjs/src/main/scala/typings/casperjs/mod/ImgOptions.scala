package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImgOptions extends StObject {
  
  // format to set the image format manually, avoiding relying on the filename
  var format: js.UndefOr[String] = js.native
  
  // quality to set the image quality, from 1 to 100
  var quality: js.UndefOr[Double] = js.native
}
object ImgOptions {
  
  @scala.inline
  def apply(): ImgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgOptions]
  }
  
  @scala.inline
  implicit class ImgOptionsMutableBuilder[Self <: ImgOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
