package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverInstancesResponse extends StObject {
  
  /**
    * A complex type that contains one HttpInstanceSummary for each registered instance.
    */
  var Instances: js.UndefOr[HttpInstanceSummaryList] = js.native
}
object DiscoverInstancesResponse {
  
  @scala.inline
  def apply(): DiscoverInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInstancesResponse]
  }
  
  @scala.inline
  implicit class DiscoverInstancesResponseMutableBuilder[Self <: DiscoverInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: HttpInstanceSummaryList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: HttpInstanceSummary*): Self = StObject.set(x, "Instances", js.Array(value :_*))
  }
}
