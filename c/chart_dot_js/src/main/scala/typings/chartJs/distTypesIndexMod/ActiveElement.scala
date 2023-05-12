package typings.chartJs.distTypesIndexMod

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveElement
  extends StObject
     with ActiveDataPoint {
  
  var element: default[AnyObject, AnyObject]
}
object ActiveElement {
  
  inline def apply(datasetIndex: Double, element: default[AnyObject, AnyObject], index: Double): ActiveElement = {
    val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveElement] (val x: Self) extends AnyVal {
    
    inline def setElement(value: default[AnyObject, AnyObject]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
