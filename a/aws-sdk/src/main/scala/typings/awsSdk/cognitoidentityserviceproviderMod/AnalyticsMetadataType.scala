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
  
  @scala.inline
  def apply(): AnalyticsMetadataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsMetadataType]
  }
  
  @scala.inline
  implicit class AnalyticsMetadataTypeMutableBuilder[Self <: AnalyticsMetadataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsEndpointId(value: StringType): Self = StObject.set(x, "AnalyticsEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsEndpointIdUndefined: Self = StObject.set(x, "AnalyticsEndpointId", js.undefined)
  }
}
