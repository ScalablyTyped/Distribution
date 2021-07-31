package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChange extends StObject {
  
  var howMany: Double
  
  var index: Double
  
  var `type`: delete
}
object DeleteChange {
  
  @scala.inline
  def apply(howMany: Double, index: Double): DeleteChange = {
    val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[DeleteChange]
  }
  
  @scala.inline
  implicit class DeleteChangeMutableBuilder[Self <: DeleteChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
