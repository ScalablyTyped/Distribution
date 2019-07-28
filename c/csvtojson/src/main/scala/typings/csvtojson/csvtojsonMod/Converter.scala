package typings.csvtojson.csvtojsonMod

import typings.node.NodeJSNs.ReadableStream
import typings.node.streamMod.Stream
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Converts provided CSV input to  a JSON object.
  */
@JSImport("csvtojson", "Converter")
@js.native
/**
  * Initializes a new instance of a Converter
  * @param options       converter options
  * @param    streamOptions stream options
  */
class Converter () extends Transform {
  def this(options: ConverterOptions) = this()
  def this(options: ConverterOptions, streamOptions: StreamOptions) = this()
  /**
    * Reads in a CSV from a file.
    * @param filePath the path to the CSV file
    * @return returns this object for chaining
    */
  def fromFile(filePath: String): this.type = js.native
  /**
    * Reads in a CSV from a file.
    * @param             filePath the path to the CSV file
    * @param callback callback function to handle result or error
    */
  def fromFile(filePath: String, callback: ParseResultHandler): Unit = js.native
  /**
    * Reads in a CSV from a stream.
    * @param stream the stream
    * @return returns this object for chaining
    */
  def fromStream(stream: ReadableStream): this.type = js.native
  /**
    * Reads in a CSV from a stream.
    * @param             stream   the stream
    * @param callback callback function to handle result or error
    */
  def fromStream(stream: Stream, callback: ParseResultHandler): Unit = js.native
  /**
    * Reads in a CSV from a string.
    * @param str the string to convert
    * @return returns this object for chaining
    */
  def fromString(str: String): this.type = js.native
  /**
    * Reads in a CSV from a string.
    * @param             str      the string to convert
    * @param callback callback function to handle result or error
    */
  def fromString(str: String, callback: ParseResultHandler): Unit = js.native
  def on(
    event: String,
    listener: CsvEventHandler | DataEventHandler | DoneEventHandler | EndParsedEventHandler | ErrorEventHandler | JsonEventHandler
  ): this.type = js.native
  /**
    * Adds a listener function to the end of the listeners array for an event.
    * Available events:
    * - json
    * - csv
    * - data
    * - error
    * - record_parsed
    * - end
    * - end_parsed
    * - done
    * @param    event    name of event
    * @param  listener listener function
    * @return returns this object for chaining
    */
  // tslint:disable-next-line ban-types
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: String, listener: EndEventHandler): this.type = js.native
  def on(event: String, listener: RecordParsedEventHandler): this.type = js.native
  /**
    * The function is called each time a file line being found in csv stream.
    * @param  callback callback function
    * @return returns this object for chaining
    */
  def preFileLine(callback: js.Function2[/* line */ String, /* rowNumber */ Double, String]): this.type = js.native
  /**
    * The function in preRawData will be called directly with the string from upper stream.
    * @param  callback callback function
    * @return returns this object for chaining
    */
  def preRawData(
    callback: js.Function2[/* csvRawData */ String, /* cb */ js.Function1[/* newData */ js.Any, Unit], Unit]
  ): this.type = js.native
  /**
    * Transform objects after CSV parsing but before result being emitted or pushed downstream.
    * @param  callback transform function
    * @return returns this object for chaining
    */
  def transf(
    callback: js.Function3[/* jsonObj */ js.Any, /* csvRow */ js.Array[String], /* rowNumber */ Double, Unit]
  ): this.type = js.native
}

