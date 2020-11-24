package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerServicePowersResult extends js.Object {
  
  /**
    * An array of objects that describe the powers that can be specified for a container service.
    */
  var powers: js.UndefOr[ContainerServicePowerList] = js.native
}
object GetContainerServicePowersResult {
  
  @scala.inline
  def apply(): GetContainerServicePowersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServicePowersResult]
  }
  
  @scala.inline
  implicit class GetContainerServicePowersResultOps[Self <: GetContainerServicePowersResult] (val x: Self) extends AnyVal {
    
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
    def setPowersVarargs(value: ContainerServicePower*): Self = this.set("powers", js.Array(value :_*))
    
    @scala.inline
    def setPowers(value: ContainerServicePowerList): Self = this.set("powers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowers: Self = this.set("powers", js.undefined)
  }
}
