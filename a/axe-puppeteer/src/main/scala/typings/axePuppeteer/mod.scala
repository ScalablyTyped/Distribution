package typings.axePuppeteer

import typings.axePuppeteer.owningMod.OwningAxePuppeteer
import typings.axePuppeteer.typesMod.IPageOptions
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.Frame
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axe-puppeteer", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @JSImport("axe-puppeteer", "AxePuppeteer")
  @js.native
  class AxePuppeteer protected ()
    extends typings.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @JSImport("axe-puppeteer", "loadPage")
  @js.native
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  @JSImport("axe-puppeteer", "loadPage")
  @js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
}
