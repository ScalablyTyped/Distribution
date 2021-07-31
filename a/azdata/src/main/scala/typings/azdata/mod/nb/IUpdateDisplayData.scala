package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.update_display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateDisplayData
  extends StObject
     with IDisplayResult
     with Output {
  
  @JSName("output_type")
  var output_type_IUpdateDisplayData: update_display_data
}
object IUpdateDisplayData {
  
  @scala.inline
  def apply(data: StringDictionary[js.Any]): IUpdateDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = "update_display_data")
    __obj.asInstanceOf[IUpdateDisplayData]
  }
  
  @scala.inline
  implicit class IUpdateDisplayDataMutableBuilder[Self <: IUpdateDisplayData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput_type(value: update_display_data): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
