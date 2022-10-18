package typings.blackEngine.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "GameObject")
@js.native
open class GameObject ()
  extends typings.blackEngine.coreGameObjectMod.GameObject
/* static members */
object GameObject {
  
  @JSImport("black-engine", "GameObject")
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(name: String): typings.blackEngine.coreGameObjectMod.GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.coreGameObjectMod.GameObject]
  inline def find(name: String, node: typings.blackEngine.coreGameObjectMod.GameObject): typings.blackEngine.coreGameObjectMod.GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.coreGameObjectMod.GameObject]
  
  inline def findById(id: Double): typings.blackEngine.coreGameObjectMod.GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.coreGameObjectMod.GameObject]
  inline def findById(id: Double, node: typings.blackEngine.coreGameObjectMod.GameObject): typings.blackEngine.coreGameObjectMod.GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.coreGameObjectMod.GameObject]
  
  inline def findComponents(
    gameObject: typings.blackEngine.coreGameObjectMod.GameObject,
    `type`: Instantiable0[typings.blackEngine.coreComponentMod.Component]
  ): js.Array[typings.blackEngine.coreComponentMod.Component] = (^.asInstanceOf[js.Dynamic].applyDynamic("findComponents")(gameObject.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.blackEngine.coreComponentMod.Component]]
  
  inline def findWithTag(tag: String): js.Array[typings.blackEngine.coreGameObjectMod.GameObject] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWithTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.blackEngine.coreGameObjectMod.GameObject] | Null]
  
  inline def forEach(
    gameObject: typings.blackEngine.coreGameObjectMod.GameObject,
    action: js.Function1[/* arg0 */ this.type, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(gameObject.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBoundsWithPoints(points: js.Array[Double], worldTransformation: typings.blackEngine.geomMatrixMod.Matrix): typings.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomRectangleMod.Rectangle]
  inline def getBoundsWithPoints(
    points: js.Array[Double],
    worldTransformation: typings.blackEngine.geomMatrixMod.Matrix,
    outRect: typings.blackEngine.geomRectangleMod.Rectangle
  ): typings.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any], outRect.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomRectangleMod.Rectangle]
  
  inline def intersects(
    gameObject: typings.blackEngine.coreGameObjectMod.GameObject,
    point: typings.blackEngine.geomVectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsAt(
    gameObject: typings.blackEngine.coreGameObjectMod.GameObject,
    point: typings.blackEngine.geomVectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsAt(
    gameObject: typings.blackEngine.coreGameObjectMod.GameObject,
    point: typings.blackEngine.geomVectorMod.Vector,
    outVector: typings.blackEngine.geomVectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsWith(
    gameObject: typings.blackEngine.coreGameObjectMod.GameObject,
    point: typings.blackEngine.geomVectorMod.Vector
  ): typings.blackEngine.coreGameObjectMod.GameObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsWith")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.coreGameObjectMod.GameObject | Null]
}
