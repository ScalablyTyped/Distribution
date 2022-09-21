package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.Hide
import typings.concurrently5oeeHgIv.commandDTsMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/logger.d.ts", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(hasHidePrefixFormatPrefixLengthRawTimestampFormat: Hide) = this()
    
    def colorText(command: Command, text: String): String = js.native
    
    def emit(command: Unit, text: String): Unit = js.native
    def emit(command: Command, text: String): Unit = js.native
    
    def getPrefix(command: Command): String = js.native
    
    /* private */ var getPrefixesFor: Any = js.native
    
    /* private */ val hide: Any = js.native
    
    /**
      * Last character emitted.
      * If `undefined`, then nothing has been logged yet.
      */
    /* private */ var lastChar: Any = js.native
    
    def log(prefix: String, text: String): Unit = js.native
    def log(prefix: String, text: String, command: Command): Unit = js.native
    
    /**
      * Logs an event for a command (e.g. start, stop).
      *
      * If raw mode is on, then nothing is logged.
      */
    def logCommandEvent(text: String, command: Command): Unit = js.native
    
    def logCommandText(text: String, command: Command): Unit = js.native
    
    /**
      * Logs a global event (e.g. sending signals to processes).
      *
      * If raw mode is on, then nothing is logged.
      */
    def logGlobalEvent(text: String): Unit = js.native
    
    /**
      * Logs a table from an input object array, like `console.table`.
      *
      * Each row is a single input item, and they are presented in the input order.
      */
    def logTable(tableContents: js.Array[Any]): Unit = js.native
    
    /**
      * Observable that emits when there's been output logged.
      * If `command` is is `undefined`, then the log is for a global event.
      */
    val output: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.Subject<{  command :Command | undefined,   text :string}> */ Any = js.native
    
    /* private */ val prefixFormat: Any = js.native
    
    /* private */ val prefixLength: Any = js.native
    
    /* private */ val raw: Any = js.native
    
    /* private */ var shortenText: Any = js.native
    
    /* private */ val timestampFormat: Any = js.native
  }
}
