package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metaData {
  
  @JSImport("cornerstone-core", "metaData")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a metadata provider with the specified priority
    * @param provider Metadata provider function
    * @param [priority=0] - 0 is default/normal, > 0 is high, < 0 is low
    *
    */
  inline def addProvider(provider: Provider): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addProvider(provider: Provider, priority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProvider")(provider.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets metadata from the registered metadata providers.  Will call each one from highest priority to lowest
    * until one responds
    *
    * @param type The type of metadata requested from the metadata store
    * @param imageId The Cornerstone Image Object's imageId
    *
    * @returns The metadata retrieved from the metadata store
    */
  inline def get(`type`: String, imageId: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`type`.asInstanceOf[js.Any], imageId.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Removes the specified provider
    *
    * @param provider Metadata provider function
    *
    */
  inline def removeProvider(provider: Provider): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Provider = js.Function2[/* type */ String, /* imageId */ String, Any]
}
