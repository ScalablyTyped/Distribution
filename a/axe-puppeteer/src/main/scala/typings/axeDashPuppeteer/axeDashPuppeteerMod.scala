package typings.axeDashPuppeteer

import typings.axeDashPuppeteer.distOwningMod.OwningAxePuppeteer
import typings.axeDashPuppeteer.distTypesMod.IPageOptions
import typings.puppeteer.puppeteerMod.Browser
import typings.puppeteer.puppeteerMod.Frame
import typings.puppeteer.puppeteerMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-puppeteer", JSImport.Namespace)
@js.native
object axeDashPuppeteerMod extends js.Object {
  @js.native
  class AxePuppeteer protected ()
    extends typings.axeDashPuppeteer.distAxePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @js.native
  class default protected ()
    extends typings.axeDashPuppeteer.distAxePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
}

