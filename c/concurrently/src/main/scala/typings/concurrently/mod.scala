package typings.concurrently

import typings.concurrently.concurrentlyStrings.command
import typings.concurrently.concurrentlyStrings.failure
import typings.concurrently.concurrentlyStrings.first
import typings.concurrently.concurrentlyStrings.index
import typings.concurrently.concurrentlyStrings.last
import typings.concurrently.concurrentlyStrings.name
import typings.concurrently.concurrentlyStrings.none
import typings.concurrently.concurrentlyStrings.pid
import typings.concurrently.concurrentlyStrings.success
import typings.concurrently.concurrentlyStrings.time
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("concurrently", JSImport.Namespace)
  @js.native
  def apply(commands: js.Array[CommandObj | String]): js.Promise[Null] = js.native
  @JSImport("concurrently", JSImport.Namespace)
  @js.native
  def apply(commands: js.Array[CommandObj | String], options: Options): js.Promise[Null] = js.native
  
  @js.native
  trait CommandObj extends StObject {
    
    var command: String = js.native
    
    var env: js.UndefOr[ProcessEnv] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var prefixColor: js.UndefOr[String] = js.native
  }
  object CommandObj {
    
    @scala.inline
    def apply(command: String): CommandObj = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandObj]
    }
    
    @scala.inline
    implicit class CommandObjMutableBuilder[Self <: CommandObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrefixColor(value: String): Self = StObject.set(x, "prefixColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixColorUndefined: Self = StObject.set(x, "prefixColor", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** the default input target when reading from `inputStream`. Default: `0`. */
    var defaultInputTarget: js.UndefOr[Double] = js.native
    
    /** a Readable stream to read the input from, eg `process.stdin` */
    var inputStream: js.UndefOr[ReadableStream] = js.native
    
    /** an array of exiting conditions that will cause a process to kill others. Can contain any of success or failure. */
    var killOthers: js.UndefOr[js.Array[success | failure]] = js.native
    
    /**
      * how many processes should run at once
      * @default 0
      */
    var maxProcesses: js.UndefOr[Double] = js.native
    
    /**  a Writable stream to write logs to. Default: `process.stdout` */
    var outputStream: js.UndefOr[WritableStream] = js.native
    
    /**
      * the prefix type to use when logging processes output.
      */
    var prefix: js.UndefOr[index | pid | time | command | name | none | String] = js.native
    
    /** how many characters to show when prefixing with `command`. Default: `10` */
    var prefixLength: js.UndefOr[Double] = js.native
    
    /** whether raw mode should be used, meaning strictly process output will be logged, without any prefixes, colouring or extra stuff. */
    var raw: js.UndefOr[Boolean] = js.native
    
    /** how many milliseconds to wait between process restarts. Default: 0 */
    var restartDelay: js.UndefOr[Double] = js.native
    
    /** how many attempts to restart a process that dies will be made. Default: `0` */
    var restartTries: js.UndefOr[Double] = js.native
    
    /** the condition to consider the run was successful. */
    var successCondition: js.UndefOr[first | last] = js.native
    
    /** a date-fns format to use when prefixing with time. Default: `yyyy-MM-dd HH:mm:ss.ZZZ` */
    var timestampFormat: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultInputTarget(value: Double): Self = StObject.set(x, "defaultInputTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInputTargetUndefined: Self = StObject.set(x, "defaultInputTarget", js.undefined)
      
      @scala.inline
      def setInputStream(value: ReadableStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStreamUndefined: Self = StObject.set(x, "inputStream", js.undefined)
      
      @scala.inline
      def setKillOthers(value: js.Array[success | failure]): Self = StObject.set(x, "killOthers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillOthersUndefined: Self = StObject.set(x, "killOthers", js.undefined)
      
      @scala.inline
      def setKillOthersVarargs(value: (success | failure)*): Self = StObject.set(x, "killOthers", js.Array(value :_*))
      
      @scala.inline
      def setMaxProcesses(value: Double): Self = StObject.set(x, "maxProcesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxProcessesUndefined: Self = StObject.set(x, "maxProcesses", js.undefined)
      
      @scala.inline
      def setOutputStream(value: WritableStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
      
      @scala.inline
      def setPrefix(value: index | pid | time | command | name | none | String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixLength(value: Double): Self = StObject.set(x, "prefixLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixLengthUndefined: Self = StObject.set(x, "prefixLength", js.undefined)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRestartDelay(value: Double): Self = StObject.set(x, "restartDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartDelayUndefined: Self = StObject.set(x, "restartDelay", js.undefined)
      
      @scala.inline
      def setRestartTries(value: Double): Self = StObject.set(x, "restartTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartTriesUndefined: Self = StObject.set(x, "restartTries", js.undefined)
      
      @scala.inline
      def setSuccessCondition(value: first | last): Self = StObject.set(x, "successCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessConditionUndefined: Self = StObject.set(x, "successCondition", js.undefined)
      
      @scala.inline
      def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    }
  }
}
