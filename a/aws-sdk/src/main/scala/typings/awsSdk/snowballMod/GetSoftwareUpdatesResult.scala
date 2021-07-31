package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSoftwareUpdatesResult extends StObject {
  
  /**
    * The Amazon S3 presigned URL for the update file associated with the specified JobId value. The software update will be available for 2 days after this request is made. To access an update after the 2 days have passed, you'll have to make another call to GetSoftwareUpdates.
    */
  var UpdatesURI: js.UndefOr[String] = js.undefined
}
object GetSoftwareUpdatesResult {
  
  @scala.inline
  def apply(): GetSoftwareUpdatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSoftwareUpdatesResult]
  }
  
  @scala.inline
  implicit class GetSoftwareUpdatesResultMutableBuilder[Self <: GetSoftwareUpdatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdatesURI(value: String): Self = StObject.set(x, "UpdatesURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesURIUndefined: Self = StObject.set(x, "UpdatesURI", js.undefined)
  }
}
