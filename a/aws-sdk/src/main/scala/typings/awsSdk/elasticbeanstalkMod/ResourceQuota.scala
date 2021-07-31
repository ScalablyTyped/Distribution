package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceQuota extends StObject {
  
  /**
    * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
    */
  var Maximum: js.UndefOr[BoxedInt] = js.undefined
}
object ResourceQuota {
  
  @scala.inline
  def apply(): ResourceQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuota]
  }
  
  @scala.inline
  implicit class ResourceQuotaMutableBuilder[Self <: ResourceQuota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: BoxedInt): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
  }
}
