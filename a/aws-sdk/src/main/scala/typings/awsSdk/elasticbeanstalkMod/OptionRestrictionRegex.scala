package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionRestrictionRegex extends js.Object {
  
  /**
    * A unique name representing this regular expression.
    */
  var Label: js.UndefOr[RegexLabel] = js.native
  
  /**
    * The regular expression pattern that a string configuration option value with this restriction must match.
    */
  var Pattern: js.UndefOr[RegexPattern] = js.native
}
object OptionRestrictionRegex {
  
  @scala.inline
  def apply(): OptionRestrictionRegex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionRestrictionRegex]
  }
  
  @scala.inline
  implicit class OptionRestrictionRegexOps[Self <: OptionRestrictionRegex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabel(value: RegexLabel): Self = this.set("Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("Label", js.undefined)
    
    @scala.inline
    def setPattern(value: RegexPattern): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("Pattern", js.undefined)
  }
}
