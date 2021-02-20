package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.azdataStrings.display_data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisplayData
  extends IDisplayResult
     with Output {
  
  @JSName("output_type")
  var output_type_IDisplayData: display_data = js.native
}
object IDisplayData {
  
  @scala.inline
  def apply(data: StringDictionary[js.Any], output_type: display_data): IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayData]
  }
  
  @scala.inline
  implicit class IDisplayDataMutableBuilder[Self <: IDisplayData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput_type(value: display_data): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
  }
}
