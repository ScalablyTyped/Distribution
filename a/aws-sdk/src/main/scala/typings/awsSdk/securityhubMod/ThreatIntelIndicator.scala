package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatIntelIndicator extends StObject {
  
  /**
    * The category of a threat intelligence indicator.
    */
  var Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.undefined
  
  /**
    * Indicates when the most recent instance of a threat intelligence indicator was observed. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The source of the threat intelligence indicator.
    */
  var Source: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The URL to the page or site where you can get more information about the threat intelligence indicator.
    */
  var SourceUrl: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of threat intelligence indicator.
    */
  var Type: js.UndefOr[ThreatIntelIndicatorType] = js.undefined
  
  /**
    * The value of a threat intelligence indicator.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object ThreatIntelIndicator {
  
  inline def apply(): ThreatIntelIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelIndicator]
  }
  
  extension [Self <: ThreatIntelIndicator](x: Self) {
    
    inline def setCategory(value: ThreatIntelIndicatorCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setLastObservedAt(value: NonEmptyString): Self = StObject.set(x, "LastObservedAt", value.asInstanceOf[js.Any])
    
    inline def setLastObservedAtUndefined: Self = StObject.set(x, "LastObservedAt", js.undefined)
    
    inline def setSource(value: NonEmptyString): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setSourceUrl(value: NonEmptyString): Self = StObject.set(x, "SourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "SourceUrl", js.undefined)
    
    inline def setType(value: ThreatIntelIndicatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
