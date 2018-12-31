package typings
package chordsheetjsLib.chordsheetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "Tag")
@js.native
class Tag protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, value: java.lang.String) = this()
  /**
    * The tag full name. When the original tag used the short name, `name` will return the full name.
    */
  var name: java.lang.String = js.native
  /**
    * The original tag name that was used to construct the tag.
    */
  var originalName: java.lang.String = js.native
  /**
    * The tag value
    */
  var value: java.lang.String | scala.Null = js.native
  /**
    * Checks whether the tag value is a non-empty string.
    */
  def hasValue(): scala.Boolean = js.native
  /**
    * Checks whether the tag is either a standard meta tag or a custom meta directive (`{x_some_name}`)
    */
  def isMetaTag(): scala.Boolean = js.native
  /**
    * Checks whether the tag is usually rendered inline. It currently only applies to comment tags.
    */
  def isRenderable(): scala.Boolean = js.native
}

@JSImport("chordsheetjs", "Tag")
@js.native
object Tag extends js.Object {
  def parse(tag: java.lang.String): chordsheetjsLib.chordsheetjsMod.Tag | scala.Null = js.native
  def parseWithRegex(tag: java.lang.String, regex: java.lang.String): chordsheetjsLib.chordsheetjsMod.Tag | scala.Null = js.native
}

