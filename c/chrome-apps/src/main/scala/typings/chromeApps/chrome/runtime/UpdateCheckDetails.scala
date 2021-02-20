package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCheckDetails extends StObject {
  
  /** The version of the available update. */
  var version: String = js.native
}
object UpdateCheckDetails {
  
  @scala.inline
  def apply(version: String): UpdateCheckDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCheckDetails]
  }
  
  @scala.inline
  implicit class UpdateCheckDetailsMutableBuilder[Self <: UpdateCheckDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
