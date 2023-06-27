package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.blueimpLoadImage.blueimpLoadImageStrings.GPSInfo
import typings.blueimpLoadImage.blueimpLoadImageStrings.Interoperability
import typings.blueimpLoadImage.blueimpLoadImageStrings.Thumbnail
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exif
  extends StObject
     with /* tag */ NumberDictionary[ExifTagValue] {
  
  def get(
    tagName: typings.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typings.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability
  ): ExifTagValue
  
  var map: Record[String, Double]
}
object Exif {
  
  inline def apply(
    get: typings.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typings.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability => ExifTagValue,
    map: Record[String, Double]
  ): Exif = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exif]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exif] (val x: Self) extends AnyVal {
    
    inline def setGet(
      value: typings.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typings.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability => ExifTagValue
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setMap(value: Record[String, Double]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
