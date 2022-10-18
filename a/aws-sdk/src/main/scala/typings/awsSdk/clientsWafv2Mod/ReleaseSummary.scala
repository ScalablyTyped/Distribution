package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseSummary extends StObject {
  
  /**
    * The release version. 
    */
  var ReleaseVersion: js.UndefOr[VersionKeyString] = js.undefined
  
  /**
    * The timestamp of the release. 
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object ReleaseSummary {
  
  inline def apply(): ReleaseSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseSummary]
  }
  
  extension [Self <: ReleaseSummary](x: Self) {
    
    inline def setReleaseVersion(value: VersionKeyString): Self = StObject.set(x, "ReleaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "ReleaseVersion", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
