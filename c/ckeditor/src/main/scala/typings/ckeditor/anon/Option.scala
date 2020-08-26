package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.htmlParser.fragment
import typings.ckeditor.CKEDITOR.htmlParser.node
import typings.ckeditor.CKEDITOR.htmlParser.rule
import typings.ckeditor.CKEDITOR.htmlParser.ruleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var option: ruleOptions = js.native
  var priority: Double = js.native
  var value: rule = js.native
}

object Option {
  @scala.inline
  def apply(option: ruleOptions, priority: Double, value: rule): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
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
    def setOption(value: ruleOptions): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueFunction1(value: /* value */ node | fragment | String => Boolean): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: rule): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

