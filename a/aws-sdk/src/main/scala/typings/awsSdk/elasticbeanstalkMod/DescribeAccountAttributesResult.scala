package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAttributesResult extends js.Object {
  
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
  implicit class DescribeAccountAttributesResultOps[Self <: DescribeAccountAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceQuotas(value: ResourceQuotas): Self = this.set("ResourceQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceQuotas: Self = this.set("ResourceQuotas", js.undefined)
  }
}
