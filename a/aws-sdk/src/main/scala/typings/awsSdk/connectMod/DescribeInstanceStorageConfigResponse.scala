package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceStorageConfigResponse extends StObject {
  
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
  implicit class DescribeInstanceStorageConfigResponseMutableBuilder[Self <: DescribeInstanceStorageConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageConfig(value: InstanceStorageConfig): Self = StObject.set(x, "StorageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageConfigUndefined: Self = StObject.set(x, "StorageConfig", js.undefined)
  }
}
