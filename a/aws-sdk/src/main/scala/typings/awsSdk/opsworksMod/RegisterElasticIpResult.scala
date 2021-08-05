package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterElasticIpResult extends StObject {
  
  /**
    * The Elastic IP address.
    */
  var ElasticIp: js.UndefOr[String] = js.undefined
}
object RegisterElasticIpResult {
  
  inline def apply(): RegisterElasticIpResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterElasticIpResult]
  }
  
  extension [Self <: RegisterElasticIpResult](x: Self) {
    
    inline def setElasticIp(value: String): Self = StObject.set(x, "ElasticIp", value.asInstanceOf[js.Any])
    
    inline def setElasticIpUndefined: Self = StObject.set(x, "ElasticIp", js.undefined)
  }
}
