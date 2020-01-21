package typings.css.mod

import typings.css.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends Node
     with AtRule {
  /** The part following @document. */
  var document: js.UndefOr[String] = js.undefined
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
  /** The vendor prefix in @document, or undefined if there is none. */
  var vendor: js.UndefOr[String] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    document: String = null,
    parent: Node = null,
    position: AnonContent = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: String = null,
    vendor: String = null
  ): Document = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

