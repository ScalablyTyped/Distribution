package typings.axePuppeteer

import typings.axeCore.mod.AxeResults
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnalyzeCB = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[AxeResults], Unit]
  
  @js.native
  trait IPageOptions extends StObject {
    
    var opts: js.UndefOr[js.Any] = js.native
    
    var source: js.UndefOr[String] = js.native
  }
  object IPageOptions {
    
    @scala.inline
    def apply(): IPageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPageOptions]
    }
    
    @scala.inline
    implicit class IPageOptionsMutableBuilder[Self <: IPageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpts(value: js.Any): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
