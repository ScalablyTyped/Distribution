package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.commandDTsMod.CommandInfo
import typings.concurrently5oeeHgIv.commandParserDTsMod.CommandParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandNpmShortcutDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/command-parser/expand-npm-shortcut.d.ts", "ExpandNpmShortcut")
  @js.native
  open class ExpandNpmShortcut ()
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
