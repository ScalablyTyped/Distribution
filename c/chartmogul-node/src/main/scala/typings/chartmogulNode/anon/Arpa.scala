package typings.chartmogulNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arpa extends js.Object {
  
  var arpa: Double = js.native
  
  var arr: Double = js.native
  
  var asp: Double = js.native
  
  var `customer-churn-rate`: Double = js.native
  
  var customers: Double = js.native
  
  var date: String = js.native
  
  var ltv: Double = js.native
  
  var mrr: Double = js.native
  
  var `mrr-churn-rate`: Double = js.native
}
object Arpa {
  
  @scala.inline
  def apply(
    arpa: Double,
    arr: Double,
    asp: Double,
    `customer-churn-rate`: Double,
    customers: Double,
    date: String,
    ltv: Double,
    mrr: Double,
    `mrr-churn-rate`: Double
  ): Arpa = {
    val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], arr = arr.asInstanceOf[js.Any], asp = asp.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any])
    __obj.updateDynamic("customer-churn-rate")(`customer-churn-rate`.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arpa]
  }
  
  @scala.inline
  implicit class ArpaOps[Self <: Arpa] (val x: Self) extends AnyVal {
    
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
    def setArpa(value: Double): Self = this.set("arpa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArr(value: Double): Self = this.set("arr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsp(value: Double): Self = this.set("asp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCustomer-churn-rate`(value: Double): Self = this.set("customer-churn-rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomers(value: Double): Self = this.set("customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtv(value: Double): Self = this.set("ltv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMrr(value: Double): Self = this.set("mrr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMrr-churn-rate`(value: Double): Self = this.set("mrr-churn-rate", value.asInstanceOf[js.Any])
  }
}
