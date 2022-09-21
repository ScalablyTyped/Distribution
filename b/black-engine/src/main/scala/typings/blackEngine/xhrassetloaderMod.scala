package typings.blackEngine

import typings.blackEngine.assetLoaderMod.AssetLoader
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrassetloaderMod {
  
  @JSImport("black-engine/assets/loaders/XHRAssetLoader", "XHRAssetLoader")
  @js.native
  open class XHRAssetLoader protected () extends AssetLoader {
    def this(url: Any) = this()
    
    /* protected */ var mRequest: XMLHttpRequest = js.native
    
    var mimeType: String = js.native
    
    var responseType: String = js.native
  }
}
