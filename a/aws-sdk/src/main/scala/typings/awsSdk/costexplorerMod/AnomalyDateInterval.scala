package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalyDateInterval extends js.Object {
  
  /**
    *  The last date an anomaly was observed. 
    */
  var EndDate: js.UndefOr[YearMonthDay] = js.native
  
  /**
    *  The first date an anomaly was observed. 
    */
  var StartDate: YearMonthDay = js.native
}
object AnomalyDateInterval {
  
  @scala.inline
  def apply(StartDate: YearMonthDay): AnomalyDateInterval = {
    val __obj = js.Dynamic.literal(StartDate = StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyDateInterval]
  }
  
  @scala.inline
  implicit class AnomalyDateIntervalOps[Self <: AnomalyDateInterval] (val x: Self) extends AnyVal {
    
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
    def setStartDate(value: YearMonthDay): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: YearMonthDay): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
  }
}
