package typings.axeCorePuppeteer

import typings.axeCore.mod.AxeResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnalyzeCB = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[AxeResults], Unit]
  
  trait IPageOptions extends StObject {
    
    var opts: js.UndefOr[Any] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object IPageOptions {
    
    inline def apply(): IPageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPageOptions]
    }
    
    extension [Self <: IPageOptions](x: Self) {
      
      inline def setOpts(value: Any): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type PartialResults = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(partialResults : axe-core.axe-core.PartialResults, options : axe-core.axe-core.RunOptions): std.Promise<axe-core.axe-core.AxeResults>>[0] */ js.Any
}
