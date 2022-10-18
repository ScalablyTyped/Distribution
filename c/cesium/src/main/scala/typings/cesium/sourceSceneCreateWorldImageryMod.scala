package typings.cesium

import typings.cesium.anon.Style
import typings.cesium.mod.IonImageryProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneCreateWorldImageryMod {
  
  @JSImport("cesium/Source/Scene/createWorldImagery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): IonImageryProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[IonImageryProvider]
  inline def default(options: Style): IonImageryProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[IonImageryProvider]
}
