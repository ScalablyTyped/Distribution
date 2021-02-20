package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateElasticIpRequest extends StObject {
  
  /**
    * The IP address for which you want to update the name.
    */
  var ElasticIp: String = js.native
  
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.native
}
object UpdateElasticIpRequest {
  
  @scala.inline
  def apply(ElasticIp: String): UpdateElasticIpRequest = {
    val __obj = js.Dynamic.literal(ElasticIp = ElasticIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticIpRequest]
  }
  
  @scala.inline
  implicit class UpdateElasticIpRequestMutableBuilder[Self <: UpdateElasticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
