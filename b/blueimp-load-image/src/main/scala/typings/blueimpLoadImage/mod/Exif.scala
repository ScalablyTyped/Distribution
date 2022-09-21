package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.blueimpLoadImage.blueimpLoadImageStrings.GPSInfo
import typings.blueimpLoadImage.blueimpLoadImageStrings.Interoperability
import typings.blueimpLoadImage.blueimpLoadImageStrings.Thumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exif
  extends StObject
     with /* tag */ NumberDictionary[ExifTagValue] {
  
  def get(
    tagName: typings.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typings.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability
  ): ExifTagValue
}
object Exif {
  
  inline def apply(
    get: typings.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typings.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability => ExifTagValue
  ): Exif = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Exif]
  }
  
  extension [Self <: Exif](x: Self) {
    
    inline def setGet(
      value: typings.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typings.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability => ExifTagValue
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
