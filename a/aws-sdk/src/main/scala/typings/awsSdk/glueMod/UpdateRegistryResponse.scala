package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRegistryResponse extends js.Object {
  
  /**
    * The Amazon Resource name (ARN) of the updated registry.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name of the updated registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
}
object UpdateRegistryResponse {
  
  @scala.inline
  def apply(): UpdateRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegistryResponse]
  }
  
  @scala.inline
  implicit class UpdateRegistryResponseOps[Self <: UpdateRegistryResponse] (val x: Self) extends AnyVal {
    
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
  }
}
