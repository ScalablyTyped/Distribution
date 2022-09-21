package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.commandDTsMod.CommandInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandParserDTsMod {
  
  trait CommandParser extends StObject {
    
    /**
      * Parses `commandInfo` and returns one or more `CommandInfo`s.
      *
      * Returning multiple `CommandInfo` is used when there are multiple possibilities of commands to
      * run given the original input.
      * An example of this is when the command contains a wildcard and it must be expanded into all
      * viable options so that the consumer can decide which ones to run.
      */
    def parse(commandInfo: CommandInfo): CommandInfo | js.Array[CommandInfo]
  }
  object CommandParser {
    
    inline def apply(parse: CommandInfo => CommandInfo | js.Array[CommandInfo]): CommandParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[CommandParser]
    }
    
    extension [Self <: CommandParser](x: Self) {
      
      inline def setParse(value: CommandInfo => CommandInfo | js.Array[CommandInfo]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
