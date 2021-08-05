package typings.cassanknex.mod

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriverOptions extends StObject {
  
  var connection: js.UndefOr[Client | ClientOptions] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
}
object DriverOptions {
  
  inline def apply(): DriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriverOptions]
  }
  
  extension [Self <: DriverOptions](x: Self) {
    
    inline def setConnection(value: Client | ClientOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
  }
}
