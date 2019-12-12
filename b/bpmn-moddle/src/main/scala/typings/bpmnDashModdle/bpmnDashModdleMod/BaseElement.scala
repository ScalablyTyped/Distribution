package typings.bpmnDashModdle.bpmnDashModdleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseElement extends TypeDerived {
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.native
  /**
    * Reference to the extension definitions for this element
    */
  var extensionDefinitions: js.UndefOr[js.Array[ExtensionDefinition]] = js.native
  /**
    * Extension Elements
    */
  var extensionElements: js.UndefOr[ExtensionElements] = js.native
  /**
    * Is the primary Id of the element
    */
  var id: String = js.native
}

