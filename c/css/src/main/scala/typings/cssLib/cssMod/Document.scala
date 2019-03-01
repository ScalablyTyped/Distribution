package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document
  extends Node
     with AtRule {
  /** The part following @document. */
  var document: js.UndefOr[java.lang.String] = js.undefined
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
  /** The vendor prefix in @document, or undefined if there is none. */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    document: java.lang.String = null,
    parent: Node = null,
    position: cssLib.Anon_Content = null,
    rules: js.Array[Rule | Comment | AtRule] = null,
    `type`: java.lang.String = null,
    vendor: java.lang.String = null
  ): Document = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[Document]
  }
}

