package typings.cesium

import typings.cesium.anon.DefaultAvailability
import typings.cesium.mod.exportKmlResultKml
import typings.cesium.mod.exportKmlResultKmz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportKmlMod {
  
  @JSImport("cesium/Source/DataSources/exportKml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: DefaultAvailability): js.Promise[exportKmlResultKml | exportKmlResultKmz] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[exportKmlResultKml | exportKmlResultKmz]]
}
