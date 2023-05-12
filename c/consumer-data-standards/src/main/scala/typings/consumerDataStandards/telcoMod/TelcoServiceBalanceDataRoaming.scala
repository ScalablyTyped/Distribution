package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceBalanceDataRoaming
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Amount value of data roaming charges. Required unless planType is UNSUPPORTED
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An overview of plan limits. Required unless planType is UNSUPPORTED
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Amount of data used overseas in megabytes (MB). Required unless planType is UNSUPPORTED
    */
  var download: js.UndefOr[Double | Null] = js.undefined
}
object TelcoServiceBalanceDataRoaming {
  
  inline def apply(): TelcoServiceBalanceDataRoaming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoServiceBalanceDataRoaming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceBalanceDataRoaming] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadNull: Self = StObject.set(x, "download", null)
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
  }
}
