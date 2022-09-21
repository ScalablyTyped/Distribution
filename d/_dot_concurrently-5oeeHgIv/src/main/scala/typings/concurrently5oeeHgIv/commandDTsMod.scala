package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.CommandInfoindexnumber
import typings.concurrently5oeeHgIv.anon.DurationSeconds
import typings.concurrently5oeeHgIv.anon.PickChildProcesspidstdins
import typings.node.childProcessMod.SpawnOptions
import typings.node.streamMod.Writable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/command.d.ts", "Command")
  @js.native
  open class Command protected ()
    extends StObject
       with CommandInfo {
    def this(
      hasIndexNameCommandPrefixColorEnvCwd: CommandInfoindexnumber,
      spawnOpts: SpawnOptions,
      spawn: SpawnCommand,
      killProcess: KillProcess
    ) = this()
    
    val close: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.Subject<CloseEvent> */ Any = js.native
    
    /**
      * Which command line the command has.
      */
    /* CompleteClass */
    var command: String = js.native
    
    /** @inheritdoc */
    @JSName("env")
    val env_Command: Record[String, Any] = js.native
    
    val error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.Subject<unknown> */ Any = js.native
    
    var exited: Boolean = js.native
    
    val index: Double = js.native
    
    /**
      * Kills this command, optionally specifying a signal to send to it.
      */
    def kill(): Unit = js.native
    def kill(code: String): Unit = js.native
    
    /* private */ val killProcess: Any = js.native
    
    def killable: Boolean = js.native
    
    var killed: Boolean = js.native
    
    /**
      * Command's name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    var pid: js.UndefOr[Double] = js.native
    
    /** @inheritdoc */
    @JSName("prefixColor")
    val prefixColor_Command: String = js.native
    
    var process: js.UndefOr[ChildProcess] = js.native
    
    /* private */ val spawn: Any = js.native
    
    /* private */ val spawnOpts: Any = js.native
    
    /**
      * Starts this command, piping output, error and close events onto the corresponding observables.
      */
    def start(): Unit = js.native
    
    val stderr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.Subject<Buffer> */ Any = js.native
    
    var stdin: js.UndefOr[Writable] = js.native
    
    val stdout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.Subject<Buffer> */ Any = js.native
    
    val timer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.Subject<TimerEvent> */ Any = js.native
  }
  
  type ChildProcess = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter */ Any) & PickChildProcesspidstdins
  
  trait CloseEvent extends StObject {
    
    var command: CommandInfo
    
    /**
      * The exit code or signal for the command.
      */
    var exitCode: String | Double
    
    /**
      * The command's index among all commands ran.
      */
    var index: Double
    
    /**
      * Whether the command exited because it was killed.
      */
    var killed: Boolean
    
    var timings: DurationSeconds
  }
  object CloseEvent {
    
    inline def apply(
      command: CommandInfo,
      exitCode: String | Double,
      index: Double,
      killed: Boolean,
      timings: DurationSeconds
    ): CloseEvent = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseEvent]
    }
    
    extension [Self <: CloseEvent](x: Self) {
      
      inline def setCommand(value: CommandInfo): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setExitCode(value: String | Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKilled(value: Boolean): Self = StObject.set(x, "killed", value.asInstanceOf[js.Any])
      
      inline def setTimings(value: DurationSeconds): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
    }
  }
  
  type CommandIdentifier = String | Double
  
  trait CommandInfo extends StObject {
    
    /**
      * Which command line the command has.
      */
    var command: String
    
    /**
      * The current working directory of the process when spawned.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Which environment variables should the spawned process have.
      */
    var env: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Command's name.
      */
    var name: String
    
    /**
      * Color to use on prefix of command.
      */
    var prefixColor: js.UndefOr[String] = js.undefined
  }
  object CommandInfo {
    
    inline def apply(command: String, name: String): CommandInfo = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandInfo]
    }
    
    extension [Self <: CommandInfo](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: Record[String, Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefixColor(value: String): Self = StObject.set(x, "prefixColor", value.asInstanceOf[js.Any])
      
      inline def setPrefixColorUndefined: Self = StObject.set(x, "prefixColor", js.undefined)
    }
  }
  
  type KillProcess = js.Function2[/* pid */ Double, /* signal */ js.UndefOr[String], Unit]
  
  type SpawnCommand = js.Function2[/* command */ String, /* options */ SpawnOptions, ChildProcess]
  
  trait TimerEvent extends StObject {
    
    var endDate: js.UndefOr[js.Date] = js.undefined
    
    var startDate: js.Date
  }
  object TimerEvent {
    
    inline def apply(startDate: js.Date): TimerEvent = {
      val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimerEvent]
    }
    
    extension [Self <: TimerEvent](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
}
