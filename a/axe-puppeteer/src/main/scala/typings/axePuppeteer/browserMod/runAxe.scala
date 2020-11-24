package typings.axePuppeteer.browserMod

import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axe-puppeteer/dist/browser", "runAxe")
@js.native
object runAxe extends js.Object {
  
  def apply(): js.Promise[AxeResults] = js.native
  def apply(config: js.UndefOr[scala.Nothing], context: js.UndefOr[ElementContext], options: RunOptions): js.Promise[AxeResults] = js.native
  def apply(config: js.UndefOr[scala.Nothing], context: ElementContext): js.Promise[AxeResults] = js.native
  def apply(config: Spec): js.Promise[AxeResults] = js.native
  def apply(config: Spec, context: js.UndefOr[ElementContext], options: RunOptions): js.Promise[AxeResults] = js.native
  def apply(config: Spec, context: ElementContext): js.Promise[AxeResults] = js.native
}
