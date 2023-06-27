package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.anon.PickExifmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteExifData extends StObject {
  
  var exif: PickExifmap
  
  var exifOffsets: ExifMap
}
object WriteExifData {
  
  inline def apply(exif: PickExifmap, exifOffsets: ExifMap): WriteExifData = {
    val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], exifOffsets = exifOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteExifData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteExifData] (val x: Self) extends AnyVal {
    
    inline def setExif(value: PickExifmap): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
    
    inline def setExifOffsets(value: ExifMap): Self = StObject.set(x, "exifOffsets", value.asInstanceOf[js.Any])
  }
}
