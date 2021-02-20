package typings.csvGenerate

import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csv-generate", JSImport.Namespace)
  @js.native
  def apply(): Generator = js.native
  @JSImport("csv-generate", JSImport.Namespace)
  @js.native
  def apply(callback: Callback): Generator = js.native
  @JSImport("csv-generate", JSImport.Namespace)
  @js.native
  def apply(options: js.UndefOr[scala.Nothing], callback: Callback): Generator = js.native
  @JSImport("csv-generate", JSImport.Namespace)
  @js.native
  def apply(options: Options): Generator = js.native
  @JSImport("csv-generate", JSImport.Namespace)
  @js.native
  def apply(options: Options, callback: Callback): Generator = js.native
  
  @JSImport("csv-generate", "Generator")
  @js.native
  class Generator () extends Readable {
    def this(options: Options) = this()
    
    val options: Options = js.native
  }
  
  type Callback = js.Function2[/* err */ js.UndefOr[Error], /* records */ js.UndefOr[js.Any], Unit]
  
  type MatcherFunc = js.Function1[/* value */ js.Any, Boolean]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Define the number of generated fields and the generation method.
      */
    var columns: js.UndefOr[Double | js.Array[String]] = js.native
    
    /**
      * Set the field delimiter.
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /**
      * Period to run in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * If specified, then buffers will be decoded to strings using the specified encoding.
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * When to stop the generation.
      */
    var end: js.UndefOr[Double | Date] = js.native
    
    /**
      * One or multiple characters to print at the end of the file; only apply when objectMode is disabled.
      */
    var eof: js.UndefOr[Boolean | String] = js.native
    
    var fixedSize: js.UndefOr[Boolean] = js.native
    
    /**
      * Generate buffers equals length as defined by the `highWaterMark` option.
      */
    var fixed_size: js.UndefOr[Boolean] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of bytes to store in the internal buffer before ceasing to read from the underlying resource.
      */
    var high_water_mark: js.UndefOr[Double] = js.native
    
    /**
      * Number of lines or records to generate.
      */
    var length: js.UndefOr[Double] = js.native
    
    var maxWordLength: js.UndefOr[Double] = js.native
    
    /**
      * Maximum number of characters per word. 
      */
    var max_word_length: js.UndefOr[Double] = js.native
    
    var objectMode: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether this stream should behave as a stream of objects.
      */
    var object_mode: js.UndefOr[Boolean] = js.native
    
    /**
      * One or multiple characters used to delimit records.
      */
    var row_delimiter: js.UndefOr[String] = js.native
    
    /**
      * Generate idempotent random characters if a number provided.
      */
    var seed: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * The time to wait between the generation of each records
      */
    var sleep: js.UndefOr[Double] = js.native
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
      def setColumns(value: Double | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnd(value: Double | Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEof(value: Boolean | String): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEofUndefined: Self = StObject.set(x, "eof", js.undefined)
      
      @scala.inline
      def setFixedSize(value: Boolean): Self = StObject.set(x, "fixedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedSizeUndefined: Self = StObject.set(x, "fixedSize", js.undefined)
      
      @scala.inline
      def setFixed_size(value: Boolean): Self = StObject.set(x, "fixed_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixed_sizeUndefined: Self = StObject.set(x, "fixed_size", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setHigh_water_mark(value: Double): Self = StObject.set(x, "high_water_mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHigh_water_markUndefined: Self = StObject.set(x, "high_water_mark", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMaxWordLength(value: Double): Self = StObject.set(x, "maxWordLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWordLengthUndefined: Self = StObject.set(x, "maxWordLength", js.undefined)
      
      @scala.inline
      def setMax_word_length(value: Double): Self = StObject.set(x, "max_word_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_word_lengthUndefined: Self = StObject.set(x, "max_word_length", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setObject_mode(value: Boolean): Self = StObject.set(x, "object_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject_modeUndefined: Self = StObject.set(x, "object_mode", js.undefined)
      
      @scala.inline
      def setRow_delimiter(value: String): Self = StObject.set(x, "row_delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow_delimiterUndefined: Self = StObject.set(x, "row_delimiter", js.undefined)
      
      @scala.inline
      def setSeed(value: Boolean | Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setSleep(value: Double): Self = StObject.set(x, "sleep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSleepUndefined: Self = StObject.set(x, "sleep", js.undefined)
    }
  }
}
