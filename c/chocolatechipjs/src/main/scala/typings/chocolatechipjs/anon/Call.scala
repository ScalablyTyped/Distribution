package typings.chocolatechipjs.anon

import typings.chocolatechipjs.ChocolateChipElementArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  /**
    * This method parses a string and an optoinal variable name and returns a parsed template in the form of a function. You can then pass this function data to get rendered nodes.
    *
    * @param template A string of markup to use as a template.
    * @param variable An option name to use in the template. If it were "myData": [[= myData.name]]. Otherwise it defaults to "data": [[= data.name]].
    */
  def apply(template: String): js.Function = js.native
  def apply(template: String, variable: String): js.Function = js.native
  
  /**
    * An object that holds the reference to the controller for a repeater.
    * This is used to cache the data that a repeater uses. After the repeater is rendered, the reference is deleted from this object.
    * Example: $.template.data["myRepeater"] = [{name: "Joe"}, {name: "Sue"}];
    */
  var data: js.Any = js.native
  
  /**
    * Use this value to output an index value in a template repeater.
    */
  var index: Double = js.native
  
  /**
    * The repeater method used to rendering iterable template data.
    */
  def repeater(): Unit = js.native
  /**
    * The repeater method used to rendering iterable template data.
    */
  def repeater(element: ChocolateChipElementArray, template: String, data: js.Any): Unit = js.native
}
