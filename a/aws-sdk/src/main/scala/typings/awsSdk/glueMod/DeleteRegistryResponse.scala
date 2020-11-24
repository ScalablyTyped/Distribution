package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRegistryResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the registry being deleted.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name of the registry being deleted.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The status of the registry. A successful operation will return the Deleting status.
    */
  var Status: js.UndefOr[RegistryStatus] = js.native
}
object DeleteRegistryResponse {
  
  @scala.inline
  def apply(): DeleteRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRegistryResponse]
  }
  
  @scala.inline
  implicit class DeleteRegistryResponseOps[Self <: DeleteRegistryResponse] (val x: Self) extends AnyVal {
    
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
    def setRegistryArn(value: GlueResourceArn): Self = this.set("RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryArn: Self = this.set("RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
    
    @scala.inline
    def setStatus(value: RegistryStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
