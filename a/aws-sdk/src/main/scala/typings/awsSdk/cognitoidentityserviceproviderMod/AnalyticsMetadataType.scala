package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsMetadataType extends StObject {
  
  /**
    * The endpoint ID.
    */
  var AnalyticsEndpointId: js.UndefOr[StringType] = js.undefined
}
object AnalyticsMetadataType {
  
  inline def apply(): AnalyticsMetadataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsMetadataType]
  }
  
  extension [Self <: AnalyticsMetadataType](x: Self) {
    
    inline def setAnalyticsEndpointId(value: StringType): Self = StObject.set(x, "AnalyticsEndpointId", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsEndpointIdUndefined: Self = StObject.set(x, "AnalyticsEndpointId", js.undefined)
  }
}
