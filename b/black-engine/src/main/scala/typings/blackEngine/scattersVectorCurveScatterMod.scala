package typings.blackEngine

import typings.blackEngine.scattersVectorScatterBaseMod.VectorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scattersVectorCurveScatterMod {
  
  @JSImport("black-engine/scatters/VectorCurveScatter", "VectorCurveScatter")
  @js.native
  open class VectorCurveScatter protected () extends VectorScatterBase {
    def this(points: Double*) = this()
    
    /* private */ var mCache: Any = js.native
    
    /* private */ var mCurve: Any = js.native
    
    /* private */ var mPointsCache: Any = js.native
    
    def points: js.Array[Double] = js.native
    def points_=(arg: js.Array[Double]): Unit = js.native
  }
}
