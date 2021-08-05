package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtButtonsSettings extends StObject {
  
  var collection: ExtButtonsCollectionSettings
}
object ExtButtonsSettings {
  
  inline def apply(collection: ExtButtonsCollectionSettings): ExtButtonsSettings = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtButtonsSettings]
  }
  
  extension [Self <: ExtButtonsSettings](x: Self) {
    
    inline def setCollection(value: ExtButtonsCollectionSettings): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
  }
}
