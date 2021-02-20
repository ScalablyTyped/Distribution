package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerProcess extends StObject {
  
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
  implicit class ServerProcessMutableBuilder[Self <: ServerProcess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcurrentExecutions(value: PositiveInteger): Self = StObject.set(x, "ConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPath(value: NonZeroAndMaxString): Self = StObject.set(x, "LaunchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: NonZeroAndMaxString): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
