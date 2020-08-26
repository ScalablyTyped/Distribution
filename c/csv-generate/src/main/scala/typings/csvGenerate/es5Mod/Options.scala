package typings.csvGenerate.es5Mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: Double | js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEnd(value: Double | Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEof(value: Boolean | String): Self = this.set("eof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEof: Self = this.set("eof", js.undefined)
    @scala.inline
    def setFixedSize(value: Boolean): Self = this.set("fixedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedSize: Self = this.set("fixedSize", js.undefined)
    @scala.inline
    def setFixed_size(value: Boolean): Self = this.set("fixed_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed_size: Self = this.set("fixed_size", js.undefined)
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    @scala.inline
    def setHigh_water_mark(value: Double): Self = this.set("high_water_mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh_water_mark: Self = this.set("high_water_mark", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMaxWordLength(value: Double): Self = this.set("maxWordLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWordLength: Self = this.set("maxWordLength", js.undefined)
    @scala.inline
    def setMax_word_length(value: Double): Self = this.set("max_word_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_word_length: Self = this.set("max_word_length", js.undefined)
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    @scala.inline
    def setObject_mode(value: Boolean): Self = this.set("object_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject_mode: Self = this.set("object_mode", js.undefined)
    @scala.inline
    def setRow_delimiter(value: String): Self = this.set("row_delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow_delimiter: Self = this.set("row_delimiter", js.undefined)
    @scala.inline
    def setSeed(value: Boolean | Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def setSleep(value: Double): Self = this.set("sleep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSleep: Self = this.set("sleep", js.undefined)
  }
  
}

