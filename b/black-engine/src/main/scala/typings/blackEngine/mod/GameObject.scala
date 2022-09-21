package typings.blackEngine.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "GameObject")
@js.native
open class GameObject ()
  extends typings.blackEngine.gameObjectMod.GameObject
/* static members */
object GameObject {
  
  @JSImport("black-engine", "GameObject")
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(name: String): typings.blackEngine.gameObjectMod.GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.gameObjectMod.GameObject]
  inline def find(name: String, node: typings.blackEngine.gameObjectMod.GameObject): typings.blackEngine.gameObjectMod.GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.gameObjectMod.GameObject]
  
  inline def findById(id: Double): typings.blackEngine.gameObjectMod.GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.gameObjectMod.GameObject]
  inline def findById(id: Double, node: typings.blackEngine.gameObjectMod.GameObject): typings.blackEngine.gameObjectMod.GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.gameObjectMod.GameObject]
  
  inline def findComponents(
    gameObject: typings.blackEngine.gameObjectMod.GameObject,
    `type`: Instantiable0[typings.blackEngine.componentMod.Component]
  ): js.Array[typings.blackEngine.componentMod.Component] = (^.asInstanceOf[js.Dynamic].applyDynamic("findComponents")(gameObject.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.blackEngine.componentMod.Component]]
  
  inline def findWithTag(tag: String): js.Array[typings.blackEngine.gameObjectMod.GameObject] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWithTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.blackEngine.gameObjectMod.GameObject] | Null]
  
  inline def forEach(
    gameObject: typings.blackEngine.gameObjectMod.GameObject,
    action: js.Function1[/* arg0 */ this.type, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(gameObject.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBoundsWithPoints(points: js.Array[Double], worldTransformation: typings.blackEngine.matrixMod.Matrix): typings.blackEngine.rectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.rectangleMod.Rectangle]
  inline def getBoundsWithPoints(
    points: js.Array[Double],
    worldTransformation: typings.blackEngine.matrixMod.Matrix,
    outRect: typings.blackEngine.rectangleMod.Rectangle
  ): typings.blackEngine.rectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any], outRect.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.rectangleMod.Rectangle]
  
  inline def intersects(
    gameObject: typings.blackEngine.gameObjectMod.GameObject,
    point: typings.blackEngine.vectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsAt(
    gameObject: typings.blackEngine.gameObjectMod.GameObject,
    point: typings.blackEngine.vectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersectsAt(
    gameObject: typings.blackEngine.gameObjectMod.GameObject,
    point: typings.blackEngine.vectorMod.Vector,
    outVector: typings.blackEngine.vectorMod.Vector
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def intersectsWith(
    gameObject: typings.blackEngine.gameObjectMod.GameObject,
    point: typings.blackEngine.vectorMod.Vector
  ): typings.blackEngine.gameObjectMod.GameObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsWith")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.gameObjectMod.GameObject | Null]
}
