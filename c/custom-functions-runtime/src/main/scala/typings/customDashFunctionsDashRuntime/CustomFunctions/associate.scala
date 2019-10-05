package typings.customDashFunctionsDashRuntime.CustomFunctions

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CustomFunctions.associate")
@js.native
object associate extends js.Object {
  /**
    * Associates the JavaScript function to the name given by the "id" property in the metadata JSON file.
    */
  def apply(id: String, functionObject: js.Function): Unit = js.native
  /**
    * Associates the JavaScript functions to the names given by the "id" properties in the metadata JSON file.
    */
  def apply(mappings: StringDictionary[js.Function]): Unit = js.native
}

