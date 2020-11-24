package typings.chromeLauncher.chromeLauncherMod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchedChrome extends js.Object {
  
  def kill(): js.Promise[js.Object] = js.native
  
  var pid: Double = js.native
  
  var port: Double = js.native
  
  var process: ChildProcess = js.native
}
object LaunchedChrome {
  
  @scala.inline
  def apply(kill: () => js.Promise[js.Object], pid: Double, port: Double, process: ChildProcess): LaunchedChrome = {
    val __obj = js.Dynamic.literal(kill = js.Any.fromFunction0(kill), pid = pid.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchedChrome]
  }
  
  @scala.inline
  implicit class LaunchedChromeOps[Self <: LaunchedChrome] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKill(value: () => js.Promise[js.Object]): Self = this.set("kill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: ChildProcess): Self = this.set("process", value.asInstanceOf[js.Any])
  }
}
