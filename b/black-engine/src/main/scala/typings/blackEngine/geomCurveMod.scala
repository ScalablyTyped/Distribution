package typings.blackEngine

import typings.blackEngine.geomVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomCurveMod {
  
  @JSImport("black-engine/geom/Curve", "Curve")
  @js.native
  open class Curve () extends StObject {
    
    /* private */ var __initPoints: Any = js.native
    
    /* private */ var __refreshCache: Any = js.native
    
    /* private */ var __refreshEachT: Any = js.native
    
    def baked: Boolean = js.native
    def baked_=(arg: Boolean): Unit = js.native
    
    def getFullLength(): Double = js.native
    
    def interpolate(t: Double): Vector = js.native
    def interpolate(t: Double, outVector: Vector): Vector = js.native
    
    /* private */ var mBaked: Any = js.native
    
    /* private */ var mEachT: Any = js.native
    
    /* private */ var mLookup: Any = js.native
    
    /* private */ var mPoints: Any = js.native
    
    /* private */ var mStep: Any = js.native
    
    def set(points: Double*): Curve = js.native
  }
  /* static members */
  object Curve {
    
    @JSImport("black-engine/geom/Curve", "Curve")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/geom/Curve", "Curve.__cache")
    @js.native
    val cache: Curve = js.native
    
    inline def getLength(points: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(points.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
    
    inline def lerp(
      t: Double,
      startX: Double,
      startY: Double,
      cpStartX: Double,
      cpStartY: Double,
      cpEndX: Double,
      cpEndY: Double,
      endX: Double,
      endY: Double
    ): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(t.asInstanceOf[js.Any], startX.asInstanceOf[js.Any], startY.asInstanceOf[js.Any], cpStartX.asInstanceOf[js.Any], cpStartY.asInstanceOf[js.Any], cpEndX.asInstanceOf[js.Any], cpEndY.asInstanceOf[js.Any], endX.asInstanceOf[js.Any], endY.asInstanceOf[js.Any])).asInstanceOf[Vector]
    inline def lerp(
      t: Double,
      startX: Double,
      startY: Double,
      cpStartX: Double,
      cpStartY: Double,
      cpEndX: Double,
      cpEndY: Double,
      endX: Double,
      endY: Double,
      outVector: Vector
    ): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(t.asInstanceOf[js.Any], startX.asInstanceOf[js.Any], startY.asInstanceOf[js.Any], cpStartX.asInstanceOf[js.Any], cpStartY.asInstanceOf[js.Any], cpEndX.asInstanceOf[js.Any], cpEndY.asInstanceOf[js.Any], endX.asInstanceOf[js.Any], endY.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Vector]
  }
}
