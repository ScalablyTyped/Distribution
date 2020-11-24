package typings.countriesAndTimezones.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timezone extends js.Object {
  
  var aliasOf: String | Null = js.native
  
  var country: String | Null = js.native
  
  var dstOffset: Double = js.native
  
  var dstOffsetStr: String = js.native
  
  var name: String = js.native
  
  var utcOffset: Double = js.native
  
  var utcOffsetStr: String = js.native
}
object Timezone {
  
  @scala.inline
  def apply(dstOffset: Double, dstOffsetStr: String, name: String, utcOffset: Double, utcOffsetStr: String): Timezone = {
    val __obj = js.Dynamic.literal(dstOffset = dstOffset.asInstanceOf[js.Any], dstOffsetStr = dstOffsetStr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], utcOffsetStr = utcOffsetStr.asInstanceOf[js.Any])
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
    def setDstOffset(value: Double): Self = this.set("dstOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstOffsetStr(value: String): Self = this.set("dstOffsetStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcOffset(value: Double): Self = this.set("utcOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcOffsetStr(value: String): Self = this.set("utcOffsetStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasOf(value: String): Self = this.set("aliasOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasOfNull: Self = this.set("aliasOf", null)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNull: Self = this.set("country", null)
  }
}
