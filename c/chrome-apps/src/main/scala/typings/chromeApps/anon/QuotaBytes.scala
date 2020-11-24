package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuotaBytes extends js.Object {
  
  var quotaBytes: integer = js.native
  
  var usageBytes: integer = js.native
}
object QuotaBytes {
  
  @scala.inline
  def apply(quotaBytes: integer, usageBytes: integer): QuotaBytes = {
    val __obj = js.Dynamic.literal(quotaBytes = quotaBytes.asInstanceOf[js.Any], usageBytes = usageBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaBytes]
  }
  
  @scala.inline
  implicit class QuotaBytesOps[Self <: QuotaBytes] (val x: Self) extends AnyVal {
    
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
    def setQuotaBytes(value: integer): Self = this.set("quotaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageBytes(value: integer): Self = this.set("usageBytes", value.asInstanceOf[js.Any])
  }
}
