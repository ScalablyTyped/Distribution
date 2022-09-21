package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Path3D")
@js.native
open class Path3D protected ()
  extends typings.babylonjs.indexMod.Path3D {
  /**
    * new Path3D(path, normal, raw)
    * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
    * please read the description in the tutorial : https://doc.babylonjs.com/how_to/how_to_use_path3d
    * @param path an array of Vector3, the curve axis of the Path3D
    * @param firstNormal (options) Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
    * @param raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
    * @param alignTangentsWithPath (optional, default false) : boolean, if true the tangents will be aligned with the path.
    */
  def this(/**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3]) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    firstNormal: Nullable[typings.babylonjs.mathVectorMod.Vector3]
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    firstNormal: Unit,
    raw: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    firstNormal: Nullable[typings.babylonjs.mathVectorMod.Vector3],
    raw: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    firstNormal: Unit,
    raw: Boolean,
    alignTangentsWithPath: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    firstNormal: Unit,
    raw: Unit,
    alignTangentsWithPath: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    firstNormal: Nullable[typings.babylonjs.mathVectorMod.Vector3],
    raw: Boolean,
    alignTangentsWithPath: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.mathVectorMod.Vector3],
    firstNormal: Nullable[typings.babylonjs.mathVectorMod.Vector3],
    raw: Unit,
    alignTangentsWithPath: Boolean
  ) = this()
}
