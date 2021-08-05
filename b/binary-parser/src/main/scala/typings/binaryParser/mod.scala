package typings.binaryParser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.binaryParser.mod.Parser.ArrayOptions
import typings.binaryParser.mod.Parser.BufferOptions
import typings.binaryParser.mod.Parser.ChoiceOptions
import typings.binaryParser.mod.Parser.Endianness
import typings.binaryParser.mod.Parser.NestOptions
import typings.binaryParser.mod.Parser.Next
import typings.binaryParser.mod.Parser.Options
import typings.binaryParser.mod.Parser.Parsed
import typings.binaryParser.mod.Parser.StringOptions
import typings.node.Buffer
import typings.std.Error
import typings.std.ObjectConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Parser[O /* <: js.UndefOr[js.Object] */] extends StObject {
    
    def array[N /* <: String */, Q /* <: ArrayOptions */](name: N, options: Q): Next[O, N, js.Array[js.Any | Double | js.Object]] = js.native
    
    def bit1[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit1[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit10[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit10[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit11[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit11[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit12[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit12[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit13[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit13[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit14[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit14[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit15[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit15[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit16[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit16[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit17[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit17[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit18[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit18[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit19[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit19[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit2[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit2[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit20[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit20[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit21[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit21[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit22[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit22[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit23[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit23[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit24[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit24[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit25[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit25[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit26[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit26[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit27[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit27[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit28[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit28[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit29[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit29[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit3[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit3[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit30[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit30[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit31[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit31[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit32[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit32[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit4[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit4[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit5[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit5[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit6[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit6[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit7[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit7[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit8[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit8[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def bit9[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def bit9[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def buffer[N /* <: String */](name: N, options: BufferOptions): Next[O, N, Buffer] = js.native
    
    def choice[N /* <: String */, Q /* <: ChoiceOptions */](name: N, options: Q): Next[O, N, js.Any | js.Object] = js.native
    
    def compile(): Unit = js.native
    
    def create(constructorFunction: ObjectConstructor): Parser[Unit] = js.native
    
    def double[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def double[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def doublebe[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def doublebe[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def doublele[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def doublele[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def endianess(endianess: Endianness): Parser[O] = js.native
    
    def float[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def float[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def floatbe[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def floatbe[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def floatle[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def floatle[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def getCode(): String = js.native
    
    def int16[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def int16[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def int16be[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def int16be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def int16le[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def int16le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def int32[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def int32[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def int32be[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def int32be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def int32le[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def int32le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def int64[N /* <: String */](name: N): Next[O, N, js.BigInt] = js.native
    def int64[N /* <: String */](name: N, options: Options): Next[O, N, js.BigInt] = js.native
    
    def int64be[N /* <: String */](name: N): Next[O, N, js.BigInt] = js.native
    def int64be[N /* <: String */](name: N, options: Options): Next[O, N, js.BigInt] = js.native
    
    def int64le[N /* <: String */](name: N): Next[O, N, js.BigInt] = js.native
    def int64le[N /* <: String */](name: N, options: Options): Next[O, N, js.BigInt] = js.native
    
    def int8[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def int8[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    /* [sic] */
    def namely(alias: String): Parser[O] = js.native
    
    def nest[N /* <: String */, Q /* <: NestOptions */](name: N, options: Q): Next[O, N, js.Object] = js.native
    
    def parse(buffer: Buffer): Parsed[O] = js.native
    def parse(
      buffer: Buffer,
      callback: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[js.Any], Unit]
    ): Parsed[O] = js.native
    
    def seek(length: Double): Parser[O] = js.native
    
    def skip(length: Double): Parser[O] = js.native
    
    def string[N /* <: String */](name: N): Next[O, N, String] = js.native
    def string[N /* <: String */](name: N, options: StringOptions): Next[O, N, String] = js.native
    
    def uint16[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def uint16[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def uint16be[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def uint16be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def uint16le[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def uint16le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def uint32[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def uint32[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def uint32be[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def uint32be[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def uint32le[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def uint32le[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
    
    def uint64[N /* <: String */](name: N): Next[O, N, js.BigInt] = js.native
    def uint64[N /* <: String */](name: N, options: Options): Next[O, N, js.BigInt] = js.native
    
    def uint64be[N /* <: String */](name: N): Next[O, N, js.BigInt] = js.native
    def uint64be[N /* <: String */](name: N, options: Options): Next[O, N, js.BigInt] = js.native
    
    def uint64le[N /* <: String */](name: N): Next[O, N, js.BigInt] = js.native
    def uint64le[N /* <: String */](name: N, options: Options): Next[O, N, js.BigInt] = js.native
    
    def uint8[N /* <: String */](name: N): Next[O, N, Double] = js.native
    def uint8[N /* <: String */](name: N, options: Options): Next[O, N, Double] = js.native
  }
  object Parser extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("binary-parser", "Parser")
    @js.native
    class ^ ()
      extends StObject
         with Parser[Unit]
    
    @JSImport("binary-parser", "Parser")
    @js.native
    val ^ : ParserConstructor = js.native
    
    trait ArrayOptions
      extends StObject
         with Options {
      
      var length: js.UndefOr[Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])] = js.undefined
      
      var lengthInBytes: js.UndefOr[Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])] = js.undefined
      
      var readUntil: js.UndefOr[String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])] = js.undefined
      
      var `type`: String | Parser[js.Any]
    }
    object ArrayOptions {
      
      inline def apply(`type`: String | Parser[js.Any]): ArrayOptions = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ArrayOptions]
      }
      
      extension [Self <: ArrayOptions](x: Self) {
        
        inline def setLength(value: Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setLengthInBytes(value: Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])): Self = StObject.set(x, "lengthInBytes", value.asInstanceOf[js.Any])
        
        inline def setLengthInBytesUndefined: Self = StObject.set(x, "lengthInBytes", js.undefined)
        
        inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
        
        inline def setReadUntil(value: String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])): Self = StObject.set(x, "readUntil", value.asInstanceOf[js.Any])
        
        inline def setReadUntilFunction2(value: (/* item */ Double, /* buffer */ Buffer) => Boolean): Self = StObject.set(x, "readUntil", js.Any.fromFunction2(value))
        
        inline def setReadUntilUndefined: Self = StObject.set(x, "readUntil", js.undefined)
        
        inline def setType(value: String | Parser[js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait BufferOptions
      extends StObject
         with Options {
      
      @JSName("clone")
      var clone_FBufferOptions: js.UndefOr[Boolean] = js.undefined
      
      var length: js.UndefOr[Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])] = js.undefined
      
      var readUntil: js.UndefOr[String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])] = js.undefined
    }
    object BufferOptions {
      
      inline def apply(): BufferOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BufferOptions]
      }
      
      extension [Self <: BufferOptions](x: Self) {
        
        inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
        
        inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
        
        inline def setLength(value: Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
        
        inline def setReadUntil(value: String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])): Self = StObject.set(x, "readUntil", value.asInstanceOf[js.Any])
        
        inline def setReadUntilFunction2(value: (/* item */ Double, /* buffer */ Buffer) => Boolean): Self = StObject.set(x, "readUntil", js.Any.fromFunction2(value))
        
        inline def setReadUntilUndefined: Self = StObject.set(x, "readUntil", js.undefined)
      }
    }
    
    trait ChoiceOptions
      extends StObject
         with Options {
      
      var choices: NumberDictionary[Parser[js.Any] | String]
      
      var defaultChoice: js.UndefOr[Parser[js.Any] | String] = js.undefined
      
      var tag: String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])
    }
    object ChoiceOptions {
      
      inline def apply(
        choices: NumberDictionary[Parser[js.Any] | String],
        tag: String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])
      ): ChoiceOptions = {
        val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[ChoiceOptions]
      }
      
      extension [Self <: ChoiceOptions](x: Self) {
        
        inline def setChoices(value: NumberDictionary[Parser[js.Any] | String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
        
        inline def setDefaultChoice(value: Parser[js.Any] | String): Self = StObject.set(x, "defaultChoice", value.asInstanceOf[js.Any])
        
        inline def setDefaultChoiceUndefined: Self = StObject.set(x, "defaultChoice", js.undefined)
        
        inline def setTag(value: String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      }
    }
    
    type Data = Double | String | (js.Array[Double | Parser[js.Any]]) | Parser[js.Any] | Buffer
    
    /* Rewritten from type alias, can be one of: 
      - typings.binaryParser.binaryParserStrings.little
      - typings.binaryParser.binaryParserStrings.big
    */
    trait Endianness extends StObject
    object Endianness {
      
      inline def big: typings.binaryParser.binaryParserStrings.big = "big".asInstanceOf[typings.binaryParser.binaryParserStrings.big]
      
      inline def little: typings.binaryParser.binaryParserStrings.little = "little".asInstanceOf[typings.binaryParser.binaryParserStrings.little]
    }
    
    trait NestOptions
      extends StObject
         with Options {
      
      var `type`: Parser[js.Any]
    }
    object NestOptions {
      
      inline def apply(`type`: Parser[js.Any]): NestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NestOptions]
      }
      
      extension [Self <: NestOptions](x: Self) {
        
        inline def setType(value: Parser[js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    type Next[O /* <: js.UndefOr[js.Object] */, N /* <: String */, T /* <: js.Any */] = Parser[
        Valid[
          O, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ name in N ]: T}
      */ typings.binaryParser.binaryParserStrings.Next & TopLevel[js.Any]
        ]
      ]
    
    trait Options extends StObject {
      
      var assert: js.UndefOr[String | Double | (js.Function1[/* value */ Data, Boolean])] = js.undefined
      
      var formatter: js.UndefOr[js.Function1[/* value */ Data, js.Any]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setAssert(value: String | Double | (js.Function1[/* value */ Data, Boolean])): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
        
        inline def setAssertFunction1(value: /* value */ Data => Boolean): Self = StObject.set(x, "assert", js.Any.fromFunction1(value))
        
        inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
        
        inline def setFormatter(value: /* value */ Data => js.Any): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
        
        inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      }
    }
    
    type Parsed[O /* <: js.UndefOr[js.Object] */] = O | js.Object
    
    trait StringOptions
      extends StObject
         with Options {
      
      var encoding: js.UndefOr[String] = js.undefined
      
      var greedy: js.UndefOr[Boolean] = js.undefined
      
      var length: js.UndefOr[Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])] = js.undefined
      
      var stripNull: js.UndefOr[Boolean] = js.undefined
      
      var zeroTerminated: js.UndefOr[Boolean] = js.undefined
    }
    object StringOptions {
      
      inline def apply(): StringOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StringOptions]
      }
      
      extension [Self <: StringOptions](x: Self) {
        
        inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
        
        inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
        
        inline def setLength(value: Double | String | (js.ThisFunction0[/* this */ Parser[js.Any], Double])): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
        
        inline def setStripNull(value: Boolean): Self = StObject.set(x, "stripNull", value.asInstanceOf[js.Any])
        
        inline def setStripNullUndefined: Self = StObject.set(x, "stripNull", js.undefined)
        
        inline def setZeroTerminated(value: Boolean): Self = StObject.set(x, "zeroTerminated", value.asInstanceOf[js.Any])
        
        inline def setZeroTerminatedUndefined: Self = StObject.set(x, "zeroTerminated", js.undefined)
      }
    }
    
    type Valid[O /* <: js.UndefOr[js.Object] */, P /* <: js.Object */] = (O & P) | P
    
    type _To = ParserConstructor
    
    /* This means you don't have to write `^`, but can instead just say `Parser.foo` */
    override def _to: ParserConstructor = ^
  }
  
  @js.native
  trait ParserConstructor
    extends StObject
       with Instantiable0[Parser[Unit]]
}
