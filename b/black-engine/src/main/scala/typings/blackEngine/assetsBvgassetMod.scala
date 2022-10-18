package typings.blackEngine

import typings.blackEngine.assetsAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsBvgassetMod {
  
  @JSImport("black-engine/assets/BVGAsset", "BVGAsset")
  @js.native
  open class BVGAsset protected () extends Asset {
    def this(name: String, url: String) = this()
    
    /* private */ var mGraphicsData: Any = js.native
    
    /* private */ var mUrl: Any = js.native
    
    /* private */ var mXHR: Any = js.native
    
    def onLoaderRequested(factory: Any): Unit = js.native
  }
}
