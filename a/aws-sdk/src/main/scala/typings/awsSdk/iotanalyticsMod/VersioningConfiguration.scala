package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersioningConfiguration extends StObject {
  
  /**
    * How many versions of dataset contents are kept. The unlimited parameter must be false.
    */
  var maxVersions: js.UndefOr[MaxVersions] = js.undefined
  
  /**
    * If true, unlimited versions of dataset contents are kept.
    */
  var unlimited: js.UndefOr[UnlimitedVersioning] = js.undefined
}
object VersioningConfiguration {
  
  inline def apply(): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersioningConfiguration]
  }
  
  extension [Self <: VersioningConfiguration](x: Self) {
    
    inline def setMaxVersions(value: MaxVersions): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
    
    inline def setUnlimited(value: UnlimitedVersioning): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    inline def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
  }
}
