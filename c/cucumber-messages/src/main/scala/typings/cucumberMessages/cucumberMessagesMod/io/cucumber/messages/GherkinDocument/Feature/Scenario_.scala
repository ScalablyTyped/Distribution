package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario.IExamples
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Scenario. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario")
@js.native
/**
  * Constructs a new Scenario.
  * @param [properties] Properties to set
  */
class Scenario_ () extends IScenario {
  def this(properties: IScenario) = this()
  
  /** Scenario description. */
  @JSName("description")
  var description_Scenario_ : String = js.native
  
  /** Scenario examples. */
  @JSName("examples")
  var examples_Scenario_ : js.Array[IExamples] = js.native
  
  /** Scenario id. */
  @JSName("id")
  var id_Scenario_ : String = js.native
  
  /** Scenario keyword. */
  @JSName("keyword")
  var keyword_Scenario_ : String = js.native
  
  /** Scenario name. */
  @JSName("name")
  var name_Scenario_ : String = js.native
  
  /** Scenario steps. */
  @JSName("steps")
  var steps_Scenario_ : js.Array[IStep] = js.native
  
  /** Scenario tags. */
  @JSName("tags")
  var tags_Scenario_ : js.Array[ITag] = js.native
  
  /**
    * Converts this Scenario to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
