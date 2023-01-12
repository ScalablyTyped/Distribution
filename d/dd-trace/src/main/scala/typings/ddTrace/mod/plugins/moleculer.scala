package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [moleculer](https://moleculer.services/) module.
  */
trait moleculer
  extends StObject
     with Moleculer_ {
  
  /**
    * Configuration for Moleculer clients. Set to false to disable client
    * instrumentation.
    */
  var client: js.UndefOr[Boolean | Moleculer_] = js.undefined
  
  /**
    * Configuration for Moleculer servers. Set to false to disable server
    * instrumentation.
    */
  var server: js.UndefOr[Boolean | Moleculer_] = js.undefined
}
object moleculer {
  
  inline def apply(): moleculer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[moleculer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: moleculer] (val x: Self) extends AnyVal {
    
    inline def setClient(value: Boolean | Moleculer_): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setServer(value: Boolean | Moleculer_): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
