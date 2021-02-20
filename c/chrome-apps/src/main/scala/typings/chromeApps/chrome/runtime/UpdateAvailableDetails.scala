package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAvailableDetails extends StObject {
  
  /** The version number of the available update. */
  var version: String = js.native
}
object UpdateAvailableDetails {
  
  @scala.inline
  def apply(version: String): UpdateAvailableDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailableDetails]
  }
  
  @scala.inline
  implicit class UpdateAvailableDetailsMutableBuilder[Self <: UpdateAvailableDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
