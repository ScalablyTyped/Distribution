package typings.degit

import typings.degit.anon.ClearCache
import typings.degit.anon.Stderr
import typings.degit.mod.DegitErrorCode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("degit/utils", "DegitError")
  @js.native
  class DegitError () extends Error {
    
    var code: DegitErrorCode = js.native
    
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
  
  @JSImport("degit/utils", "exec")
  @js.native
  def exec(command: String): js.Promise[Stderr] = js.native
  
  @JSImport("degit/utils", "fetch")
  @js.native
  def fetch(url: String, dest: String, proxy: String): js.Promise[Unit] = js.native
  
  @JSImport("degit/utils", "mkdirp")
  @js.native
  def mkdirp(dir: String): Unit = js.native
  
  @JSImport("degit/utils", "stashFiles")
  @js.native
  def stashFiles(dir: String, dest: String): Unit = js.native
  
  @JSImport("degit/utils", "tryRequire")
  @js.native
  def tryRequire(file: String): js.Any = js.native
  @JSImport("degit/utils", "tryRequire")
  @js.native
  def tryRequire(file: String, opts: ClearCache): js.Any = js.native
  
  @JSImport("degit/utils", "unstashFiles")
  @js.native
  def unstashFiles(dir: String, dest: String): Unit = js.native
}
