package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasourcePackageIngestDetail extends StObject {
  
  /**
    * Details on which data source packages are ingested for a member account.
    */
  var DatasourcePackageIngestState: js.UndefOr[typings.awsSdk.detectiveMod.DatasourcePackageIngestState] = js.undefined
  
  /**
    * The date a data source package was enabled for this account
    */
  var LastIngestStateChange: js.UndefOr[LastIngestStateChangeDates] = js.undefined
}
object DatasourcePackageIngestDetail {
  
  inline def apply(): DatasourcePackageIngestDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasourcePackageIngestDetail]
  }
  
  extension [Self <: DatasourcePackageIngestDetail](x: Self) {
    
    inline def setDatasourcePackageIngestState(value: DatasourcePackageIngestState): Self = StObject.set(x, "DatasourcePackageIngestState", value.asInstanceOf[js.Any])
    
    inline def setDatasourcePackageIngestStateUndefined: Self = StObject.set(x, "DatasourcePackageIngestState", js.undefined)
    
    inline def setLastIngestStateChange(value: LastIngestStateChangeDates): Self = StObject.set(x, "LastIngestStateChange", value.asInstanceOf[js.Any])
    
    inline def setLastIngestStateChangeUndefined: Self = StObject.set(x, "LastIngestStateChange", js.undefined)
  }
}
