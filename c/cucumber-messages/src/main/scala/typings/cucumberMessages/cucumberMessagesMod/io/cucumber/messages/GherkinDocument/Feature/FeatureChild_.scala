package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesStrings.background
import typings.cucumberMessages.cucumberMessagesStrings.rule
import typings.cucumberMessages.cucumberMessagesStrings.scenario
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A child node of a `Feature` node */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild")
@js.native
/**
  * Constructs a new FeatureChild.
  * @param [properties] Properties to set
  */
class FeatureChild_ () extends IFeatureChild {
  def this(properties: IFeatureChild) = this()
  
  /**
    * Converts this FeatureChild to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** FeatureChild value. */
  var value: js.UndefOr[rule | background | scenario] = js.native
}
