package typings.ckeditor

import typings.ckeditor.CKEDITOR.htmlParser.rule
import typings.ckeditor.CKEDITOR.htmlParser.ruleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Option extends js.Object {
  var option: ruleOptions
  var priority: Double
  var value: rule
}

object Anon_Option {
  @scala.inline
  def apply(option: ruleOptions, priority: Double, value: rule): Anon_Option = {
    val __obj = js.Dynamic.literal(option = option, priority = priority, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Option]
  }
}

