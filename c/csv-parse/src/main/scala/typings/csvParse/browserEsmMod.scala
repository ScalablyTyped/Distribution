package typings.csvParse

import typings.csvParse.mod.Callback
import typings.csvParse.mod.CsvErrorCode
import typings.csvParse.mod.Options
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object browserEsmMod {
  
  @JSImport("csv-parse/browser/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csv-parse/browser/esm", "CsvError")
  @js.native
  open class CsvError protected ()
    extends typings.csvParse.mod.CsvError {
    def this(code: CsvErrorCode, message: String, options: Unit, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: String, options: Options, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: js.Array[String], options: Unit, contexts: Any*) = this()
    def this(code: CsvErrorCode, message: js.Array[String], options: Options, contexts: Any*) = this()
  }
  
  @JSImport("csv-parse/browser/esm", "Parser")
  @js.native
  open class Parser protected ()
    extends typings.csvParse.mod.Parser {
    def this(options: Options) = this()
  }
  
  inline def parse(): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(callback: Callback): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: String): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: String, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: String, options: Unit, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: String, options: Options): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: String, options: Options, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: Buffer): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: Buffer, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: Buffer, options: Unit, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: Buffer, options: Options): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(input: Buffer, options: Options, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(options: Unit, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(options: Options): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
  inline def parse(options: Options, callback: Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
}
