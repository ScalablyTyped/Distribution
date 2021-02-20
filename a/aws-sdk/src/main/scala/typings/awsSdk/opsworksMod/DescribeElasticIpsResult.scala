package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticIpsResult extends StObject {
  
  /**
    * An ElasticIps object that describes the specified Elastic IP addresses.
    */
  var ElasticIps: js.UndefOr[typings.awsSdk.opsworksMod.ElasticIps] = js.native
}
object DescribeElasticIpsResult {
  
  @scala.inline
  def apply(): DescribeElasticIpsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticIpsResult]
  }
  
  @scala.inline
  implicit class DescribeElasticIpsResultMutableBuilder[Self <: DescribeElasticIpsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticIps(value: ElasticIps): Self = StObject.set(x, "ElasticIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticIpsUndefined: Self = StObject.set(x, "ElasticIps", js.undefined)
    
    @scala.inline
    def setElasticIpsVarargs(value: ElasticIp*): Self = StObject.set(x, "ElasticIps", js.Array(value :_*))
  }
}
