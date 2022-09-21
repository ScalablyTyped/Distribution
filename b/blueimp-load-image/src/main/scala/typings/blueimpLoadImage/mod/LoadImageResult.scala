package typings.blueimpLoadImage.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadImageResult
  extends StObject
     with MetaData {
  
  var image: HTMLImageElement | HTMLCanvasElement
}
object LoadImageResult {
  
  inline def apply(image: HTMLImageElement | HTMLCanvasElement): LoadImageResult = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadImageResult]
  }
  
  extension [Self <: LoadImageResult](x: Self) {
    
    inline def setImage(value: HTMLImageElement | HTMLCanvasElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
