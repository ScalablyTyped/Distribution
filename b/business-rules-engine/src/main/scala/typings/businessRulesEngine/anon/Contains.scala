package typings.businessRulesEngine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contains extends js.Object {
  
  var contains: String = js.native
  
  var creditcard: String = js.native
  
  var custom: String = js.native
  
  var date: String = js.native
  
  var dateISO: String = js.native
  
  var digits: String = js.native
  
  var email: String = js.native
  
  var equalTo: String = js.native
  
  var mask: String = js.native
  
  var max: String = js.native
  
  var maxlength: String = js.native
  
  var min: String = js.native
  
  var minlength: String = js.native
  
  var number: String = js.native
  
  var range: String = js.native
  
  var rangelength: String = js.native
  
  var remote: String = js.native
  
  var required: String = js.native
  
  var signedDigits: String = js.native
  
  var step: String = js.native
  
  var url: String = js.native
}
object Contains {
  
  @scala.inline
  def apply(
    contains: String,
    creditcard: String,
    custom: String,
    date: String,
    dateISO: String,
    digits: String,
    email: String,
    equalTo: String,
    mask: String,
    max: String,
    maxlength: String,
    min: String,
    minlength: String,
    number: String,
    range: String,
    rangelength: String,
    remote: String,
    required: String,
    signedDigits: String,
    step: String,
    url: String
  ): Contains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], creditcard = creditcard.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dateISO = dateISO.asInstanceOf[js.Any], digits = digits.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], equalTo = equalTo.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minlength = minlength.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangelength = rangelength.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], signedDigits = signedDigits.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  
  @scala.inline
  implicit class ContainsOps[Self <: Contains] (val x: Self) extends AnyVal {
    
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
    def setContains(value: String): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditcard(value: String): Self = this.set("creditcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: String): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateISO(value: String): Self = this.set("dateISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigits(value: String): Self = this.set("digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualTo(value: String): Self = this.set("equalTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlength(value: String): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinlength(value: String): Self = this.set("minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangelength(value: String): Self = this.set("rangelength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedDigits(value: String): Self = this.set("signedDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: String): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
