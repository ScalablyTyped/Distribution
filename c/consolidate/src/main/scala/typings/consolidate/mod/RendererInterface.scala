package typings.consolidate.mod

import typings.consolidate.anon.DictotherOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererInterface extends js.Object {
  
  def apply(path: String): typings.bluebird.mod.^[String] = js.native
  def apply(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  def apply(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
  def apply(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  
  def render(path: String): typings.bluebird.mod.^[String] = js.native
  def render(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  def render(path: String, options: DictotherOptions): typings.bluebird.mod.^[String] = js.native
  def render(path: String, options: DictotherOptions, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
}
