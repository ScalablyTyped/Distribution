package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.commandDTsMod.CommandInfo
import typings.concurrently5oeeHgIv.commandParserDTsMod.CommandParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandNpmWildcardDTsMod {
  
  @JSImport(".concurrently-5oeeHgIv/dist/src/command-parser/expand-npm-wildcard.d.ts", "ExpandNpmWildcard")
  @js.native
  open class ExpandNpmWildcard ()
    extends StObject
       with CommandParser {
    def this(readPackage: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpandNpmWildcard.readPackage */ Any) = this()
    
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
    
    /* private */ val readPackage: Any = js.native
    
    /* private */ var scripts: Any = js.native
  }
  /* static members */
  object ExpandNpmWildcard {
    
    @JSImport(".concurrently-5oeeHgIv/dist/src/command-parser/expand-npm-wildcard.d.ts", "ExpandNpmWildcard")
    @js.native
    val ^ : js.Any = js.native
    
    inline def readPackage(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackage")().asInstanceOf[Any]
  }
}
