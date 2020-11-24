package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timezone extends js.Object {
  
  var abbr: String = js.native
  
  var isdst: Boolean = js.native
  
  var name: String = js.native
  
  var offset: Double = js.native
  
  var text: String = js.native
  
  var utc: js.Array[String] = js.native
}
object Timezone {
  
  @scala.inline
  def apply(abbr: String, isdst: Boolean, name: String, offset: Double, text: String, utc: js.Array[String]): Timezone = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], isdst = isdst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], utc = utc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timezone]
  }
  
  @scala.inline
  implicit class TimezoneOps[Self <: Timezone] (val x: Self) extends AnyVal {
    
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
    def setAbbr(value: String): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsdst(value: Boolean): Self = this.set("isdst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcVarargs(value: String*): Self = this.set("utc", js.Array(value :_*))
    
    @scala.inline
    def setUtc(value: js.Array[String]): Self = this.set("utc", value.asInstanceOf[js.Any])
  }
}
