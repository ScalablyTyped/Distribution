package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorldTemplateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world template you want to describe.
    */
  var template: Arn = js.native
}
object DescribeWorldTemplateRequest {
  
  @scala.inline
  def apply(template: Arn): DescribeWorldTemplateRequest = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorldTemplateRequest]
  }
  
  @scala.inline
  implicit class DescribeWorldTemplateRequestMutableBuilder[Self <: DescribeWorldTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
