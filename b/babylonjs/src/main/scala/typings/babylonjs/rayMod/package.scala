package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rayMod {
  
  type TrianglePickingPredicate = js.Function4[
    /* p0 */ typings.babylonjs.mathVectorMod.Vector3, 
    /* p1 */ typings.babylonjs.mathVectorMod.Vector3, 
    /* p2 */ typings.babylonjs.mathVectorMod.Vector3, 
    /* ray */ typings.babylonjs.rayMod.Ray, 
    scala.Boolean
  ]
}
