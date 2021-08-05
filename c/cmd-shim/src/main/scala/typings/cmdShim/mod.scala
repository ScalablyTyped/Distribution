package typings.cmdShim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(from: String, to: String, cb: js.Function1[/* err */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("cmd-shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a cmd shim at `to` for the command line program at `from`, but will just
    * continue if the file does not exist.
    *
    *     var cmdShim = require('cmd-shim');
    *     cmdShim.ifExists(__dirname + '/cli.js', '/usr/bin/command-name', function (err) {
    *         if (err) throw err;
    *     });
    */
  inline def ifExists(from: String, to: String, cb: js.Function1[/* err */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ifExists")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
