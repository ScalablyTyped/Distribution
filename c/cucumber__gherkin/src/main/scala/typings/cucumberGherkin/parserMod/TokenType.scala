package typings.cucumberGherkin.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("@cucumber/gherkin/dist/src/Parser", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
  
  @js.native
  sealed trait BackgroundLine
    extends StObject
       with TokenType
  /* 7 */ val BackgroundLine: typings.cucumberGherkin.parserMod.TokenType.BackgroundLine & Double = js.native
  
  @js.native
  sealed trait Comment
    extends StObject
       with TokenType
  /* 3 */ val Comment: typings.cucumberGherkin.parserMod.TokenType.Comment & Double = js.native
  
  @js.native
  sealed trait DocStringSeparator
    extends StObject
       with TokenType
  /* 11 */ val DocStringSeparator: typings.cucumberGherkin.parserMod.TokenType.DocStringSeparator & Double = js.native
  
  @js.native
  sealed trait EOF
    extends StObject
       with TokenType
  /* 1 */ val EOF: typings.cucumberGherkin.parserMod.TokenType.EOF & Double = js.native
  
  @js.native
  sealed trait Empty
    extends StObject
       with TokenType
  /* 2 */ val Empty: typings.cucumberGherkin.parserMod.TokenType.Empty & Double = js.native
  
  @js.native
  sealed trait ExamplesLine
    extends StObject
       with TokenType
  /* 9 */ val ExamplesLine: typings.cucumberGherkin.parserMod.TokenType.ExamplesLine & Double = js.native
  
  @js.native
  sealed trait FeatureLine
    extends StObject
       with TokenType
  /* 5 */ val FeatureLine: typings.cucumberGherkin.parserMod.TokenType.FeatureLine & Double = js.native
  
  @js.native
  sealed trait Language
    extends StObject
       with TokenType
  /* 13 */ val Language: typings.cucumberGherkin.parserMod.TokenType.Language & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TokenType
  /* 0 */ val None: typings.cucumberGherkin.parserMod.TokenType.None & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with TokenType
  /* 14 */ val Other: typings.cucumberGherkin.parserMod.TokenType.Other & Double = js.native
  
  @js.native
  sealed trait RuleLine
    extends StObject
       with TokenType
  /* 6 */ val RuleLine: typings.cucumberGherkin.parserMod.TokenType.RuleLine & Double = js.native
  
  @js.native
  sealed trait ScenarioLine
    extends StObject
       with TokenType
  /* 8 */ val ScenarioLine: typings.cucumberGherkin.parserMod.TokenType.ScenarioLine & Double = js.native
  
  @js.native
  sealed trait StepLine
    extends StObject
       with TokenType
  /* 10 */ val StepLine: typings.cucumberGherkin.parserMod.TokenType.StepLine & Double = js.native
  
  @js.native
  sealed trait TableRow
    extends StObject
       with TokenType
  /* 12 */ val TableRow: typings.cucumberGherkin.parserMod.TokenType.TableRow & Double = js.native
  
  @js.native
  sealed trait TagLine
    extends StObject
       with TokenType
  /* 4 */ val TagLine: typings.cucumberGherkin.parserMod.TokenType.TagLine & Double = js.native
}
