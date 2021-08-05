package typings.crossSpawn

import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ChildProcessByStdio
import typings.node.childProcessMod.ChildProcessWithoutNullStreams
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnOptionsWithStdioTuple
import typings.node.childProcessMod.SpawnOptionsWithoutStdio
import typings.node.childProcessMod.SpawnSyncOptions
import typings.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childProcessMod.SpawnSyncReturns
import typings.node.childProcessMod.StdioNull
import typings.node.childProcessMod.StdioPipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(command: String): ChildProcess = ^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def apply(command: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def apply(command: String, args: Unit, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def apply(command: String, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  @JSImport("cross-spawn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(command: String): ChildProcessWithoutNullStreams = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[ChildProcessWithoutNullStreams]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(
    command: String,
    args: js.Array[String],
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Null, Null, Null]]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(command: String, args: Unit, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(command: String, options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(
    command: String,
    options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
  ): ChildProcessByStdio[Null, Null, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessByStdio[Null, Null, Null]]
  /**
    * The `spawn()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcessWithoutNullStreams]
  
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String): SpawnSyncReturns[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any]).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[String]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, args: Unit, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, args: Unit, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, args: Unit, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[String]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[Buffer]]
  /**
    * The `spawn.sync()` method spawns a new process using the given `command`, with
    * command line arguments in `args`. If omitted, `args` defaults to an empty array.
    */
  inline def sync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SpawnSyncReturns[String]]
}
