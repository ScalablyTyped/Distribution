package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterEcsClusterResult extends js.Object {
  
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.native
}
object RegisterEcsClusterResult {
  
  @scala.inline
  def apply(): RegisterEcsClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterEcsClusterResult]
  }
  
  @scala.inline
  implicit class RegisterEcsClusterResultOps[Self <: RegisterEcsClusterResult] (val x: Self) extends AnyVal {
    
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
    def setEcsClusterArn(value: String): Self = this.set("EcsClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcsClusterArn: Self = this.set("EcsClusterArn", js.undefined)
  }
}
