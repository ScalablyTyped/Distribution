package typings
package cmdDashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cmd-shim", JSImport.Namespace)
@js.native
object cmdDashShimMod extends js.Object {
  def apply(from: java.lang.String, to: java.lang.String, cb: js.Function1[/* err */ js.Any, scala.Unit]): js.UndefOr[scala.Nothing] = js.native
  /**
    * Create a cmd shim at `to` for the command line program at `from`, but will just
    * continue if the file does not exist.
    *
    *     var cmdShim = require('cmd-shim');
    *     cmdShim.ifExists(__dirname + '/cli.js', '/usr/bin/command-name', function (err) {
    *         if (err) throw err;
    *     });
    */
  def ifExists(from: java.lang.String, to: java.lang.String, cb: js.Function1[/* err */ js.Any, scala.Unit]): js.UndefOr[scala.Nothing] = js.native
}

