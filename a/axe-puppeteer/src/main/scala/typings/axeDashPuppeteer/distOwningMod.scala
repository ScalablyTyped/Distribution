package typings.axeDashPuppeteer

import typings.axeDashPuppeteer.distAxePuppeteerMod.AxePuppeteer
import typings.axeDashPuppeteer.distTypesMod.IPageOptions
import typings.puppeteer.puppeteerMod.Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-puppeteer/dist/owning", JSImport.Namespace)
@js.native
object distOwningMod extends js.Object {
  @js.native
  trait OwningAxePuppeteer extends AxePuppeteer {
    var page: js.Any = js.native
  }
  
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
}

