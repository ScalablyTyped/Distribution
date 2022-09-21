package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusResponseBody extends StObject {
  
  /**
    * The TypeScript version (`ts.version`).
    */
  var version: String
}
object StatusResponseBody {
  
  inline def apply(version: String): StatusResponseBody = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusResponseBody]
  }
  
  extension [Self <: StatusResponseBody](x: Self) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
