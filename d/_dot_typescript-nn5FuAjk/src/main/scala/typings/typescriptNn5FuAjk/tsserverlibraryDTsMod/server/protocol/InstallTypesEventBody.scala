package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallTypesEventBody extends StObject {
  
  /**
    * correlation id to match begin and end events
    */
  var eventId: Double
  
  /**
    * list of packages to install
    */
  var packages: Array[String]
}
object InstallTypesEventBody {
  
  inline def apply(eventId: Double, packages: Array[String]): InstallTypesEventBody = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallTypesEventBody]
  }
  
  extension [Self <: InstallTypesEventBody](x: Self) {
    
    inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
  }
}
