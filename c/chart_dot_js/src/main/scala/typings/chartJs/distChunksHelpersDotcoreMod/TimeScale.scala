package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeScale[O /* <: TimeScaleOptions */]
  extends StObject
     with Scale2[O] {
  
  def getDataTimestamps(): js.Array[Double] = js.native
  
  def getLabelTimestamps(): js.Array[String] = js.native
  
  def normalize(values: js.Array[Double]): js.Array[Double] = js.native
}
