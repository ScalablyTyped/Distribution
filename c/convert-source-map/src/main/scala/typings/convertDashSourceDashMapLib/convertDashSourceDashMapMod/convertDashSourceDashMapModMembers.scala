package typings
package convertDashSourceDashMapLib.convertDashSourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("convert-source-map", JSImport.Namespace)
@js.native
object convertDashSourceDashMapModMembers extends js.Object {
  val commentRegex: stdLib.RegExp = js.native
  val mapFileCommentRegex: stdLib.RegExp = js.native
  def fromBase64(base64: java.lang.String): SourceMapConverter = js.native
  def fromComment(comment: java.lang.String): SourceMapConverter = js.native
  def fromJSON(json: java.lang.String): SourceMapConverter = js.native
  def fromMapFileComment(comment: java.lang.String, commentFileDir: java.lang.String): SourceMapConverter = js.native
  def fromMapFileSource(content: java.lang.String, commentFileDir: java.lang.String): SourceMapConverter | scala.Null = js.native
  def fromObject(obj: js.Any): SourceMapConverter = js.native
  def fromSource(content: java.lang.String): SourceMapConverter | scala.Null = js.native
  def generateMapFileComment(file: java.lang.String): java.lang.String = js.native
  def generateMapFileComment(file: java.lang.String, options: convertDashSourceDashMapLib.Anon_Multiline): java.lang.String = js.native
  def removeComments(src: java.lang.String): java.lang.String = js.native
  def removeMapFileComments(src: java.lang.String): java.lang.String = js.native
}

