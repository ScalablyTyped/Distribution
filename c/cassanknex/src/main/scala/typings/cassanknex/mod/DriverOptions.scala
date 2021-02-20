package typings.cassanknex.mod

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriverOptions extends StObject {
  
  var connection: js.UndefOr[Client | ClientOptions] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
}
object DriverOptions {
  
  @scala.inline
  def apply(): DriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriverOptions]
  }
  
  @scala.inline
  implicit class DriverOptionsMutableBuilder[Self <: DriverOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Client | ClientOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
  }
}
