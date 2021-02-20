package typings.babylonjs.mod

import typings.babylonjs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PointsCloudSystem")
@js.native
class PointsCloudSystem protected ()
  extends typings.babylonjs.legacyMod.PointsCloudSystem {
  /**
    * Creates a PCS (Points Cloud System) object
    * @param name (String) is the PCS name, this will be the underlying mesh name
    * @param pointSize (number) is the size for each point
    * @param scene (Scene) is the scene in which the PCS is added
    * @param options defines the options of the PCS e.g.
    * * updatable (optional boolean, default true) : if the PCS must be updatable or immutable
    */
  def this(name: String, pointSize: Double, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, pointSize: Double, scene: typings.babylonjs.sceneMod.Scene, options: `0`) = this()
}
