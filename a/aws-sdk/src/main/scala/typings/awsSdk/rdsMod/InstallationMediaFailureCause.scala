package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallationMediaFailureCause extends StObject {
  
  /**
    * The reason that an installation media import failed.
    */
  var Message: js.UndefOr[String] = js.native
}
object InstallationMediaFailureCause {
  
  @scala.inline
  def apply(): InstallationMediaFailureCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMediaFailureCause]
  }
  
  @scala.inline
  implicit class InstallationMediaFailureCauseMutableBuilder[Self <: InstallationMediaFailureCause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
