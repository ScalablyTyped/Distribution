package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAlgorithmRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm to describe.
    */
  var algorithmArn: Arn = js.native
}
object DescribeAlgorithmRequest {
  
  @scala.inline
  def apply(algorithmArn: Arn): DescribeAlgorithmRequest = {
    val __obj = js.Dynamic.literal(algorithmArn = algorithmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmRequest]
  }
  
  @scala.inline
  implicit class DescribeAlgorithmRequestOps[Self <: DescribeAlgorithmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithmArn(value: Arn): Self = this.set("algorithmArn", value.asInstanceOf[js.Any])
  }
}
