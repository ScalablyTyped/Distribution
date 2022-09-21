package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileStats extends StObject {
  
  val deferred: Double
  
  val deferredSize: js.UndefOr[Double] = js.undefined
  
  val dts: Double
  
  val dtsSize: js.UndefOr[Double] = js.undefined
  
  val jsSize: js.UndefOr[Double] = js.undefined
  
  @JSName("js")
  val js_ : Double
  
  val jsx: Double
  
  val jsxSize: js.UndefOr[Double] = js.undefined
  
  val ts: Double
  
  val tsSize: js.UndefOr[Double] = js.undefined
  
  val tsx: Double
  
  val tsxSize: js.UndefOr[Double] = js.undefined
}
object FileStats {
  
  inline def apply(deferred: Double, dts: Double, js_ : Double, jsx: Double, ts: Double, tsx: Double): FileStats = {
    val __obj = js.Dynamic.literal(deferred = deferred.asInstanceOf[js.Any], dts = dts.asInstanceOf[js.Any], jsx = jsx.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], tsx = tsx.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStats]
  }
  
  extension [Self <: FileStats](x: Self) {
    
    inline def setDeferred(value: Double): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setDeferredSize(value: Double): Self = StObject.set(x, "deferredSize", value.asInstanceOf[js.Any])
    
    inline def setDeferredSizeUndefined: Self = StObject.set(x, "deferredSize", js.undefined)
    
    inline def setDts(value: Double): Self = StObject.set(x, "dts", value.asInstanceOf[js.Any])
    
    inline def setDtsSize(value: Double): Self = StObject.set(x, "dtsSize", value.asInstanceOf[js.Any])
    
    inline def setDtsSizeUndefined: Self = StObject.set(x, "dtsSize", js.undefined)
    
    inline def setJsSize(value: Double): Self = StObject.set(x, "jsSize", value.asInstanceOf[js.Any])
    
    inline def setJsSizeUndefined: Self = StObject.set(x, "jsSize", js.undefined)
    
    inline def setJs_(value: Double): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
    
    inline def setJsx(value: Double): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
    
    inline def setJsxSize(value: Double): Self = StObject.set(x, "jsxSize", value.asInstanceOf[js.Any])
    
    inline def setJsxSizeUndefined: Self = StObject.set(x, "jsxSize", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsSize(value: Double): Self = StObject.set(x, "tsSize", value.asInstanceOf[js.Any])
    
    inline def setTsSizeUndefined: Self = StObject.set(x, "tsSize", js.undefined)
    
    inline def setTsx(value: Double): Self = StObject.set(x, "tsx", value.asInstanceOf[js.Any])
    
    inline def setTsxSize(value: Double): Self = StObject.set(x, "tsxSize", value.asInstanceOf[js.Any])
    
    inline def setTsxSizeUndefined: Self = StObject.set(x, "tsxSize", js.undefined)
  }
}
