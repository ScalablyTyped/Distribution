package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageLensConfigurationResult extends StObject {
  
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
  implicit class GetStorageLensConfigurationResultMutableBuilder[Self <: GetStorageLensConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageLensConfiguration(value: StorageLensConfiguration): Self = StObject.set(x, "StorageLensConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLensConfigurationUndefined: Self = StObject.set(x, "StorageLensConfiguration", js.undefined)
  }
}
