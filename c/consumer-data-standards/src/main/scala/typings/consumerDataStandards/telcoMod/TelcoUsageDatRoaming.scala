package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageDatRoaming
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Amount value of data roaming charges
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Amount of data used while roaming in megabytes (MB)
    */
  var download: js.UndefOr[Double | Null] = js.undefined
}
object TelcoUsageDatRoaming {
  
  inline def apply(): TelcoUsageDatRoaming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoUsageDatRoaming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageDatRoaming] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadNull: Self = StObject.set(x, "download", null)
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
  }
}
