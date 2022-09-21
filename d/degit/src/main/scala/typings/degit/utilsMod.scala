package typings.degit

import typings.degit.anon.ClearCache
import typings.degit.anon.Stderr
import typings.degit.mod.DegitErrorCode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("degit/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("degit/utils", "DegitError")
  @js.native
  open class DegitError ()
    extends StObject
       with Error {
    
    var code: DegitErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var original: js.UndefOr[js.Error] = js.native
    
    var ref: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  
  @JSImport("degit/utils", "base")
  @js.native
  val base: String = js.native
  
  @JSImport("degit/utils", "degitConfigName")
  @js.native
  val degitConfigName: String = js.native
  
  inline def exec(command: String): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
  
  inline def fetch(url: String, dest: String, proxy: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], proxy.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def mkdirp(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stashFiles(dir: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashFiles")(dir.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tryRequire(file: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tryRequire")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def tryRequire(file: String, opts: ClearCache): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tryRequire")(file.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unstashFiles(dir: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstashFiles")(dir.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
