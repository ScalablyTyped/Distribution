package typings.chordsheetjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chordsheetjs", "Tag")
@js.native
class Tag protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, value: String) = this()
  /**
    * The tag full name. When the original tag used the short name, `name` will return the full name.
    */
  var name: String = js.native
  /**
    * The original tag name that was used to construct the tag.
    */
  var originalName: String = js.native
  /**
    * The tag value
    */
  var value: String | Null = js.native
  /**
    * Checks whether the tag value is a non-empty string.
    */
  def hasValue(): Boolean = js.native
  /**
    * Checks whether the tag is either a standard meta tag or a custom meta directive (`{x_some_name}`)
    */
  def isMetaTag(): Boolean = js.native
  /**
    * Checks whether the tag is usually rendered inline. It currently only applies to comment tags.
    */
  def isRenderable(): Boolean = js.native
}

/* static members */
@JSImport("chordsheetjs", "Tag")
@js.native
object Tag extends js.Object {
  def parse(tag: String): Tag | Null = js.native
  def parseWithRegex(tag: String, regex: String): Tag | Null = js.native
}

