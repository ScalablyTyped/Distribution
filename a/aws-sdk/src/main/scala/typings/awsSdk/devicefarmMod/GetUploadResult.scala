package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUploadResult extends StObject {
  
  /**
    * An app or a set of one or more tests to upload or that have been uploaded.
    */
  var upload: js.UndefOr[Upload] = js.undefined
}
object GetUploadResult {
  
  @scala.inline
  def apply(): GetUploadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUploadResult]
  }
  
  @scala.inline
  implicit class GetUploadResultMutableBuilder[Self <: GetUploadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpload(value: Upload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
