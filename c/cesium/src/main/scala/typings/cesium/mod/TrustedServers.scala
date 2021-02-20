package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TrustedServers {
  
  @JSImport("cesium", "TrustedServers.add")
  @js.native
  def add(host: String, port: Double): Unit = js.native
  
  @JSImport("cesium", "TrustedServers.clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("cesium", "TrustedServers.contains")
  @js.native
  def contains(contains: String): Boolean = js.native
  
  @JSImport("cesium", "TrustedServers.remove")
  @js.native
  def remove(host: String, port: Double): Unit = js.native
}
