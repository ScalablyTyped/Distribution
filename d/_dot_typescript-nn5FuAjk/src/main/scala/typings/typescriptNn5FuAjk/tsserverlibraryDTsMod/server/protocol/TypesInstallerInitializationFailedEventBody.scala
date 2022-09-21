package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesInstallerInitializationFailedEventBody extends StObject {
  
  var message: String
}
object TypesInstallerInitializationFailedEventBody {
  
  inline def apply(message: String): TypesInstallerInitializationFailedEventBody = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesInstallerInitializationFailedEventBody]
  }
  
  extension [Self <: TypesInstallerInitializationFailedEventBody](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
