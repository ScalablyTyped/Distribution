package typings.axeDashPuppeteer.distBrowserMod

import typings.axeDashCore.axeDashCoreMod.AxeResults
import typings.axeDashCore.axeDashCoreMod.ElementContext
import typings.axeDashCore.axeDashCoreMod.RunOptions
import typings.axeDashCore.axeDashCoreMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-puppeteer/dist/browser", "runAxe")
@js.native
object runAxe extends js.Object {
  def apply(): js.Promise[AxeResults] = js.native
  def apply(config: Spec): js.Promise[AxeResults] = js.native
  def apply(config: Spec, context: ElementContext): js.Promise[AxeResults] = js.native
  def apply(config: Spec, context: ElementContext, options: RunOptions): js.Promise[AxeResults] = js.native
}

