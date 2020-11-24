package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceStorageConfigResponse extends js.Object {
  
  /**
    * A valid storage type.
    */
  var StorageConfig: js.UndefOr[InstanceStorageConfig] = js.native
}
object DescribeInstanceStorageConfigResponse {
  
  @scala.inline
  def apply(): DescribeInstanceStorageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceStorageConfigResponse]
  }
  
  @scala.inline
  implicit class DescribeInstanceStorageConfigResponseOps[Self <: DescribeInstanceStorageConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setStorageConfig(value: InstanceStorageConfig): Self = this.set("StorageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageConfig: Self = this.set("StorageConfig", js.undefined)
  }
}
