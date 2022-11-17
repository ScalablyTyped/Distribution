package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoughnutController
  extends StObject
     with DatasetController1[
      ChartType, 
      Element[AnyObject, AnyObject], 
      Element[AnyObject, AnyObject], 
      ParsedDataType[ChartType]
    ] {
  
  def calculateCircumference(value: Double): Double = js.native
  
  def calculateTotal(): Double = js.native
  
  val innerRadius: Double = js.native
  
  val offsetX: Double = js.native
  
  val offsetY: Double = js.native
  
  val outerRadius: Double = js.native
}
