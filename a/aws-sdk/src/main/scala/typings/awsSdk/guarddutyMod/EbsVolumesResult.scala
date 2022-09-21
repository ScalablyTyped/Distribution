package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsVolumesResult extends StObject {
  
  /**
    * Describes whether scanning EBS volumes is enabled as a data source.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.undefined
}
object EbsVolumesResult {
  
  inline def apply(): EbsVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsVolumesResult]
  }
  
  extension [Self <: EbsVolumesResult](x: Self) {
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
