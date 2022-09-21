package typings.chui.anon

import typings.chui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  /**
    * This method parses a string and an optoinal variable name and returns a parsed template in the form of a function. You can then pass this function data to get rendered nodes.
    *
    * @param template A string of markup to use as a template.
    * @param variable An option name to use in the template. If it were "myData": [[= myData.name]]. Otherwise it defaults to "data": [[= data.name]].
    * @return A function.
    */
  def apply(template: String): js.Function = js.native
  def apply(template: String, variable: String): js.Function = js.native
  
  /**
    * A object that holds the reference to the controller for a repeater.
    * This is used to cache the data that a repeater uses. After the repeater is rendered, the reference is deleted from this object.
    *
    */
  var data: RepeaterName = js.native
  
  /**
    * Use this value to output an index value in a template repeater.
    */
  var index: Double = js.native
  
  /**
    * A method to repeated output a template.
    *
    * @param element The target container into which the content will be inserted.
    * @param template A string of markup.
    * @param data The iterable data the template will consume.
    * @return void.
    */
  def repeater(element: JQuery, template: String, data: Any): Unit = js.native
}
