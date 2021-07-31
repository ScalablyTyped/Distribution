package typings.clarinet

import typings.node.streamMod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clarinet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("clarinet", "CParser")
  @js.native
  class CParser () extends StObject {
    def this(opt: Options) = this()
    
    def close(): Unit = js.native
    
    var column: Double = js.native
    
    def end(): Unit = js.native
    
    var line: Double = js.native
    
    def onclosearray(): Unit = js.native
    
    def oncloseobject(): Unit = js.native
    
    def onend(): Unit = js.native
    
    def onerror(e: Error): Unit = js.native
    
    def onkey(key: String): Unit = js.native
    
    def onopenarray(): Unit = js.native
    
    def onopenobject(key: String): Unit = js.native
    
    def onready(): Unit = js.native
    
    def onvalue(): Unit = js.native
    def onvalue(value: String): Unit = js.native
    def onvalue(value: Boolean): Unit = js.native
    
    var position: Double = js.native
    
    def resume(): Unit = js.native
    
    def write(chunk: String): Unit = js.native
  }
  
  @JSImport("clarinet", "CStream")
  @js.native
  class CStream () extends Stream {
    def this(opt: Options) = this()
    
    var _parser: CParser = js.native
    
    def destroy(): Unit = js.native
    
    def end(chunk: String): Unit = js.native
  }
  
  @JSImport("clarinet", "DEBUG")
  @js.native
  val DEBUG: Boolean = js.native
  
  @JSImport("clarinet", "EVENTS")
  @js.native
  val EVENTS: js.Array[String] = js.native
  
  @JSImport("clarinet", "INFO")
  @js.native
  val INFO: Boolean = js.native
  
  @JSImport("clarinet", "MAX_BUFFER_LENGTH")
  @js.native
  val MAX_BUFFER_LENGTH: Double = js.native
  
  object STATE {
    
    @JSImport("clarinet", "STATE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("clarinet", "STATE.0")
    @js.native
    val `0`: String = js.native
    
    @JSImport("clarinet", "STATE.1")
    @js.native
    val `1`: String = js.native
    
    @JSImport("clarinet", "STATE.10")
    @js.native
    val `10`: String = js.native
    
    @JSImport("clarinet", "STATE.11")
    @js.native
    val `11`: String = js.native
    
    @JSImport("clarinet", "STATE.12")
    @js.native
    val `12`: String = js.native
    
    @JSImport("clarinet", "STATE.13")
    @js.native
    val `13`: String = js.native
    
    @JSImport("clarinet", "STATE.14")
    @js.native
    val `14`: String = js.native
    
    @JSImport("clarinet", "STATE.15")
    @js.native
    val `15`: String = js.native
    
    @JSImport("clarinet", "STATE.16")
    @js.native
    val `16`: String = js.native
    
    @JSImport("clarinet", "STATE.17")
    @js.native
    val `17`: String = js.native
    
    @JSImport("clarinet", "STATE.18")
    @js.native
    val `18`: String = js.native
    
    @JSImport("clarinet", "STATE.19")
    @js.native
    val `19`: String = js.native
    
    @JSImport("clarinet", "STATE.2")
    @js.native
    val `2`: String = js.native
    
    @JSImport("clarinet", "STATE.20")
    @js.native
    val `20`: String = js.native
    
    @JSImport("clarinet", "STATE.21")
    @js.native
    val `21`: String = js.native
    
    @JSImport("clarinet", "STATE.22")
    @js.native
    val `22`: String = js.native
    
    @JSImport("clarinet", "STATE.23")
    @js.native
    val `23`: String = js.native
    
    @JSImport("clarinet", "STATE.3")
    @js.native
    val `3`: String = js.native
    
    @JSImport("clarinet", "STATE.4")
    @js.native
    val `4`: String = js.native
    
    @JSImport("clarinet", "STATE.5")
    @js.native
    val `5`: String = js.native
    
    @JSImport("clarinet", "STATE.6")
    @js.native
    val `6`: String = js.native
    
    @JSImport("clarinet", "STATE.7")
    @js.native
    val `7`: String = js.native
    
    @JSImport("clarinet", "STATE.8")
    @js.native
    val `8`: String = js.native
    
    @JSImport("clarinet", "STATE.9")
    @js.native
    val `9`: String = js.native
    
    @JSImport("clarinet", "STATE.BACKSLASH")
    @js.native
    def BACKSLASH: Double = js.native
    @scala.inline
    def BACKSLASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.BEGIN")
    @js.native
    def BEGIN: Double = js.native
    @scala.inline
    def BEGIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.CLOSE_ARRAY")
    @js.native
    def CLOSE_ARRAY: Double = js.native
    @scala.inline
    def CLOSE_ARRAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_ARRAY")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.CLOSE_KEY")
    @js.native
    def CLOSE_KEY: Double = js.native
    @scala.inline
    def CLOSE_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.CLOSE_OBJECT")
    @js.native
    def CLOSE_OBJECT: Double = js.native
    @scala.inline
    def CLOSE_OBJECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.END")
    @js.native
    def END: Double = js.native
    @scala.inline
    def END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.FALSE")
    @js.native
    def FALSE: Double = js.native
    
    @JSImport("clarinet", "STATE.FALSE2")
    @js.native
    def FALSE2: Double = js.native
    @scala.inline
    def FALSE2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FALSE2")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.FALSE3")
    @js.native
    def FALSE3: Double = js.native
    @scala.inline
    def FALSE3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FALSE3")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.FALSE4")
    @js.native
    def FALSE4: Double = js.native
    @scala.inline
    def FALSE4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FALSE4")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def FALSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FALSE")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.NULL")
    @js.native
    def NULL: Double = js.native
    
    @JSImport("clarinet", "STATE.NULL2")
    @js.native
    def NULL2: Double = js.native
    @scala.inline
    def NULL2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL2")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.NULL3")
    @js.native
    def NULL3: Double = js.native
    @scala.inline
    def NULL3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL3")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.NUMBER_DECIMAL_POINT")
    @js.native
    def NUMBER_DECIMAL_POINT: Double = js.native
    @scala.inline
    def NUMBER_DECIMAL_POINT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_DECIMAL_POINT")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.NUMBER_DIGIT")
    @js.native
    def NUMBER_DIGIT: Double = js.native
    @scala.inline
    def NUMBER_DIGIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_DIGIT")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.OPEN_ARRAY")
    @js.native
    def OPEN_ARRAY: Double = js.native
    @scala.inline
    def OPEN_ARRAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_ARRAY")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.OPEN_KEY")
    @js.native
    def OPEN_KEY: Double = js.native
    @scala.inline
    def OPEN_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.OPEN_OBJECT")
    @js.native
    def OPEN_OBJECT: Double = js.native
    @scala.inline
    def OPEN_OBJECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.STRING")
    @js.native
    def STRING: Double = js.native
    @scala.inline
    def STRING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.TEXT_ESCAPE")
    @js.native
    def TEXT_ESCAPE: Double = js.native
    @scala.inline
    def TEXT_ESCAPE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_ESCAPE")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.TRUE")
    @js.native
    def TRUE: Double = js.native
    
    @JSImport("clarinet", "STATE.TRUE2")
    @js.native
    def TRUE2: Double = js.native
    @scala.inline
    def TRUE2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRUE2")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.TRUE3")
    @js.native
    def TRUE3: Double = js.native
    @scala.inline
    def TRUE3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRUE3")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TRUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRUE")(x.asInstanceOf[js.Any])
    
    @JSImport("clarinet", "STATE.VALUE")
    @js.native
    def VALUE: Double = js.native
    @scala.inline
    def VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def createStream(): CStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")().asInstanceOf[CStream]
  @scala.inline
  def createStream(opt: Options): CStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(opt.asInstanceOf[js.Any]).asInstanceOf[CStream]
  
  @scala.inline
  def parser(): CParser = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")().asInstanceOf[CParser]
  @scala.inline
  def parser(opt: Options): CParser = ^.asInstanceOf[js.Dynamic].applyDynamic("parser")(opt.asInstanceOf[js.Any]).asInstanceOf[CParser]
  
  trait Options extends StObject {
    
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
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
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
