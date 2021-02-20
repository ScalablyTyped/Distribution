package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAttributesResult extends StObject {
  
  /**
    * The Elastic Beanstalk resource quotas associated with the calling AWS account.
    */
  var ResourceQuotas: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceQuotas] = js.native
}
object DescribeAccountAttributesResult {
  
  @scala.inline
  def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  
  @scala.inline
  implicit class DescribeAccountAttributesResultMutableBuilder[Self <: DescribeAccountAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceQuotas(value: ResourceQuotas): Self = StObject.set(x, "ResourceQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceQuotasUndefined: Self = StObject.set(x, "ResourceQuotas", js.undefined)
  }
}
