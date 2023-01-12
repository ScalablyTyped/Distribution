package typings.concurrently

import typings.concurrently.anon.Commands
import typings.concurrently.anon.TimestampFormat
import typings.concurrently.distSrcCommandMod.CloseEvent
import typings.concurrently.distSrcCommandMod.Command
import typings.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFlowControlLogTimingsMod {
  
  @JSImport("concurrently/dist/src/flow-control/log-timings", "LogTimings")
  @js.native
  open class LogTimings protected ()
    extends StObject
       with FlowController {
    def this(param0: TimestampFormat) = this()
    
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
    
    inline def mapCloseEventToTimingInfo(param0: CloseEvent): TimingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCloseEventToTimingInfo")(param0.asInstanceOf[js.Any]).asInstanceOf[TimingInfo]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimingInfo] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def `setExit code`(value: String | Double): Self = StObject.set(x, "exit code", value.asInstanceOf[js.Any])
      
      inline def setKilled(value: Boolean): Self = StObject.set(x, "killed", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
