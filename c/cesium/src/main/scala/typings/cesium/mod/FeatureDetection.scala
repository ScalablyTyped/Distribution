package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureDetection {
  
  @JSImport("cesium", "FeatureDetection")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def supportsFullscreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFullscreen")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsTypedArrays(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsTypedArrays")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsWebAssembly(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsWebAssembly")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsWebWorkers(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsWebWorkers")().asInstanceOf[Boolean]
}
