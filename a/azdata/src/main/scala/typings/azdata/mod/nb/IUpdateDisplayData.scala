package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.update_display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUpdateDisplayData
  extends IDisplayResult
     with Output {
  
  @JSName("output_type")
  var output_type_IUpdateDisplayData: update_display_data = js.native
}
object IUpdateDisplayData {
  
  @scala.inline
  def apply(data: StringDictionary[js.Any], output_type: update_display_data): IUpdateDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDisplayData]
  }
  
  @scala.inline
  implicit class IUpdateDisplayDataMutableBuilder[Self <: IUpdateDisplayData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput_type(value: update_display_data): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
