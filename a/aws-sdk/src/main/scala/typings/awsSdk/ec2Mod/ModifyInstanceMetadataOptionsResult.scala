package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceMetadataOptionsResult extends js.Object {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The metadata options for the instance.
    */
  var InstanceMetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse] = js.native
}
object ModifyInstanceMetadataOptionsResult {
  
  @scala.inline
  def apply(): ModifyInstanceMetadataOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceMetadataOptionsResult]
  }
  
  @scala.inline
  implicit class ModifyInstanceMetadataOptionsResultOps[Self <: ModifyInstanceMetadataOptionsResult] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceMetadataOptions(value: InstanceMetadataOptionsResponse): Self = this.set("InstanceMetadataOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceMetadataOptions: Self = this.set("InstanceMetadataOptions", js.undefined)
  }
}
