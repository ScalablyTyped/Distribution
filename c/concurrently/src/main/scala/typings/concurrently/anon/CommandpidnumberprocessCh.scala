package typings.concurrently.anon

import typings.concurrently.distSrcCommandMod.ChildProcess
import typings.concurrently.distSrcCommandMod.CloseEvent
import typings.concurrently.distSrcCommandMod.KillProcess
import typings.concurrently.distSrcCommandMod.SpawnCommand
import typings.concurrently.distSrcCommandMod.TimerEvent
import typings.node.bufferMod.global.Buffer
import typings.node.childProcessMod.SpawnOptions
import typings.node.streamMod.Writable
import typings.rxjs.mod.Subject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined concurrently.concurrently/dist/src/command.Command & {  pid :number,   process :concurrently.concurrently/dist/src/command.ChildProcess} */
@js.native
trait CommandpidnumberprocessCh extends StObject {
  
  val close: Subject[CloseEvent] = js.native
  
  /** @inheritdoc */
  val command: String = js.native
  
  /** @inheritdoc */
  val cwd: js.UndefOr[String] = js.native
  
  /** @inheritdoc */
  val env: Record[String, Any] = js.native
  
  val error: Subject[Any] = js.native
  
  var exited: Boolean = js.native
  
  val index: Double = js.native
  
  /**
    * Kills this command, optionally specifying a signal to send to it.
    */
  def kill(): Unit = js.native
  def kill(code: String): Unit = js.native
  
  /* private */ val killProcess: Any = js.native
  
  /** @deprecated */
  def killable: Boolean = js.native
  
  var killed: Boolean = js.native
  
  /** @inheritdoc */
  val name: String = js.native
  
  var pid: js.UndefOr[Double] = js.native
  
  /** @inheritdoc */
  val prefixColor: js.UndefOr[String] = js.native
  
  var process: js.UndefOr[ChildProcess] = js.native
  
  /* private */ val spawn: Any = js.native
  
  /* private */ val spawnOpts: Any = js.native
  
  /**
    * Starts this command, piping output, error and close events onto the corresponding observables.
    */
  def start(): Unit = js.native
  
  val stderr: Subject[Buffer] = js.native
  
  var stdin: js.UndefOr[Writable] = js.native
  
  val stdout: Subject[Buffer] = js.native
  
  val timer: Subject[TimerEvent] = js.native
}
