package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExecutionOptions extends StObject {
  
  var options: StringDictionary[js.Any] = js.native
}
object QueryExecutionOptions {
  
  @scala.inline
  def apply(options: StringDictionary[js.Any]): QueryExecutionOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecutionOptions]
  }
  
  @scala.inline
  implicit class QueryExecutionOptionsMutableBuilder[Self <: QueryExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
