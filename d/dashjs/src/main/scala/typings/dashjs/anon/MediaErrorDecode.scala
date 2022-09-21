package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaErrorDecode extends StObject {
  
  var mediaErrorDecode: js.UndefOr[Double] = js.undefined
}
object MediaErrorDecode {
  
  inline def apply(): MediaErrorDecode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaErrorDecode]
  }
  
  extension [Self <: MediaErrorDecode](x: Self) {
    
    inline def setMediaErrorDecode(value: Double): Self = StObject.set(x, "mediaErrorDecode", value.asInstanceOf[js.Any])
    
    inline def setMediaErrorDecodeUndefined: Self = StObject.set(x, "mediaErrorDecode", js.undefined)
  }
}
