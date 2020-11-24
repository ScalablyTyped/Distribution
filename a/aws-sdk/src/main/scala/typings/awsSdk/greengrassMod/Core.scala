package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Core extends js.Object {
  
  /**
    * The ARN of the certificate associated with the core.
    */
  var CertificateArn: string = js.native
  
  /**
    * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string = js.native
  
  /**
    * If true, the core's local shadow is automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[boolean] = js.native
  
  /**
    * The ARN of the thing which is the core.
    */
  var ThingArn: string = js.native
}
object Core {
  
  @scala.inline
  def apply(CertificateArn: string, Id: string, ThingArn: string): Core = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ThingArn = ThingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
  
  @scala.inline
  implicit class CoreOps[Self <: Core] (val x: Self) extends AnyVal {
    
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
    def setCertificateArn(value: string): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingArn(value: string): Self = this.set("ThingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncShadow(value: boolean): Self = this.set("SyncShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncShadow: Self = this.set("SyncShadow", js.undefined)
  }
}
