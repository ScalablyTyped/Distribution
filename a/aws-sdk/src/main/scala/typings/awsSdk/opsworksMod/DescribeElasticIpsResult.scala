package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticIpsResult extends StObject {
  
  /**
    * An ElasticIps object that describes the specified Elastic IP addresses.
    */
  var ElasticIps: js.UndefOr[typings.awsSdk.opsworksMod.ElasticIps] = js.undefined
}
object DescribeElasticIpsResult {
  
  inline def apply(): DescribeElasticIpsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticIpsResult]
  }
  
  extension [Self <: DescribeElasticIpsResult](x: Self) {
    
    inline def setElasticIps(value: ElasticIps): Self = StObject.set(x, "ElasticIps", value.asInstanceOf[js.Any])
    
    inline def setElasticIpsUndefined: Self = StObject.set(x, "ElasticIps", js.undefined)
    
    inline def setElasticIpsVarargs(value: ElasticIp*): Self = StObject.set(x, "ElasticIps", js.Array(value :_*))
  }
}
