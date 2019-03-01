package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charset
  extends Node
     with AtRule {
  /** The part following @charset. */
  var charset: js.UndefOr[java.lang.String] = js.undefined
}

object Charset {
  @scala.inline
  def apply(
    charset: java.lang.String = null,
    parent: Node = null,
    position: cssLib.Anon_Content = null,
    `type`: java.lang.String = null
  ): Charset = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Charset]
  }
}

