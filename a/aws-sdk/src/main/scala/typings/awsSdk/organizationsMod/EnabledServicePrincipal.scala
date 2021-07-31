package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledServicePrincipal extends StObject {
  
  /**
    * The date that the service principal was enabled for integration with AWS Organizations.
    */
  var DateEnabled: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.organizationsMod.ServicePrincipal] = js.undefined
}
object EnabledServicePrincipal {
  
  @scala.inline
  def apply(): EnabledServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledServicePrincipal]
  }
  
  @scala.inline
  implicit class EnabledServicePrincipalMutableBuilder[Self <: EnabledServicePrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateEnabled(value: Timestamp): Self = StObject.set(x, "DateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateEnabledUndefined: Self = StObject.set(x, "DateEnabled", js.undefined)
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
