package typings.cucumberGherkinUtils

import typings.cucumberGherkinUtils.distSrcPrettyMod.Syntax
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsFormatCommandMod {
  
  @JSImport("@cucumber/gherkin-utils/dist/src/commands/formatCommand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatCommand(files: js.Array[String], stdin: Null, stdout: Null, options: FormatOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCommand")(files.asInstanceOf[js.Any], stdin.asInstanceOf[js.Any], stdout.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def formatCommand(files: js.Array[String], stdin: Null, stdout: Writable, options: FormatOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCommand")(files.asInstanceOf[js.Any], stdin.asInstanceOf[js.Any], stdout.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def formatCommand(files: js.Array[String], stdin: Readable, stdout: Null, options: FormatOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCommand")(files.asInstanceOf[js.Any], stdin.asInstanceOf[js.Any], stdout.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def formatCommand(files: js.Array[String], stdin: Readable, stdout: Writable, options: FormatOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatCommand")(files.asInstanceOf[js.Any], stdin.asInstanceOf[js.Any], stdout.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait FormatOptions extends StObject {
    
    var fromSyntax: js.UndefOr[Syntax] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var toSyntax: js.UndefOr[Syntax] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setFromSyntax(value: Syntax): Self = StObject.set(x, "fromSyntax", value.asInstanceOf[js.Any])
      
      inline def setFromSyntaxUndefined: Self = StObject.set(x, "fromSyntax", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setToSyntax(value: Syntax): Self = StObject.set(x, "toSyntax", value.asInstanceOf[js.Any])
      
      inline def setToSyntaxUndefined: Self = StObject.set(x, "toSyntax", js.undefined)
    }
  }
}
