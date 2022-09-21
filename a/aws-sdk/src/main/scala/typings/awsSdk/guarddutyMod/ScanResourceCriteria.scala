package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanResourceCriteria extends StObject {
  
  /**
    * Represents condition that when matched will prevent a malware scan for a certain resource.
    */
  var Exclude: js.UndefOr[ScanCriterion] = js.undefined
  
  /**
    * Represents condition that when matched will allow a malware scan for a certain resource.
    */
  var Include: js.UndefOr[ScanCriterion] = js.undefined
}
object ScanResourceCriteria {
  
  inline def apply(): ScanResourceCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanResourceCriteria]
  }
  
  extension [Self <: ScanResourceCriteria](x: Self) {
    
    inline def setExclude(value: ScanCriterion): Self = StObject.set(x, "Exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "Exclude", js.undefined)
    
    inline def setInclude(value: ScanCriterion): Self = StObject.set(x, "Include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "Include", js.undefined)
  }
}
