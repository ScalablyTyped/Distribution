package typings.chartJs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.chartJs.distControllersMod.PieController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcontrollers extends StObject {
  
  var BarController: TypeofBarController
  
  var BubbleController: TypeofBubbleController
  
  var DoughnutController: TypeofDoughnutController
  
  var LineController: TypeofLineController
  
  var PieController: Instantiable0[typings.chartJs.distControllersMod.PieController]
  
  var PolarAreaController: TypeofPolarAreaController
  
  var RadarController: TypeofRadarController
  
  var ScatterController: TypeofScatterController
}
object Typeofcontrollers {
  
  inline def apply(
    BarController: TypeofBarController,
    BubbleController: TypeofBubbleController,
    DoughnutController: TypeofDoughnutController,
    LineController: TypeofLineController,
    PieController: Instantiable0[PieController],
    PolarAreaController: TypeofPolarAreaController,
    RadarController: TypeofRadarController,
    ScatterController: TypeofScatterController
  ): Typeofcontrollers = {
    val __obj = js.Dynamic.literal(BarController = BarController.asInstanceOf[js.Any], BubbleController = BubbleController.asInstanceOf[js.Any], DoughnutController = DoughnutController.asInstanceOf[js.Any], LineController = LineController.asInstanceOf[js.Any], PieController = PieController.asInstanceOf[js.Any], PolarAreaController = PolarAreaController.asInstanceOf[js.Any], RadarController = RadarController.asInstanceOf[js.Any], ScatterController = ScatterController.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcontrollers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofcontrollers] (val x: Self) extends AnyVal {
    
    inline def setBarController(value: TypeofBarController): Self = StObject.set(x, "BarController", value.asInstanceOf[js.Any])
    
    inline def setBubbleController(value: TypeofBubbleController): Self = StObject.set(x, "BubbleController", value.asInstanceOf[js.Any])
    
    inline def setDoughnutController(value: TypeofDoughnutController): Self = StObject.set(x, "DoughnutController", value.asInstanceOf[js.Any])
    
    inline def setLineController(value: TypeofLineController): Self = StObject.set(x, "LineController", value.asInstanceOf[js.Any])
    
    inline def setPieController(value: Instantiable0[PieController]): Self = StObject.set(x, "PieController", value.asInstanceOf[js.Any])
    
    inline def setPolarAreaController(value: TypeofPolarAreaController): Self = StObject.set(x, "PolarAreaController", value.asInstanceOf[js.Any])
    
    inline def setRadarController(value: TypeofRadarController): Self = StObject.set(x, "RadarController", value.asInstanceOf[js.Any])
    
    inline def setScatterController(value: TypeofScatterController): Self = StObject.set(x, "ScatterController", value.asInstanceOf[js.Any])
  }
}
