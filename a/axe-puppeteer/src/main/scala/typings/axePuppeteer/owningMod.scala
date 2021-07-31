package typings.axePuppeteer

import typings.axePuppeteer.axePuppeteerMod.AxePuppeteer
import typings.axePuppeteer.typesMod.IPageOptions
import typings.puppeteer.mod.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object owningMod {
  
  @JSImport("axe-puppeteer/dist/owning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPage")(browser.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OwningAxePuppeteer]]
  @scala.inline
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPage")(browser.asInstanceOf[js.Any], url.asInstanceOf[js.Any], pageOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OwningAxePuppeteer]]
  
  @js.native
  trait OwningAxePuppeteer extends AxePuppeteer {
    
    var page: js.Any = js.native
  }
}
