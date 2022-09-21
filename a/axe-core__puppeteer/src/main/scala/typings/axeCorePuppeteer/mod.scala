package typings.axeCorePuppeteer

import typings.axeCorePuppeteer.loadPageMod.OwningAxePuppeteer
import typings.axeCorePuppeteer.typesMod.IPageOptions
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.Frame
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@axe-core/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@axe-core/puppeteer", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.axeCorePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @JSImport("@axe-core/puppeteer", "AxePuppeteer")
  @js.native
  open class AxePuppeteer protected ()
    extends typings.axeCorePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  inline def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPage")(browser.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OwningAxePuppeteer]]
  inline def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPage")(browser.asInstanceOf[js.Any], url.asInstanceOf[js.Any], pageOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OwningAxePuppeteer]]
}
