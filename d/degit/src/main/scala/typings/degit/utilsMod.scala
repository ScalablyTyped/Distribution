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
  class DegitError ()
    extends StObject
       with Error {
    
    var code: DegitErrorCode = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var original: js.UndefOr[Error] = js.native
    
    var ref: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  
  @JSImport("degit/utils", "base")
  @js.native
  val base: String = js.native
  
  @JSImport("degit/utils", "degitConfigName")
  @js.native
  val degitConfigName: String = js.native
  
  @scala.inline
  def exec(command: String): js.Promise[Stderr] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stderr]]
  
  @scala.inline
  def fetch(url: String, dest: String, proxy: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], proxy.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def mkdirp(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def stashFiles(dir: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stashFiles")(dir.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def tryRequire(file: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tryRequire")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def tryRequire(file: String, opts: ClearCache): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tryRequire")(file.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def unstashFiles(dir: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstashFiles")(dir.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
