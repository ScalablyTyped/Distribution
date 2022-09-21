package typings.brotliWebpackPlugin

import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("brotli-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: Options) = this()
  }
  
  type BrotliWebpackPlugin = Plugin
  
  trait Options extends StObject {
    
    /**
      * The target asset name. Defaults to `'[path].br[query]'`.
      *
      * - `[file]` is replaced with the original asset file name.
      * - `[fileWithoutExt]` is replaced with the file name minus its extension, e.g. the `style` of `style.css`.
      * - `[ext]` is replaced with the file name extension, e.g. the `css` of `style.css`.
      * - `[path]` is replaced with the path of the original asset.
      * - `[query]` is replaced with the query.
      */
    var asset: js.UndefOr[String] = js.undefined
    
    /**
      * Remove original files that were compressed with brotli. Default: `false`.
      */
    var deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only assets that compress better that this ratio are processed. Defaults to `0.8`.
      */
    var minRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * All assets matching this RegExp are processed. Defaults to every asset.
      */
    var test: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Only assets bigger than this size (in bytes) are processed. Defaults to `0`.
      */
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
      
      inline def setDeleteOriginalAssets(value: Boolean): Self = StObject.set(x, "deleteOriginalAssets", value.asInstanceOf[js.Any])
      
      inline def setDeleteOriginalAssetsUndefined: Self = StObject.set(x, "deleteOriginalAssets", js.undefined)
      
      inline def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
      
      inline def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
      
      inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
