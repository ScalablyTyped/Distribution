package typings.convertDashSourceDashMap.convertDashSourceDashMapMod

import typings.convertDashSourceDashMap.Anon_Multiline
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("convert-source-map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def generateMapFileComment(file: String, options: Anon_Multiline): String = js.native
  def removeComments(src: String): String = js.native
  def removeMapFileComments(src: String): String = js.native
}

