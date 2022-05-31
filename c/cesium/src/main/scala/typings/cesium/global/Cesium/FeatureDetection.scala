package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureDetection {
  
  @JSGlobal("Cesium.FeatureDetection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def supportsFullscreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFullscreen")().asInstanceOf[Boolean]
  
  inline def supportsTypedArrays(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsTypedArrays")().asInstanceOf[Boolean]
  
  inline def supportsWebAssembly(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsWebAssembly")().asInstanceOf[Boolean]
  
  inline def supportsWebWorkers(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsWebWorkers")().asInstanceOf[Boolean]
}
