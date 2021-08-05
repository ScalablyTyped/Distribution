package typings.csvGenerate

import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Generator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Generator]
  inline def apply(callback: Callback): Generator = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Generator]
  inline def apply(options: Unit, callback: Callback): Generator = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Generator]
  inline def apply(options: Options): Generator = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Generator]
  inline def apply(options: Options, callback: Callback): Generator = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Generator]
  
  @JSImport("csv-generate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csv-generate", "Generator")
  @js.native
  class Generator () extends Readable {
    def this(options: Options) = this()
    
    val options: Options = js.native
  }
  
  type Callback = js.Function2[/* err */ js.UndefOr[Error], /* records */ js.UndefOr[js.Any], Unit]
  
  type MatcherFunc = js.Function1[/* value */ js.Any, Boolean]
  
  trait Options extends StObject {
    
    /**
      * Define the number of generated fields and the generation method.
      */
    var columns: js.UndefOr[Double | js.Array[String]] = js.undefined
    
    /**
      * Set the field delimiter.
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Period to run in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * If specified, then buffers will be decoded to strings using the specified encoding.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * When to stop the generation.
      */
    var end: js.UndefOr[Double | Date] = js.undefined
    
    /**
      * One or multiple characters to print at the end of the file; only apply when objectMode is disabled.
      */
    var eof: js.UndefOr[Boolean | String] = js.undefined
    
    var fixedSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate buffers equals length as defined by the `highWaterMark` option.
      */
    var fixed_size: js.UndefOr[Boolean] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of bytes to store in the internal buffer before ceasing to read from the underlying resource.
      */
    var high_water_mark: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of lines or records to generate.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    var maxWordLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of characters per word. 
      */
    var max_word_length: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this stream should behave as a stream of objects.
      */
    var object_mode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One or multiple characters used to delimit records.
      */
    var row_delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Generate idempotent random characters if a number provided.
      */
    var seed: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * The time to wait between the generation of each records
      */
    var sleep: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColumns(value: Double | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEnd(value: Double | Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEof(value: Boolean | String): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      inline def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      inline def setFixedSize(value: Boolean): Self = StObject.set(x, "fixedSize", value.asInstanceOf[js.Any])
      
      inline def setFixedSizeUndefined: Self = StObject.set(x, "fixedSize", js.undefined)
      
      inline def setFixed_size(value: Boolean): Self = StObject.set(x, "fixed_size", value.asInstanceOf[js.Any])
      
      inline def setFixed_sizeUndefined: Self = StObject.set(x, "fixed_size", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setHigh_water_mark(value: Double): Self = StObject.set(x, "high_water_mark", value.asInstanceOf[js.Any])
      
      inline def setHigh_water_markUndefined: Self = StObject.set(x, "high_water_mark", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxWordLength(value: Double): Self = StObject.set(x, "maxWordLength", value.asInstanceOf[js.Any])
      
      inline def setMaxWordLengthUndefined: Self = StObject.set(x, "maxWordLength", js.undefined)
      
      inline def setMax_word_length(value: Double): Self = StObject.set(x, "max_word_length", value.asInstanceOf[js.Any])
      
      inline def setMax_word_lengthUndefined: Self = StObject.set(x, "max_word_length", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setObject_mode(value: Boolean): Self = StObject.set(x, "object_mode", value.asInstanceOf[js.Any])
      
      inline def setObject_modeUndefined: Self = StObject.set(x, "object_mode", js.undefined)
      
      inline def setRow_delimiter(value: String): Self = StObject.set(x, "row_delimiter", value.asInstanceOf[js.Any])
      
      inline def setRow_delimiterUndefined: Self = StObject.set(x, "row_delimiter", js.undefined)
      
      inline def setSeed(value: Boolean | Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSleep(value: Double): Self = StObject.set(x, "sleep", value.asInstanceOf[js.Any])
      
      inline def setSleepUndefined: Self = StObject.set(x, "sleep", js.undefined)
    }
  }
}
