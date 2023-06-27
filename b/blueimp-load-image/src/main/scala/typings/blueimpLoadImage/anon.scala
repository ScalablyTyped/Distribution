package typings.blueimpLoadImage

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<blueimp-load-image.blueimp-load-image.Exif, 'map'> */
  trait PickExifmap extends StObject {
    
    var map: Record[String, Double]
  }
  object PickExifmap {
    
    inline def apply(map: Record[String, Double]): PickExifmap = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickExifmap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickExifmap] (val x: Self) extends AnyVal {
      
      inline def setMap(value: Record[String, Double]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
}
