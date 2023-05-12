package typings.chrome.chrome.downloads

import typings.chrome.chromeInts.`16`
import typings.chrome.chromeInts.`32`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileIconOptions extends StObject {
  
  /** Optional. * The size of the returned icon. The icon will be square with dimensions size * size pixels. The default and largest size for the icon is 32x32 pixels. The only supported sizes are 16 and 32. It is an error to specify any other size.
    */
  var size: js.UndefOr[`16` | `32`] = js.undefined
}
object GetFileIconOptions {
  
  inline def apply(): GetFileIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFileIconOptions] (val x: Self) extends AnyVal {
    
    inline def setSize(value: `16` | `32`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
