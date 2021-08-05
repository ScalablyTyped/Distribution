package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationMediaFailureCause extends StObject {
  
  /**
    * The reason that an installation media import failed.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object InstallationMediaFailureCause {
  
  inline def apply(): InstallationMediaFailureCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMediaFailureCause]
  }
  
  extension [Self <: InstallationMediaFailureCause](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
