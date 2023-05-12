package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterHelpersEventDataCollectorMod.default
import typings.cucumberMessages.mod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersUsageHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/usage_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUsage(param0: IGetUsageRequest): js.Array[IUsage] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsage")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[IUsage]]
  
  trait IGetUsageRequest extends StObject {
    
    var eventDataCollector: default
    
    var stepDefinitions: js.Array[typings.cucumberCucumber.libModelsStepDefinitionMod.default]
  }
  object IGetUsageRequest {
    
    inline def apply(
      eventDataCollector: default,
      stepDefinitions: js.Array[typings.cucumberCucumber.libModelsStepDefinitionMod.default]
    ): IGetUsageRequest = {
      val __obj = js.Dynamic.literal(eventDataCollector = eventDataCollector.asInstanceOf[js.Any], stepDefinitions = stepDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetUsageRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetUsageRequest] (val x: Self) extends AnyVal {
      
      inline def setEventDataCollector(value: default): Self = StObject.set(x, "eventDataCollector", value.asInstanceOf[js.Any])
      
      inline def setStepDefinitions(value: js.Array[typings.cucumberCucumber.libModelsStepDefinitionMod.default]): Self = StObject.set(x, "stepDefinitions", value.asInstanceOf[js.Any])
      
      inline def setStepDefinitionsVarargs(value: typings.cucumberCucumber.libModelsStepDefinitionMod.default*): Self = StObject.set(x, "stepDefinitions", js.Array(value*))
    }
  }
  
  trait IUsage extends StObject {
    
    var code: String
    
    var line: Double
    
    var matches: js.Array[IUsageMatch]
    
    var meanDuration: js.UndefOr[Duration] = js.undefined
    
    var pattern: String
    
    var patternType: String
    
    var uri: String
  }
  object IUsage {
    
    inline def apply(
      code: String,
      line: Double,
      matches: js.Array[IUsageMatch],
      pattern: String,
      patternType: String,
      uri: String
    ): IUsage = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternType = patternType.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUsage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUsage] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: js.Array[IUsageMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: IUsageMatch*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setMeanDuration(value: Duration): Self = StObject.set(x, "meanDuration", value.asInstanceOf[js.Any])
      
      inline def setMeanDurationUndefined: Self = StObject.set(x, "meanDuration", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternType(value: String): Self = StObject.set(x, "patternType", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUsageMatch extends StObject {
    
    var duration: js.UndefOr[Duration] = js.undefined
    
    var line: Double
    
    var text: String
    
    var uri: String
  }
  object IUsageMatch {
    
    inline def apply(line: Double, text: String, uri: String): IUsageMatch = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUsageMatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUsageMatch] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
