package typings.dateTime.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Custom date.
  		@default new Date()
  		*/
  var date: js.UndefOr[Date] = js.native
  
  /**
  		Show the date in the local time zone.
  		@default false
  		*/
  var local: js.UndefOr[Boolean] = js.native
  
  /**
  		Show the milliseconds in the date if any.
  		@default false
  		*/
  var showMilliseconds: js.UndefOr[Boolean] = js.native
  
  /**
  		Show the UTC time zone postfix.
  		@default false
  		*/
  var showTimeZone: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setShowMilliseconds(value: Boolean): Self = this.set("showMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMilliseconds: Self = this.set("showMilliseconds", js.undefined)
    
    @scala.inline
    def setShowTimeZone(value: Boolean): Self = this.set("showTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTimeZone: Self = this.set("showTimeZone", js.undefined)
  }
}
