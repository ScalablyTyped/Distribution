package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUploadResult extends StObject {
  
  /**
    * The newly created upload.
    */
  var upload: js.UndefOr[Upload] = js.native
}
object CreateUploadResult {
  
  @scala.inline
  def apply(): CreateUploadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUploadResult]
  }
  
  @scala.inline
  implicit class CreateUploadResultMutableBuilder[Self <: CreateUploadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpload(value: Upload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
