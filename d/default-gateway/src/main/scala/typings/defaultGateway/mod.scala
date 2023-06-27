package typings.defaultGateway

import typings.defaultGateway.defaultGatewayInts.`4`
import typings.defaultGateway.defaultGatewayInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("default-gateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gateway4async(): js.Promise[Result[`4`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gateway4async")().asInstanceOf[js.Promise[Result[`4`]]]
  
  inline def gateway4sync(): Result[`4`] = ^.asInstanceOf[js.Dynamic].applyDynamic("gateway4sync")().asInstanceOf[Result[`4`]]
  
  inline def gateway6async(): js.Promise[Result[`6`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gateway6async")().asInstanceOf[js.Promise[Result[`6`]]]
  
  inline def gateway6sync(): Result[`6`] = ^.asInstanceOf[js.Dynamic].applyDynamic("gateway6sync")().asInstanceOf[Result[`6`]]
  
  trait Result[Family /* <: `4` | `6` */] extends StObject {
    
    /**
      * The IP address of the default gateway.
      */
    var gateway: String
    
    /**
      * Name of the interface.
      * On Windows, this is the network adapter name.
      * This can be `null` if it cannot be determined.
      */
    var int: String | Null
    
    /**
      * The IP address version of `gateway`.
      */
    var version: Family
  }
  object Result {
    
    inline def apply[Family /* <: `4` | `6` */](gateway: String, version: Family): Result[Family] = {
      val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], int = null)
      __obj.asInstanceOf[Result[Family]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result[?], Family /* <: `4` | `6` */] (val x: Self & Result[Family]) extends AnyVal {
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setInt(value: String): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setIntNull: Self = StObject.set(x, "int", null)
      
      inline def setVersion(value: Family): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
