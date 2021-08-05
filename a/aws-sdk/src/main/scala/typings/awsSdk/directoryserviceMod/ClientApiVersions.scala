package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientApiVersions extends StObject {
  
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[typings.awsSdk.directoryserviceMod.apiVersion] = js.undefined
}
object ClientApiVersions {
  
  inline def apply(): ClientApiVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientApiVersions]
  }
  
  extension [Self <: ClientApiVersions](x: Self) {
    
    inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
  }
}
