package typings.chartJs.mod

import typings.chartJs.anon.Max
import typings.chartJs.distChunksHelpersDotcoreMod.D_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolarAreaController extends D_ {
  
  /**
    * @private
    */
  /* private */ var _computeAngle: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _updateRadius: Any = js.native
  
  def countVisibleElements(): Double = js.native
  
  /**
    * @protected
    */
  /* protected */ def getMinMax(): Max = js.native
  
  var innerRadius: Double = js.native
  
  var outerRadius: Double = js.native
  
  def parseObjectData(meta: Any, data: Any, start: Any, count: Any): js.Array[Any] = js.native
  
  def update(mode: Any): scala.Unit = js.native
}
