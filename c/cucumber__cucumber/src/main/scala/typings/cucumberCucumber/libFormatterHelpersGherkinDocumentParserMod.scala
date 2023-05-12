package typings.cucumberCucumber

import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Location
import typings.cucumberMessages.mod.Rule
import typings.cucumberMessages.mod.Scenario
import typings.cucumberMessages.mod.Step
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersGherkinDocumentParserMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/gherkin_document_parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGherkinExampleRuleMap(gherkinDocument: GherkinDocument): Record[String, Rule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinExampleRuleMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Rule]]
  
  inline def getGherkinScenarioLocationMap(gherkinDocument: GherkinDocument): Record[String, Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinScenarioLocationMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Location]]
  
  inline def getGherkinScenarioMap(gherkinDocument: GherkinDocument): Record[String, Scenario] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinScenarioMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Scenario]]
  
  inline def getGherkinStepMap(gherkinDocument: GherkinDocument): Record[String, Step] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGherkinStepMap")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[Record[String, Step]]
}
