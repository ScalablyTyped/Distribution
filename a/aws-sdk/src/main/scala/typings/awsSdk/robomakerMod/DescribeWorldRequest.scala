package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorldRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (arn) of the world you want to describe.
    */
  var world: Arn = js.native
}
object DescribeWorldRequest {
  
  @scala.inline
  def apply(world: Arn): DescribeWorldRequest = {
    val __obj = js.Dynamic.literal(world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorldRequest]
  }
  
  @scala.inline
  implicit class DescribeWorldRequestOps[Self <: DescribeWorldRequest] (val x: Self) extends AnyVal {
    
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
    def setWorld(value: Arn): Self = this.set("world", value.asInstanceOf[js.Any])
  }
}
