package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayImageOptions
  extends StObject
     with BoxOptions {
  
  /**
    * Render the file as ANSI art instead of using w3m to overlay Internally uses the
    * ANSIImage element. See the ANSIImage element for more information/options. (Default: true).
    */
  var ansi: Boolean
  
  /**
    * Path to image.
    */
  var file: String
  
  /**
    * Whether to search /usr, /bin, and /lib for w3mimgdisplay (Default: true).
    */
  var search: String
  
  /**
    * Path to w3mimgdisplay. If a proper w3mimgdisplay path is not given, blessed will
    * search the entire disk for the binary.
    */
  var w3m: String
}
object OverlayImageOptions {
  
  inline def apply(ansi: Boolean, file: String, search: String, w3m: String): OverlayImageOptions = {
    val __obj = js.Dynamic.literal(ansi = ansi.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], w3m = w3m.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayImageOptions] (val x: Self) extends AnyVal {
    
    inline def setAnsi(value: Boolean): Self = StObject.set(x, "ansi", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setW3m(value: String): Self = StObject.set(x, "w3m", value.asInstanceOf[js.Any])
  }
}
