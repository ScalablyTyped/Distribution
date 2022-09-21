package typings.chartJs.mod

import typings.chartJs.basicMod.AnyObject
import typings.chartJs.elementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveElement
  extends StObject
     with ActiveDataPoint {
  
  var element: Element[AnyObject, AnyObject]
}
object ActiveElement {
  
  inline def apply(datasetIndex: Double, element: Element[AnyObject, AnyObject], index: Double): ActiveElement = {
    val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveElement]
  }
  
  extension [Self <: ActiveElement](x: Self) {
    
    inline def setElement(value: Element[AnyObject, AnyObject]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
