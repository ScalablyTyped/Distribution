package typings.cronConverter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Changes the * to H on the `toString()`.
    * Default: `false`.
    */
  var outputHashes: js.UndefOr[Boolean] = js.native
  
  /**
    * Changes the numbers to 3 letter month names on the `toString()`.
    * Default: `false`.
    */
  var outputMonthNames: js.UndefOr[Boolean] = js.native
  
  /**
    * Changes the numbers to 3 letter weekday names on the `toString()`.
    * Default: `false`.
    */
  var outputWeekdayNames: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines a timezone to the cron instance.
    * Default: `Local timezone`.
    */
  var timezone: js.UndefOr[String] = js.native
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
    def setOutputHashes(value: Boolean): Self = this.set("outputHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputHashes: Self = this.set("outputHashes", js.undefined)
    
    @scala.inline
    def setOutputMonthNames(value: Boolean): Self = this.set("outputMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputMonthNames: Self = this.set("outputMonthNames", js.undefined)
    
    @scala.inline
    def setOutputWeekdayNames(value: Boolean): Self = this.set("outputWeekdayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputWeekdayNames: Self = this.set("outputWeekdayNames", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
