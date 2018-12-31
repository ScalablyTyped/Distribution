package typings
package convertDashSourceDashMapLib.convertDashSourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapConverter extends js.Object {
  /** The parsed sourcemap object */
  var sourcemap: js.Any = js.native
  /** Adds given property to the source map. Throws an error if property already exists */
  def addProperty(key: java.lang.String, value: js.Any): SourceMapConverter = js.native
  /** Gets given property of the source map */
  def getProperty(key: java.lang.String): js.Any = js.native
  /** Sets given property to the source map. If property doesn't exist it is added, otherwise its value is updated */
  def setProperty(key: java.lang.String, value: js.Any): SourceMapConverter = js.native
  /** Converts source map to base64 encoded json string */
  def toBase64(): java.lang.String = js.native
  /**
    * Converts source map to an inline comment that can be appended to the source-file.
    * By default, the comment is formatted like: //# sourceMappingURL=..., which you would normally see in a JS source file.
    * When options.multiline == true, the comment is formatted like: / *# sourceMappingURL=... *\/, which you would find in a CSS source file
    */
  def toComment(): java.lang.String = js.native
  def toComment(options: convertDashSourceDashMapLib.Anon_Multiline): java.lang.String = js.native
  /** Converts source map to json string. If space is given (optional), this will be passed to JSON.stringify when the JSON string is generated */
  def toJSON(): java.lang.String = js.native
  def toJSON(space: java.lang.String): java.lang.String = js.native
  def toJSON(space: scala.Double): java.lang.String = js.native
  /** Returns a copy of the underlying source map */
  def toObject(): js.Any = js.native
}

