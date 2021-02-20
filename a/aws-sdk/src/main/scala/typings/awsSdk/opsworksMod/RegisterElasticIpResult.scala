package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterElasticIpResult extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: js.UndefOr[String] = js.native
}
object RegisterElasticIpResult {
  
  @scala.inline
  def apply(): RegisterElasticIpResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterElasticIpResult]
  }
  
  @scala.inline
  implicit class RegisterElasticIpResultMutableBuilder[Self <: RegisterElasticIpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
  }
}
