package typings.axeCorePuppeteer

import typings.axeCorePuppeteer.distAxePuppeteerMod.AxePuppeteer
import typings.axeCorePuppeteer.distTypesMod.IPageOptions
import typings.puppeteer.mod.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoadPageMod {
  
  @JSImport("@axe-core/puppeteer/dist/load-page", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPage")(browser.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OwningAxePuppeteer]]
  inline def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPage")(browser.asInstanceOf[js.Any], url.asInstanceOf[js.Any], pageOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OwningAxePuppeteer]]
  
  @js.native
  trait OwningAxePuppeteer extends AxePuppeteer {
    
    /* private */ var newPage: Any = js.native
  }
}
