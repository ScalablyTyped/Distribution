package typings.cesium

import typings.cesium.anon.GeometryLength
import typings.cesium.mod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneCreateTangentSpaceDebugPrimitiveMod {
  
  @JSImport("cesium/Source/Scene/createTangentSpaceDebugPrimitive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: GeometryLength): Primitive = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Primitive]
}
