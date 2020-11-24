package typings.axePuppeteer

import typings.axePuppeteer.axePuppeteerMod.AxePuppeteer
import typings.axePuppeteer.typesMod.IPageOptions
import typings.puppeteer.mod.Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axe-puppeteer/dist/owning", JSImport.Namespace)
@js.native
object owningMod extends js.Object {
  
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
  
  @js.native
  trait OwningAxePuppeteer extends AxePuppeteer {
    
    var page: js.Any = js.native
  }
}
