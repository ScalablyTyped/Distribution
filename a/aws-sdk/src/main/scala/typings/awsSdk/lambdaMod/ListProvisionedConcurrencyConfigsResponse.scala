package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProvisionedConcurrencyConfigsResponse extends StObject {
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * A list of provisioned concurrency configurations.
    */
  var ProvisionedConcurrencyConfigs: js.UndefOr[ProvisionedConcurrencyConfigList] = js.native
}
object ListProvisionedConcurrencyConfigsResponse {
  
  @scala.inline
  def apply(): ListProvisionedConcurrencyConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedConcurrencyConfigsResponse]
  }
  
  @scala.inline
  implicit class ListProvisionedConcurrencyConfigsResponseMutableBuilder[Self <: ListProvisionedConcurrencyConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setProvisionedConcurrencyConfigs(value: ProvisionedConcurrencyConfigList): Self = StObject.set(x, "ProvisionedConcurrencyConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedConcurrencyConfigsUndefined: Self = StObject.set(x, "ProvisionedConcurrencyConfigs", js.undefined)
    
    @scala.inline
    def setProvisionedConcurrencyConfigsVarargs(value: ProvisionedConcurrencyConfigListItem*): Self = StObject.set(x, "ProvisionedConcurrencyConfigs", js.Array(value :_*))
  }
}
