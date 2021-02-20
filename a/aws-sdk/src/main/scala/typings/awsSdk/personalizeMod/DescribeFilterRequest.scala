package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFilterRequest extends StObject {
  
  /**
    * The ARN of the filter to describe.
    */
  var filterArn: Arn = js.native
}
object DescribeFilterRequest {
  
  @scala.inline
  def apply(filterArn: Arn): DescribeFilterRequest = {
    val __obj = js.Dynamic.literal(filterArn = filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFilterRequest]
  }
  
  @scala.inline
  implicit class DescribeFilterRequestMutableBuilder[Self <: DescribeFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
  }
}
