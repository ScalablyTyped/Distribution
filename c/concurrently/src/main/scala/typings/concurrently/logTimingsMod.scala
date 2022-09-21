package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.TimestampFormat
import typings.concurrently.commandMod.CloseEvent
import typings.concurrently.commandMod.Command
import typings.concurrently.flowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logTimingsMod {
  
  @JSImport("concurrently/dist/src/flow-control/log-timings", "LogTimings")
  @js.native
  open class LogTimings protected ()
    extends StObject
       with FlowController {
    def this(hasLoggerTimestampFormat: TimestampFormat) = this()
    
    /* CompleteClass */
    override def handle(commands: js.Array[Command]): Commands = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ var printExitInfoTimingTable: Any = js.native
    
    /* private */ val timestampFormat: Any = js.native
  }
  /* static members */
  object LogTimings {
    
    @JSImport("concurrently/dist/src/flow-control/log-timings", "LogTimings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mapCloseEventToTimingInfo(hasCommandTimingsKilledExitCode: CloseEvent): TimingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCloseEventToTimingInfo")(hasCommandTimingsKilledExitCode.asInstanceOf[js.Any]).asInstanceOf[TimingInfo]
  }
  
  trait TimingInfo extends StObject {
    
    var command: String
    
    var duration: String
    
    var `exit code`: String | Double
    
    var killed: Boolean
    
    var name: String
  }
  object TimingInfo {
    
    inline def apply(command: String, duration: String, `exit code`: String | Double, killed: Boolean, name: String): TimingInfo = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("exit code")((`exit code`).asInstanceOf[js.Any])
      __obj.asInstanceOf[TimingInfo]
    }
    
    extension [Self <: TimingInfo](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def `setExit code`(value: String | Double): Self = StObject.set(x, "exit code", value.asInstanceOf[js.Any])
      
      inline def setKilled(value: Boolean): Self = StObject.set(x, "killed", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
