package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticIpsRequest extends StObject {
  
  /**
    * The instance ID. If you include this parameter, DescribeElasticIps returns a description of the Elastic IP addresses associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of Elastic IP addresses to be described. If you include this parameter, DescribeElasticIps returns a description of the specified Elastic IP addresses. Otherwise, it returns a description of every Elastic IP address.
    */
  var Ips: js.UndefOr[Strings] = js.undefined
  
  /**
    * A stack ID. If you include this parameter, DescribeElasticIps returns a description of the Elastic IP addresses that are registered with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeElasticIpsRequest {
  
  @scala.inline
  def apply(): DescribeElasticIpsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticIpsRequest]
  }
  
  @scala.inline
  implicit class DescribeElasticIpsRequestMutableBuilder[Self <: DescribeElasticIpsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setIps(value: Strings): Self = StObject.set(x, "Ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpsUndefined: Self = StObject.set(x, "Ips", js.undefined)
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = StObject.set(x, "Ips", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
