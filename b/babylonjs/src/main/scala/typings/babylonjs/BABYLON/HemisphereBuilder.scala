package typings.babylonjs.BABYLON

import typings.babylonjs.AnonSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.HemisphereBuilder")
@js.native
class HemisphereBuilder () extends js.Object

/* static members */
@JSGlobal("BABYLON.HemisphereBuilder")
@js.native
object HemisphereBuilder extends js.Object {
  /**
    * Creates a hemisphere mesh
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the hemisphere mesh
    */
  def CreateHemisphere(name: String, options: AnonSegments, scene: js.Any): Mesh = js.native
}

