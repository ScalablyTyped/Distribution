package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticGpuHealth extends js.Object {
  
  /**
    * The health status.
    */
  var Status: js.UndefOr[ElasticGpuStatus] = js.native
}
object ElasticGpuHealth {
  
  @scala.inline
  def apply(): ElasticGpuHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuHealth]
  }
  
  @scala.inline
  implicit class ElasticGpuHealthOps[Self <: ElasticGpuHealth] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ElasticGpuStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
