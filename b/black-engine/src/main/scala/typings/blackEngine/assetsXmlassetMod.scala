package typings.blackEngine

import typings.blackEngine.assetsAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsXmlassetMod {
  
  @JSImport("black-engine/assets/XMLAsset", "XMLAsset")
  @js.native
  open class XMLAsset protected () extends Asset {
    def this(name: String, url: String) = this()
    
    /* private */ var mUrl: Any = js.native
    
    /* private */ var mXHR: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
