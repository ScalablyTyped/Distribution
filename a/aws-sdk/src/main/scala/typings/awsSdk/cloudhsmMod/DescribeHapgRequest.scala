package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHapgRequest extends StObject {
  
  /**
    * The ARN of the high-availability partition group to describe.
    */
  var HapgArn: typings.awsSdk.cloudhsmMod.HapgArn = js.native
}
object DescribeHapgRequest {
  
  @scala.inline
  def apply(HapgArn: HapgArn): DescribeHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHapgRequest]
  }
  
  @scala.inline
  implicit class DescribeHapgRequestMutableBuilder[Self <: DescribeHapgRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
  }
}
