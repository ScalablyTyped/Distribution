package typings.chromeApps.anon

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuotaBytes extends StObject {
  
  var quotaBytes: integer
  
  var usageBytes: integer
}
object QuotaBytes {
  
  @scala.inline
  def apply(quotaBytes: integer, usageBytes: integer): QuotaBytes = {
    val __obj = js.Dynamic.literal(quotaBytes = quotaBytes.asInstanceOf[js.Any], usageBytes = usageBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaBytes]
  }
  
  @scala.inline
  implicit class QuotaBytesMutableBuilder[Self <: QuotaBytes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuotaBytes(value: integer): Self = StObject.set(x, "quotaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageBytes(value: integer): Self = StObject.set(x, "usageBytes", value.asInstanceOf[js.Any])
  }
}
