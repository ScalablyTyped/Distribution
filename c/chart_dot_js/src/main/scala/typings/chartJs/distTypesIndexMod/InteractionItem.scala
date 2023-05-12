package typings.chartJs.distTypesIndexMod

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionItem extends StObject {
  
  var datasetIndex: Double
  
  var element: default[AnyObject, AnyObject]
  
  var index: Double
}
object InteractionItem {
  
  inline def apply(datasetIndex: Double, element: default[AnyObject, AnyObject], index: Double): InteractionItem = {
    val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionItem] (val x: Self) extends AnyVal {
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setElement(value: default[AnyObject, AnyObject]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
