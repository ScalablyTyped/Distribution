package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageLensConfigurationResult extends js.Object {
  
  /**
    * The S3 Storage Lens configuration requested.
    */
  var StorageLensConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.StorageLensConfiguration] = js.native
}
object GetStorageLensConfigurationResult {
  
  @scala.inline
  def apply(): GetStorageLensConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageLensConfigurationResult]
  }
  
  @scala.inline
  implicit class GetStorageLensConfigurationResultOps[Self <: GetStorageLensConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setStorageLensConfiguration(value: StorageLensConfiguration): Self = this.set("StorageLensConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLensConfiguration: Self = this.set("StorageLensConfiguration", js.undefined)
  }
}
