package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TrustedServers {
  
  @JSImport("cesium", "TrustedServers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def contains(contains: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(contains.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def remove(host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
