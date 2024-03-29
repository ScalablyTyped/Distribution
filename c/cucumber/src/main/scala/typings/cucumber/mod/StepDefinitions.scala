package typings.cucumber.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDefinitions extends StObject {
  
  def Given(pattern: String, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  
  def Then(pattern: String, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  
  def When(pattern: String, code: StepDefinitionCode): Unit = js.native
  def When(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def When(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def When(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  
  def setDefaultTimeout(time: Double): Unit = js.native
}
