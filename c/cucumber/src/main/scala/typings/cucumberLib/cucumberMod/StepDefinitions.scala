package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepDefinitions extends js.Object {
  def Given(pattern: java.lang.String, code: StepDefinitionCode): scala.Unit = js.native
  def Given(pattern: java.lang.String, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def Given(pattern: stdLib.RegExp, code: StepDefinitionCode): scala.Unit = js.native
  def Given(pattern: stdLib.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def Then(pattern: java.lang.String, code: StepDefinitionCode): scala.Unit = js.native
  def Then(pattern: java.lang.String, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def Then(pattern: stdLib.RegExp, code: StepDefinitionCode): scala.Unit = js.native
  def Then(pattern: stdLib.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: java.lang.String, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: java.lang.String, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: stdLib.RegExp, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: stdLib.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def setDefaultTimeout(time: scala.Double): scala.Unit = js.native
}

