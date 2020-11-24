package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerProcess extends js.Object {
  
  /**
    * The number of server processes that use this configuration to run concurrently on an instance.
    */
  var ConcurrentExecutions: PositiveInteger = js.native
  
  /**
    * The location of the server executable in a custom game build or the name of the Realtime script file that contains the Init() function. Game builds and Realtime scripts are installed on instances at the root:    Windows (for custom game builds only): C:\game. Example: "C:\game\MyGame\server.exe"    Linux: /local/game. Examples: "/local/game/MyGame/server.exe" or "/local/game/MyRealtimeScript.js"  
    */
  var LaunchPath: NonZeroAndMaxString = js.native
  
  /**
    * An optional list of parameters to pass to the server executable or Realtime script on launch.
    */
  var Parameters: js.UndefOr[NonZeroAndMaxString] = js.native
}
object ServerProcess {
  
  @scala.inline
  def apply(ConcurrentExecutions: PositiveInteger, LaunchPath: NonZeroAndMaxString): ServerProcess = {
    val __obj = js.Dynamic.literal(ConcurrentExecutions = ConcurrentExecutions.asInstanceOf[js.Any], LaunchPath = LaunchPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerProcess]
  }
  
  @scala.inline
  implicit class ServerProcessOps[Self <: ServerProcess] (val x: Self) extends AnyVal {
    
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
    def setConcurrentExecutions(value: PositiveInteger): Self = this.set("ConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPath(value: NonZeroAndMaxString): Self = this.set("LaunchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: NonZeroAndMaxString): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
