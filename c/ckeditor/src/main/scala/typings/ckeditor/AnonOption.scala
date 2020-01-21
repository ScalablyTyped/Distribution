package typings.ckeditor

import typings.ckeditor.CKEDITOR.htmlParser.rule
import typings.ckeditor.CKEDITOR.htmlParser.ruleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOption extends js.Object {
  var option: ruleOptions
  var priority: Double
  var value: rule
}

object AnonOption {
  @scala.inline
  def apply(option: ruleOptions, priority: Double, value: rule): AnonOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOption]
  }
}

