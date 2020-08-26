package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Supports
  extends Node
     with AtRule {
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.native
  /** The part following @supports. */
  var supports: js.UndefOr[String] = js.native
}

object Supports {
  @scala.inline
  def apply(): Supports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Supports]
  }
  @scala.inline
  implicit class SupportsOps[Self <: Supports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRulesVarargs(value: (Rule | Comment | AtRule)*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[Rule | Comment | AtRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    @scala.inline
    def setSupports(value: String): Self = this.set("supports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupports: Self = this.set("supports", js.undefined)
  }
  
}

