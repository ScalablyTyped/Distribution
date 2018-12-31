package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  /**
    * Read-Only Properties
    */
  // An array of characters that are not allowed as delimiters.
  var BAD_DELIMETERS: js.Array[java.lang.String] = js.native
  // The delimiter used when it is left unspecified and cannot be detected automatically. Default is comma.
  var DefaultDelimiter: java.lang.String = js.native
  /**
    * Configurable Properties
    */
  // The size in bytes of each file chunk. Used when streaming files obtained from the DOM that exist on the local computer. Default 10 MB.
  var LocalChunkSize: java.lang.String = js.native
  /**
    * On Papa there are actually more classes exposed
    * but none of them are officially documented
    * Since we can interact with the Parser from one of the callbacks
    * I have included the API for this class.
    */
  var Parser: ParserConstructor = js.native
  // The true delimiter. Invisible. ASCII code 30. Should be doing the job we strangely rely upon commas and tabs for.
  var RECORD_SEP: java.lang.String = js.native
  // Same as LocalChunkSize, but for downloading files from remote locations. Default 5 MB.
  var RemoteChunkSize: java.lang.String = js.native
  // The relative path to Papa Parse. This is automatically detected when Papa Parse is loaded synchronously.
  var SCRIPT_PATH: java.lang.String = js.native
  // Also sometimes used as a delimiting character. ASCII code 31.
  var UNIT_SEP: java.lang.String = js.native
  // Whether or not the browser supports HTML5 Web Workers. If false, worker: true will have no effect.
  var WORKERS_SUPPORTED: scala.Boolean = js.native
  /**
    * Parse a csv string or a csv file
    */
  def parse(csvString: java.lang.String): ParseResult = js.native
  def parse(csvString: java.lang.String, config: ParseConfig): ParseResult = js.native
  def parseFiles(input: FileObject): ParseResult = js.native
  def parseFiles(input: FileObject, config: ParseConfig): ParseResult = js.native
  /**
    * Parse single file or multiple files
    */
  def parseFiles(input: java.lang.String): ParseResult = js.native
  def parseFiles(input: java.lang.String, config: ParseConfig): ParseResult = js.native
  def parseFiles(input: js.Array[FileObject | java.lang.String]): ParseResult = js.native
  def parseFiles(input: js.Array[FileObject | java.lang.String], config: ParseConfig): ParseResult = js.native
  def unparse(data: UnparseObject): java.lang.String = js.native
  def unparse(data: UnparseObject, config: UnparseConfig): java.lang.String = js.native
  /**
    * Unparses javascript data objects and returns a csv string
    */
  def unparse(data: js.Array[js.Array[_] | js.Object]): java.lang.String = js.native
  def unparse(data: js.Array[js.Array[_] | js.Object], config: UnparseConfig): java.lang.String = js.native
}

