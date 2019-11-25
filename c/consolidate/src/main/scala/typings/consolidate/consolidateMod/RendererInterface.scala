package typings.consolidate.consolidateMod

import typings.consolidate.Anon_Cache
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererInterface extends js.Object {
  def apply(path: String): typings.bluebird.bluebirdMod.^[String] = js.native
  def apply(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  def apply(path: String, options: Anon_Cache): typings.bluebird.bluebirdMod.^[String] = js.native
  def apply(path: String, options: Anon_Cache, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  def render(path: String): typings.bluebird.bluebirdMod.^[String] = js.native
  def render(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  def render(path: String, options: Anon_Cache): typings.bluebird.bluebirdMod.^[String] = js.native
  def render(path: String, options: Anon_Cache, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
}

