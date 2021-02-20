package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayImageOptions extends BoxOptions {
  
  /**
    * Render the file as ANSI art instead of using w3m to overlay Internally uses the
    * ANSIImage element. See the ANSIImage element for more information/options. (Default: true).
    */
  var ansi: Boolean = js.native
  
  /**
    * Path to image.
    */
  var file: String = js.native
  
  /**
    * Whether to search /usr, /bin, and /lib for w3mimgdisplay (Default: true).
    */
  var search: String = js.native
  
  /**
    * Path to w3mimgdisplay. If a proper w3mimgdisplay path is not given, blessed will
    * search the entire disk for the binary.
    */
  var w3m: String = js.native
}
object OverlayImageOptions {
  
  @scala.inline
  def apply(ansi: Boolean, file: String, search: String, w3m: String): OverlayImageOptions = {
    val __obj = js.Dynamic.literal(ansi = ansi.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], w3m = w3m.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayImageOptions]
  }
  
  @scala.inline
  implicit class OverlayImageOptionsMutableBuilder[Self <: OverlayImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi(value: Boolean): Self = StObject.set(x, "ansi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW3m(value: String): Self = StObject.set(x, "w3m", value.asInstanceOf[js.Any])
  }
}
