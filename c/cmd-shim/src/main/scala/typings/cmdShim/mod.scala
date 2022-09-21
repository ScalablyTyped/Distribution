package typings.cmdShim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(from: String, to: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("cmd-shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a cmd shim at `to` for the command line program at `from`, but will just
    * continue if the file does not exist.
    *
    * cmdShim.ifExists(__dirname + '/cli.js', '/usr/bin/command-name');
    */
  inline def ifExists(from: String, to: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifExists")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
