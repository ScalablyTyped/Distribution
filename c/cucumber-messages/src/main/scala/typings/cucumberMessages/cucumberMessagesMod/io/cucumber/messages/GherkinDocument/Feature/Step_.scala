package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesStrings.dataTable
import typings.cucumberMessages.cucumberMessagesStrings.docString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Step. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step")
@js.native
/**
  * Constructs a new Step.
  * @param [properties] Properties to set
  */
class Step_ () extends IStep {
  def this(properties: IStep) = this()
  
  /** Step argument. */
  var argument: js.UndefOr[docString | dataTable] = js.native
  
  /** Step id. */
  @JSName("id")
  var id_Step_ : String = js.native
  
  /** Step keyword. */
  @JSName("keyword")
  var keyword_Step_ : String = js.native
  
  /** Step text. */
  @JSName("text")
  var text_Step_ : String = js.native
  
  /**
    * Converts this Step to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
