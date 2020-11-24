package typings.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait imageAuditdata extends js.Object {
  
  var msg: Double = js.native
  
  var probability: Double = js.native
  
  var stars: js.Array[imageAuditdata] = js.native
  
  var `type`: Double = js.native
  
  var words: Double = js.native
}
object imageAuditdata {
  
  @scala.inline
  def apply(msg: Double, probability: Double, stars: js.Array[imageAuditdata], `type`: Double, words: Double): imageAuditdata = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], stars = stars.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditdata]
  }
  
  @scala.inline
  implicit class imageAuditdataOps[Self <: imageAuditdata] (val x: Self) extends AnyVal {
    
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
    def setMsg(value: Double): Self = this.set("msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbability(value: Double): Self = this.set("probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarsVarargs(value: imageAuditdata*): Self = this.set("stars", js.Array(value :_*))
    
    @scala.inline
    def setStars(value: js.Array[imageAuditdata]): Self = this.set("stars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWords(value: Double): Self = this.set("words", value.asInstanceOf[js.Any])
  }
}
