package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBroadphase extends BroadPhase {
  var aabbMax: Vec3
  var aabbMin: Vec3
  var bins: js.Array[_]
  var nx: Double
  var ny: Double
  var nz: Double
}

object GridBroadphase {
  @scala.inline
  def apply(
    aabbMax: Vec3,
    aabbMin: Vec3,
    aabbQuery: (World, AABB, js.Array[Body]) => js.Array[Body],
    bins: js.Array[_],
    boundingSphereCheck: (Body, Body) => Boolean,
    collisionPairs: (World, js.Array[Body], js.Array[Body]) => Unit,
    dirty: Boolean,
    doBoundingBoxBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    doBoundingSphereBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    intersectionTest: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    makePairsUnique: (js.Array[Body], js.Array[Body]) => Unit,
    needBroadphaseCollision: (Body, Body) => Boolean,
    nx: Double,
    ny: Double,
    nz: Double,
    setWorld: World => Unit,
    useBoundingBoxes: Boolean,
    world: World
  ): GridBroadphase = {
    val __obj = js.Dynamic.literal(aabbMax = aabbMax.asInstanceOf[js.Any], aabbMin = aabbMin.asInstanceOf[js.Any], aabbQuery = js.Any.fromFunction3(aabbQuery), bins = bins.asInstanceOf[js.Any], boundingSphereCheck = js.Any.fromFunction2(boundingSphereCheck), collisionPairs = js.Any.fromFunction3(collisionPairs), dirty = dirty.asInstanceOf[js.Any], doBoundingBoxBroadphase = js.Any.fromFunction4(doBoundingBoxBroadphase), doBoundingSphereBroadphase = js.Any.fromFunction4(doBoundingSphereBroadphase), intersectionTest = js.Any.fromFunction4(intersectionTest), makePairsUnique = js.Any.fromFunction2(makePairsUnique), needBroadphaseCollision = js.Any.fromFunction2(needBroadphaseCollision), nx = nx.asInstanceOf[js.Any], ny = ny.asInstanceOf[js.Any], nz = nz.asInstanceOf[js.Any], setWorld = js.Any.fromFunction1(setWorld), useBoundingBoxes = useBoundingBoxes.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBroadphase]
  }
}

