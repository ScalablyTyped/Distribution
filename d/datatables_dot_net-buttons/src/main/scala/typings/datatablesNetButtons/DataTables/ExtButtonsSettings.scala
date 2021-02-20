package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtButtonsSettings extends StObject {
  
  var collection: ExtButtonsCollectionSettings = js.native
}
object ExtButtonsSettings {
  
  @scala.inline
  def apply(collection: ExtButtonsCollectionSettings): ExtButtonsSettings = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtButtonsSettings]
  }
  
  @scala.inline
  implicit class ExtButtonsSettingsMutableBuilder[Self <: ExtButtonsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: ExtButtonsCollectionSettings): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
  }
}
