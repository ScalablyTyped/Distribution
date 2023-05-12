package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefractionTexture
  extends StObject
     with RenderTargetTexture {
  
  /**
    * Define how deep under the surface we should see.
    */
  var depth: Double = js.native
  
  /**
    * Define the reflection plane we want to use. The refractionPlane is usually set to the constructed refractor.
    * It is possible to directly set the refractionPlane by directly using a Plane(a, b, c, d) where a, b and c give the plane normal vector (a, b, c) and d is a scalar displacement from the refractionPlane to the origin. However in all but the very simplest of situations it is more straight forward to set it to the refractor as stated in the doc.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/reflectionTexture#refraction
    */
  var refractionPlane: Plane = js.native
}
