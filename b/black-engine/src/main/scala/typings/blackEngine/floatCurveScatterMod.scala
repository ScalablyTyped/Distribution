package typings.blackEngine

import typings.blackEngine.floatScatterBaseMod.FloatScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatCurveScatterMod {
  
  @JSImport("black-engine/scatters/FloatCurveScatter", "FloatCurveScatter")
  @js.native
  open class FloatCurveScatter protected () extends FloatScatterBase {
    def this(points: Double*) = this()
    
    /* private */ var mCache: Any = js.native
    
    /* private */ var mCurve: Any = js.native
    
    /* private */ var mPointsCache: Any = js.native
    
    def points: js.Array[Double] = js.native
    def points_=(arg: js.Array[Double]): Unit = js.native
  }
}
