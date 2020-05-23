package typings.customFunctionsRuntime

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object CustomFunctions extends js.Object {
    /**
      * Associates the JavaScript function to the name given by the "id" property in the metadata JSON file.
      */
    def associate(id: String, functionObject: js.Function): Unit = js.native
    /**
      * Associates the JavaScript functions to the names given by the "id" properties in the metadata JSON file.
      */
    def associate(mappings: StringDictionary[js.Function]): Unit = js.native
  }
  
}

