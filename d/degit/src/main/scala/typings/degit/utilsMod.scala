package typings.degit

import typings.degit.anon.ClearCache
import typings.degit.anon.Stderr
import typings.degit.mod.DegitErrorCode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("degit/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  val base: String = js.native
  
  val degitConfigName: String = js.native
  
  def exec(command: String): js.Promise[Stderr] = js.native
  
  def fetch(url: String, dest: String, proxy: String): js.Promise[Unit] = js.native
  
  def mkdirp(dir: String): Unit = js.native
  
  def stashFiles(dir: String, dest: String): Unit = js.native
  
  def tryRequire(file: String): js.Any = js.native
  def tryRequire(file: String, opts: ClearCache): js.Any = js.native
  
  def unstashFiles(dir: String, dest: String): Unit = js.native
  
  @js.native
  class DegitError () extends Error {
    
    var code: DegitErrorCode = js.native
    
    var original: js.UndefOr[Error] = js.native
    
    var ref: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
}
