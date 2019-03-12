package typings
package consolidateLib.consolidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererInterface extends js.Object {
  def apply(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def apply(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def apply(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def apply(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def render(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def render(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def render(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def render(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
}

