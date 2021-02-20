package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancesHealthRequest extends StObject {
  
  /**
    * Specifies the response elements you wish to receive. To retrieve all attributes, set to All. If no attribute names are specified, returns a list of instances.
    */
  var AttributeNames: js.UndefOr[InstancesHealthAttributes] = js.native
  
  /**
    * Specify the AWS Elastic Beanstalk environment by ID.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  
  /**
    * Specify the AWS Elastic Beanstalk environment by name.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  
  /**
    * Specify the pagination token returned by a previous call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.NextToken] = js.native
}
object DescribeInstancesHealthRequest {
  
  @scala.inline
  def apply(): DescribeInstancesHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesHealthRequest]
  }
  
  @scala.inline
  implicit class DescribeInstancesHealthRequestMutableBuilder[Self <: DescribeInstancesHealthRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeNames(value: InstancesHealthAttributes): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    @scala.inline
    def setAttributeNamesVarargs(value: InstancesHealthAttribute*): Self = StObject.set(x, "AttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
