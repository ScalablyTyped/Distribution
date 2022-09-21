package typings.csvtojson

import typings.csvtojson.anon.PartialCSVParseParam
import typings.csvtojson.csverrorMod.default
import typings.csvtojson.parametersMod.CSVParseParam
import typings.csvtojson.parseRuntimeMod.ParseRuntime
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object converterMod {
  
  @JSImport("csvtojson/v2/Converter", "Converter")
  @js.native
  open class Converter ()
    extends Transform
       with PromiseLike[js.Array[Any]] {
    def this(param: PartialCSVParseParam) = this()
    def this(param: Unit, options: TransformOptions) = this()
    def this(param: PartialCSVParseParam, options: TransformOptions) = this()
    
    def _flush(cb: js.Function): Unit = js.native
    
    def _transform(chunk: Any, encoding: String, cb: js.Function): Unit = js.native
    
    def fromFile(filePath: String): Converter = js.native
    def fromFile(filePath: String, options: String): Converter = js.native
    def fromFile(filePath: String, options: CreateReadStreamOption): Converter = js.native
    
    def fromStream(readStream: Readable): Converter = js.native
    
    def fromString(csvString: String): Converter = js.native
    
    var options: TransformOptions = js.native
    
    /* private */ var params: Any = js.native
    
    val parseParam: CSVParseParam = js.native
    
    val parseRuntime: ParseRuntime = js.native
    
    val parsedLineNumber: Double = js.native
    
    def preFileLine(onFileLine: PreFileLineCallback): Converter = js.native
    
    def preRawData(onRawData: PreRawDataCallback): Converter = js.native
    
    /* private */ def processEnd(cb: Any): Any = js.native
    
    /* private */ var processor: Any = js.native
    
    /* private */ var result: Any = js.native
    
    /* private */ var runtime: Any = js.native
    
    def subscribe(): Converter = js.native
    def subscribe(onNext: js.Function2[/* data */ Any, /* lineNumber */ Double, Unit | js.Thenable[Unit]]): Converter = js.native
    def subscribe(
      onNext: js.Function2[/* data */ Any, /* lineNumber */ Double, Unit | js.Thenable[Unit]],
      onError: js.Function1[/* err */ default, Unit]
    ): Converter = js.native
    def subscribe(
      onNext: js.Function2[/* data */ Any, /* lineNumber */ Double, Unit | js.Thenable[Unit]],
      onError: js.Function1[/* err */ default, Unit],
      onCompleted: js.Function0[Unit]
    ): Converter = js.native
    def subscribe(
      onNext: js.Function2[/* data */ Any, /* lineNumber */ Double, Unit | js.Thenable[Unit]],
      onError: Unit,
      onCompleted: js.Function0[Unit]
    ): Converter = js.native
    def subscribe(onNext: Unit, onError: js.Function1[/* err */ default, Unit]): Converter = js.native
    def subscribe(onNext: Unit, onError: js.Function1[/* err */ default, Unit], onCompleted: js.Function0[Unit]): Converter = js.native
    def subscribe(onNext: Unit, onError: Unit, onCompleted: js.Function0[Unit]): Converter = js.native
  }
  
  type CallBack = js.Function2[/* err */ js.Error, /* data */ js.Array[Any], Unit]
  
  trait CreateReadStreamOption extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var fd: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object CreateReadStreamOption {
    
    inline def apply(): CreateReadStreamOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateReadStreamOption]
    }
    
    extension [Self <: CreateReadStreamOption](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type PreFileLineCallback = js.Function2[/* line */ String, /* lineNumber */ Double, String | js.Thenable[String]]
  
  type PreRawDataCallback = js.Function1[/* csvString */ String, String | js.Thenable[String]]
}
