package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DescriptionDownload
import typings.consumerDataStandards.consumerDataStandardsStrings.LIMITED
import typings.consumerDataStandards.consumerDataStandardsStrings.METERED
import typings.consumerDataStandards.consumerDataStandardsStrings.UNMETERED
import typings.consumerDataStandards.consumerDataStandardsStrings.UNSUPPORTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceBalanceData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Remaining value amount of data available. Required unless planType is UNSUPPORTED or UNMETERED
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An overview of plan limits. Required unless planType is UNSUPPORTED
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Remaining download data in megabytes (MB). Required unless planType is UNSUPPORTED or UNMETERED
    */
  var download: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Plan type for this feature. METERED: A plan is charged by usage for the feature. UNMETERED: A plan with no limits for a feature. LIMITED: Where plan limit inclusions apply. UNSUPPORTED: Feature is not supported
    */
  var planType: METERED | UNMETERED | LIMITED | UNSUPPORTED
  
  /**
    * Balance of data roaming charges. Required unless planType is UNSUPPORTED
    */
  var roaming: js.UndefOr[DescriptionDownload] = js.undefined
  
  /**
    * Remaining upload data in megabytes (MB). Required unless planType is UNSUPPORTED or UNMETERED
    */
  var upload: js.UndefOr[Double | Null] = js.undefined
}
object TelcoServiceBalanceData {
  
  inline def apply(planType: METERED | UNMETERED | LIMITED | UNSUPPORTED): TelcoServiceBalanceData = {
    val __obj = js.Dynamic.literal(planType = planType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoServiceBalanceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceBalanceData] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadNull: Self = StObject.set(x, "download", null)
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setPlanType(value: METERED | UNMETERED | LIMITED | UNSUPPORTED): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: DescriptionDownload): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
    
    inline def setRoamingUndefined: Self = StObject.set(x, "roaming", js.undefined)
    
    inline def setUpload(value: Double): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadNull: Self = StObject.set(x, "upload", null)
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
