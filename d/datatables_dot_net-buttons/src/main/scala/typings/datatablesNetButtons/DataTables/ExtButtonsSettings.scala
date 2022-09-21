package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtButtonsSettings extends StObject {
  
  var collection: ExtButtonsCollectionSettings
  
  var csvHtml5: ButtonSettings
}
object ExtButtonsSettings {
  
  inline def apply(collection: ExtButtonsCollectionSettings, csvHtml5: ButtonSettings): ExtButtonsSettings = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], csvHtml5 = csvHtml5.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtButtonsSettings]
  }
  
  extension [Self <: ExtButtonsSettings](x: Self) {
    
    inline def setCollection(value: ExtButtonsCollectionSettings): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCsvHtml5(value: ButtonSettings): Self = StObject.set(x, "csvHtml5", value.asInstanceOf[js.Any])
  }
}
