package typings.blackEngine

import typings.blackEngine.assetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonassetMod {
  
  @JSImport("black-engine/assets/JSONAsset", "JSONAsset")
  @js.native
  open class JSONAsset protected () extends Asset {
    def this(name: String, url: String) = this()
    
    /* private */ var mUrl: Any = js.native
    
    /* private */ var mXHR: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
