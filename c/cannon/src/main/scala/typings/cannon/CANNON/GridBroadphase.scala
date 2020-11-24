package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBroadphase extends BroadPhase {
  
  var aabbMax: Vec3 = js.native
  
  var aabbMin: Vec3 = js.native
  
  var bins: js.Array[_] = js.native
  
  var nx: Double = js.native
  
  var ny: Double = js.native
  
  var nz: Double = js.native
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
  
  @scala.inline
  implicit class GridBroadphaseOps[Self <: GridBroadphase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAabbMax(value: Vec3): Self = this.set("aabbMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAabbMin(value: Vec3): Self = this.set("aabbMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsVarargs(value: js.Any*): Self = this.set("bins", js.Array(value :_*))
    
    @scala.inline
    def setBins(value: js.Array[_]): Self = this.set("bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNx(value: Double): Self = this.set("nx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNy(value: Double): Self = this.set("ny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNz(value: Double): Self = this.set("nz", value.asInstanceOf[js.Any])
  }
}
