package typings.convertSourceMap

import typings.convertSourceMap.anon.Multiline
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("convert-source-map", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait SourceMapConverter extends js.Object {
    /** The parsed sourcemap object */
    var sourcemap: js.Any = js.native
    /** Adds given property to the source map. Throws an error if property already exists */
    def addProperty(key: String, value: js.Any): SourceMapConverter = js.native
    /** Gets given property of the source map */
    def getProperty(key: String): js.Any = js.native
    /** Sets given property to the source map. If property doesn't exist it is added, otherwise its value is updated */
    def setProperty(key: String, value: js.Any): SourceMapConverter = js.native
    /** Converts source map to base64 encoded json string */
    def toBase64(): String = js.native
    /**
      * Converts source map to an inline comment that can be appended to the source-file.
      * By default, the comment is formatted like: //# sourceMappingURL=..., which you would normally see in a JS source file.
      * When options.multiline == true, the comment is formatted like: / *# sourceMappingURL=... *\/, which you would find in a CSS source file
      */
    def toComment(): String = js.native
    def toComment(options: Multiline): String = js.native
    /** Converts source map to json string. If space is given (optional), this will be passed to JSON.stringify when the JSON string is generated */
    def toJSON(): String = js.native
    def toJSON(space: String): String = js.native
    def toJSON(space: Double): String = js.native
    /** Returns a copy of the underlying source map */
    def toObject(): js.Any = js.native
  }
  
  val commentRegex: RegExp = js.native
  val mapFileCommentRegex: RegExp = js.native
  def fromBase64(base64: String): SourceMapConverter = js.native
  def fromComment(comment: String): SourceMapConverter = js.native
  def fromJSON(json: String): SourceMapConverter = js.native
  def fromMapFileComment(comment: String, commentFileDir: String): SourceMapConverter = js.native
  def fromMapFileSource(content: String, commentFileDir: String): SourceMapConverter | Null = js.native
  def fromObject(obj: js.Any): SourceMapConverter = js.native
  def fromSource(content: String): SourceMapConverter | Null = js.native
  def generateMapFileComment(file: String): String = js.native
  def generateMapFileComment(file: String, options: Multiline): String = js.native
  def removeComments(src: String): String = js.native
  def removeMapFileComments(src: String): String = js.native
}

