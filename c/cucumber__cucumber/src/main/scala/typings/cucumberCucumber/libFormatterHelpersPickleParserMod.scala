package typings.cucumberCucumber

import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Location
import typings.cucumberMessages.mod.Pickle
import typings.cucumberMessages.mod.PickleStep
import typings.cucumberMessages.mod.Scenario
import typings.cucumberMessages.mod.Step
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersPickleParserMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/pickle_parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPickleLocation(param0: IGetPickleLocationRequest): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("getPickleLocation")(param0.asInstanceOf[js.Any]).asInstanceOf[Location]
  
  inline def getPickleStepMap(pickle: Pickle): Record[String, PickleStep] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPickleStepMap")(pickle.asInstanceOf[js.Any]).asInstanceOf[Record[String, PickleStep]]
  
  inline def getScenarioDescription(param0: IGetScenarioDescriptionRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScenarioDescription")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStepKeyword(param0: IGetStepKeywordRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepKeyword")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IGetPickleLocationRequest extends StObject {
    
    var gherkinDocument: GherkinDocument
    
    var pickle: Pickle
  }
  object IGetPickleLocationRequest {
    
    inline def apply(gherkinDocument: GherkinDocument, pickle: Pickle): IGetPickleLocationRequest = {
      val __obj = js.Dynamic.literal(gherkinDocument = gherkinDocument.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetPickleLocationRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetPickleLocationRequest] (val x: Self) extends AnyVal {
      
      inline def setGherkinDocument(value: GherkinDocument): Self = StObject.set(x, "gherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGetScenarioDescriptionRequest extends StObject {
    
    var gherkinScenarioMap: Record[String, Scenario]
    
    var pickle: Pickle
  }
  object IGetScenarioDescriptionRequest {
    
    inline def apply(gherkinScenarioMap: Record[String, Scenario], pickle: Pickle): IGetScenarioDescriptionRequest = {
      val __obj = js.Dynamic.literal(gherkinScenarioMap = gherkinScenarioMap.asInstanceOf[js.Any], pickle = pickle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetScenarioDescriptionRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetScenarioDescriptionRequest] (val x: Self) extends AnyVal {
      
      inline def setGherkinScenarioMap(value: Record[String, Scenario]): Self = StObject.set(x, "gherkinScenarioMap", value.asInstanceOf[js.Any])
      
      inline def setPickle(value: Pickle): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGetStepKeywordRequest extends StObject {
    
    var gherkinStepMap: Record[String, Step]
    
    var pickleStep: PickleStep
  }
  object IGetStepKeywordRequest {
    
    inline def apply(gherkinStepMap: Record[String, Step], pickleStep: PickleStep): IGetStepKeywordRequest = {
      val __obj = js.Dynamic.literal(gherkinStepMap = gherkinStepMap.asInstanceOf[js.Any], pickleStep = pickleStep.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetStepKeywordRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetStepKeywordRequest] (val x: Self) extends AnyVal {
      
      inline def setGherkinStepMap(value: Record[String, Step]): Self = StObject.set(x, "gherkinStepMap", value.asInstanceOf[js.Any])
      
      inline def setPickleStep(value: PickleStep): Self = StObject.set(x, "pickleStep", value.asInstanceOf[js.Any])
    }
  }
}
