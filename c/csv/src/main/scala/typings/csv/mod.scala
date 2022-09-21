package typings.csv

import typings.csvGenerate.mod.Callback
import typings.csvGenerate.mod.Generator
import typings.csvGenerate.mod.Options
import typings.csvParse.mod.CsvErrorCode
import typings.csvParse.mod.Parser
import typings.csvStringify.mod.Input
import typings.csvStringify.mod.Stringifier
import typings.node.bufferMod.global.Buffer
import typings.streamTransform.mod.Handler
import typings.streamTransform.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Generator]
  inline def generate(callback: Callback): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(callback.asInstanceOf[js.Any]).asInstanceOf[Generator]
  inline def generate(options: Unit, callback: Callback): Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Generator]
  inline def generate(options: Options): Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[Generator]
  inline def generate(options: Options, callback: Callback): Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Generator]
  
  object generator {
    
    @JSImport("csv", "generator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csv", "generator.Generator")
    @js.native
    open class Generator ()
      extends typings.csvGenerate.mod.Generator {
      def this(options: Options) = this()
    }
    
    inline def generate(): typings.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[typings.csvGenerate.mod.Generator]
    inline def generate(callback: Callback): typings.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.csvGenerate.mod.Generator]
    inline def generate(options: Unit, callback: Callback): typings.csvGenerate.mod.Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvGenerate.mod.Generator]
    inline def generate(options: Options): typings.csvGenerate.mod.Generator = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.csvGenerate.mod.Generator]
    inline def generate(options: Options, callback: Callback): typings.csvGenerate.mod.Generator = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvGenerate.mod.Generator]
  }
  
  inline def parse(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Parser]
  inline def parse(callback: typings.csvParse.mod.Callback): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(callback.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: String): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: String, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: Unit, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: typings.csvParse.mod.Options): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: String, options: typings.csvParse.mod.Options, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(input: Buffer, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: Unit, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: typings.csvParse.mod.Options): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(input: Buffer, options: typings.csvParse.mod.Options, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: Unit, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def parse(options: typings.csvParse.mod.Options): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def parse(options: typings.csvParse.mod.Options, callback: typings.csvParse.mod.Callback): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  object parser {
    
    @JSImport("csv", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csv", "parser.CsvError")
    @js.native
    open class CsvError protected ()
      extends typings.csvParse.mod.CsvError {
      def this(code: CsvErrorCode, message: String, options: Unit, contexts: Any*) = this()
      def this(code: CsvErrorCode, message: String, options: typings.csvParse.mod.Options, contexts: Any*) = this()
      def this(code: CsvErrorCode, message: js.Array[String], options: Unit, contexts: Any*) = this()
      def this(
        code: CsvErrorCode,
        message: js.Array[String],
        options: typings.csvParse.mod.Options,
        contexts: Any*
      ) = this()
    }
    
    @JSImport("csv", "parser.Parser")
    @js.native
    open class Parser protected ()
      extends typings.csvParse.mod.Parser {
      def this(options: typings.csvParse.mod.Options) = this()
    }
    
    inline def parse(): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: String): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: String, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: String, options: Unit, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: String, options: typings.csvParse.mod.Options): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: String, options: typings.csvParse.mod.Options, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: Buffer): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: Buffer, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: Buffer, options: Unit, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: Buffer, options: typings.csvParse.mod.Options): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(input: Buffer, options: typings.csvParse.mod.Options, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(options: Unit, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(options: typings.csvParse.mod.Options): typings.csvParse.mod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[typings.csvParse.mod.Parser]
    inline def parse(options: typings.csvParse.mod.Options, callback: typings.csvParse.mod.Callback): typings.csvParse.mod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvParse.mod.Parser]
  }
  
  object stringifier {
    
    @JSImport("csv", "stringifier")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csv", "stringifier.Stringifier")
    @js.native
    open class Stringifier protected ()
      extends typings.csvStringify.mod.Stringifier {
      def this(options: typings.csvStringify.mod.Options) = this()
    }
    
    inline def stringify(): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(callback: typings.csvStringify.mod.Callback): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(callback.asInstanceOf[js.Any]).asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(input: Input): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(input: Input, callback: typings.csvStringify.mod.Callback): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(input: Input, options: Unit, callback: typings.csvStringify.mod.Callback): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(input: Input, options: typings.csvStringify.mod.Options): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(
      input: Input,
      options: typings.csvStringify.mod.Options,
      callback: typings.csvStringify.mod.Callback
    ): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(options: typings.csvStringify.mod.Options): typings.csvStringify.mod.Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any]).asInstanceOf[typings.csvStringify.mod.Stringifier]
    inline def stringify(options: typings.csvStringify.mod.Options, callback: typings.csvStringify.mod.Callback): typings.csvStringify.mod.Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.csvStringify.mod.Stringifier]
  }
  
  inline def stringify(): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[Stringifier]
  inline def stringify(callback: typings.csvStringify.mod.Callback): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(callback.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(input: Input): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(input: Input, callback: typings.csvStringify.mod.Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(input: Input, options: Unit, callback: typings.csvStringify.mod.Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(input: Input, options: typings.csvStringify.mod.Options): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(
    input: Input,
    options: typings.csvStringify.mod.Options,
    callback: typings.csvStringify.mod.Callback
  ): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  inline def stringify(options: typings.csvStringify.mod.Options): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  inline def stringify(options: typings.csvStringify.mod.Options, callback: typings.csvStringify.mod.Callback): Stringifier = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stringifier]
  
  inline def transform[T, U](handler: Handler[T, U]): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  inline def transform[T, U](handler: Handler[T, U], callback: typings.streamTransform.mod.Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](options: typings.streamTransform.mod.Options, handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](
    options: typings.streamTransform.mod.Options,
    handler: Handler[T, U],
    callback: typings.streamTransform.mod.Callback
  ): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](records: js.Array[T], handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](records: js.Array[T], handler: Handler[T, U], callback: typings.streamTransform.mod.Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](records: js.Array[T], options: typings.streamTransform.mod.Options, handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](
    records: js.Array[T],
    options: typings.streamTransform.mod.Options,
    handler: Handler[T, U],
    callback: typings.streamTransform.mod.Callback
  ): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  
  object transformer {
    
    @JSImport("csv", "transformer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default[T, U](handler: Handler[T, U]): typings.streamTransform.mod.Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any]).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def default[T, U](handler: Handler[T, U], callback: typings.streamTransform.mod.Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def default[T, U](options: typings.streamTransform.mod.Options, handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def default[T, U](
      options: typings.streamTransform.mod.Options,
      handler: Handler[T, U],
      callback: typings.streamTransform.mod.Callback
    ): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def default[T, U](records: js.Array[T], handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def default[T, U](records: js.Array[T], handler: Handler[T, U], callback: typings.streamTransform.mod.Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def default[T, U](records: js.Array[T], options: typings.streamTransform.mod.Options, handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def default[T, U](
      records: js.Array[T],
      options: typings.streamTransform.mod.Options,
      handler: Handler[T, U],
      callback: typings.streamTransform.mod.Callback
    ): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    
    @JSImport("csv", "transformer.Transformer")
    @js.native
    open class Transformer protected ()
      extends typings.streamTransform.mod.Transformer {
      def this(options: typings.streamTransform.mod.Options) = this()
    }
    
    inline def transform[T, U](handler: Handler[T, U]): typings.streamTransform.mod.Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any]).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def transform[T, U](handler: Handler[T, U], callback: typings.streamTransform.mod.Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def transform[T, U](options: typings.streamTransform.mod.Options, handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def transform[T, U](
      options: typings.streamTransform.mod.Options,
      handler: Handler[T, U],
      callback: typings.streamTransform.mod.Callback
    ): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def transform[T, U](records: js.Array[T], handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def transform[T, U](records: js.Array[T], handler: Handler[T, U], callback: typings.streamTransform.mod.Callback): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def transform[T, U](records: js.Array[T], options: typings.streamTransform.mod.Options, handler: Handler[T, U]): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
    inline def transform[T, U](
      records: js.Array[T],
      options: typings.streamTransform.mod.Options,
      handler: Handler[T, U],
      callback: typings.streamTransform.mod.Callback
    ): typings.streamTransform.mod.Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.streamTransform.mod.Transformer]
  }
}
