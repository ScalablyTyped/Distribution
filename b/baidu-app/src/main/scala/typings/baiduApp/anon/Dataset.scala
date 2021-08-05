package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataset extends StObject {
  
  var dataset: String
}
object Dataset {
  
  inline def apply(dataset: String): Dataset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
  
  extension [Self <: Dataset](x: Self) {
    
    inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
  }
}
