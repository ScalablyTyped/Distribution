package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridBroadphase
  extends StObject
     with BroadPhase {
  
  var aabbMax: Vec3
  
  var aabbMin: Vec3
  
  var bins: js.Array[js.Any]
  
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
    bins: js.Array[js.Any],
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
  implicit class GridBroadphaseMutableBuilder[Self <: GridBroadphase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAabbMax(value: Vec3): Self = StObject.set(x, "aabbMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAabbMin(value: Vec3): Self = StObject.set(x, "aabbMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBins(value: js.Array[js.Any]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsVarargs(value: js.Any*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setNx(value: Double): Self = StObject.set(x, "nx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNy(value: Double): Self = StObject.set(x, "ny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNz(value: Double): Self = StObject.set(x, "nz", value.asInstanceOf[js.Any])
  }
}
