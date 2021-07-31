package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallToRemoteAccessSessionResult extends StObject {
  
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[Upload] = js.undefined
}
object InstallToRemoteAccessSessionResult {
  
  @scala.inline
  def apply(): InstallToRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallToRemoteAccessSessionResult]
  }
  
  @scala.inline
  implicit class InstallToRemoteAccessSessionResultMutableBuilder[Self <: InstallToRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUpload(value: Upload): Self = StObject.set(x, "appUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUploadUndefined: Self = StObject.set(x, "appUpload", js.undefined)
  }
}
