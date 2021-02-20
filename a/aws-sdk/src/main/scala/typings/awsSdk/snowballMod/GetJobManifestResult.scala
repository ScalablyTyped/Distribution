package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobManifestResult extends StObject {
  
  /**
    * The Amazon S3 presigned URL for the manifest file associated with the specified JobId value.
    */
  var ManifestURI: js.UndefOr[String] = js.native
}
object GetJobManifestResult {
  
  @scala.inline
  def apply(): GetJobManifestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobManifestResult]
  }
  
  @scala.inline
  implicit class GetJobManifestResultMutableBuilder[Self <: GetJobManifestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifestURI(value: String): Self = StObject.set(x, "ManifestURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestURIUndefined: Self = StObject.set(x, "ManifestURI", js.undefined)
  }
}
