package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Download
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Cost amount of data usage
    */
  var amount: String
  
  /**
    * Amount of data downloaded in megabytes (MB)
    */
  var download: Double
  
  /**
    * Required if roaming is suipported
    */
  var roaming: js.UndefOr[Download] = js.undefined
  
  /**
    * Number of data sessions
    */
  var sessions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Amount of data uploaded in megabytes (MB)
    */
  var upload: Double
}
object TelcoUsageData {
  
  inline def apply(amount: String, download: Double, upload: Double): TelcoUsageData = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoUsageData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageData] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: Download): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
    
    inline def setRoamingUndefined: Self = StObject.set(x, "roaming", js.undefined)
    
    inline def setSessions(value: Double): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsNull: Self = StObject.set(x, "sessions", null)
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setUpload(value: Double): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}
