package typings.creditCardType.typesMod

import typings.creditCardType.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreditCardType extends js.Object {
  
  var code: Name = js.native
  
  var gaps: js.Array[Double] = js.native
  
  var lengths: js.Array[Double] = js.native
  
  var matchStrength: js.UndefOr[Double] = js.native
  
  var niceType: String = js.native
  
  var patterns: js.Array[js.Array[Double] | Double] = js.native
  
  var `type`: String = js.native
}
object CreditCardType {
  
  @scala.inline
  def apply(
    code: Name,
    gaps: js.Array[Double],
    lengths: js.Array[Double],
    niceType: String,
    patterns: js.Array[js.Array[Double] | Double],
    `type`: String
  ): CreditCardType = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardType]
  }
  
  @scala.inline
  implicit class CreditCardTypeOps[Self <: CreditCardType] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Name): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapsVarargs(value: Double*): Self = this.set("gaps", js.Array(value :_*))
    
    @scala.inline
    def setGaps(value: js.Array[Double]): Self = this.set("gaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthsVarargs(value: Double*): Self = this.set("lengths", js.Array(value :_*))
    
    @scala.inline
    def setLengths(value: js.Array[Double]): Self = this.set("lengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceType(value: String): Self = this.set("niceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchStrength(value: Double): Self = this.set("matchStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchStrength: Self = this.set("matchStrength", js.undefined)
  }
}
