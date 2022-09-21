package typings.concurrently

import typings.concurrently.commandMod.CommandInfo
import typings.concurrently.commandParserMod.CommandParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripQuotesMod {
  
  @JSImport("concurrently/dist/src/command-parser/strip-quotes", "StripQuotes")
  @js.native
  open class StripQuotes ()
    extends StObject
       with CommandParser {
    
    /**
      * Parses `commandInfo` and returns one or more `CommandInfo`s.
      *
      * Returning multiple `CommandInfo` is used when there are multiple possibilities of commands to
      * run given the original input.
      * An example of this is when the command contains a wildcard and it must be expanded into all
      * viable options so that the consumer can decide which ones to run.
      */
    /* CompleteClass */
    override def parse(commandInfo: CommandInfo): CommandInfo | js.Array[CommandInfo] = js.native
  }
}
