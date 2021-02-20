package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstancesResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about your instances.
    */
  var instances: js.UndefOr[InstanceList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetInstances request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetInstancesResult {
  
  @scala.inline
  def apply(): GetInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancesResult]
  }
  
  @scala.inline
  implicit class GetInstancesResultMutableBuilder[Self <: GetInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: InstanceList): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
