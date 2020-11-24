package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IFeatureChild
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The top level node in the AST */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature")
@js.native
/**
  * Constructs a new Feature.
  * @param [properties] Properties to set
  */
class Feature_ () extends IFeature {
  def this(properties: IFeature) = this()
  
  /** Feature children. */
  @JSName("children")
  var children_Feature_ : js.Array[IFeatureChild] = js.native
  
  /** Feature description. */
  @JSName("description")
  var description_Feature_ : String = js.native
  
  /** Feature keyword. */
  @JSName("keyword")
  var keyword_Feature_ : String = js.native
  
  /** Feature language. */
  @JSName("language")
  var language_Feature_ : String = js.native
  
  /** Feature name. */
  @JSName("name")
  var name_Feature_ : String = js.native
  
  /** Feature tags. */
  @JSName("tags")
  var tags_Feature_ : js.Array[ITag] = js.native
  
  /**
    * Converts this Feature to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
