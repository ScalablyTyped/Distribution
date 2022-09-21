package typings.cucumberGherkin.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleType extends StObject
@JSImport("@cucumber/gherkin/dist/src/Parser", "RuleType")
@js.native
object RuleType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType & Double] = js.native
  
  @js.native
  sealed trait Background
    extends StObject
       with RuleType
  /* 20 */ val Background: typings.cucumberGherkin.parserMod.RuleType.Background & Double = js.native
  
  @js.native
  sealed trait DataTable
    extends StObject
       with RuleType
  /* 28 */ val DataTable: typings.cucumberGherkin.parserMod.RuleType.DataTable & Double = js.native
  
  @js.native
  sealed trait Description
    extends StObject
       with RuleType
  /* 32 */ val Description: typings.cucumberGherkin.parserMod.RuleType.Description & Double = js.native
  
  @js.native
  sealed trait DescriptionHelper
    extends StObject
       with RuleType
  /* 31 */ val DescriptionHelper: typings.cucumberGherkin.parserMod.RuleType.DescriptionHelper & Double = js.native
  
  @js.native
  sealed trait DocString
    extends StObject
       with RuleType
  /* 29 */ val DocString: typings.cucumberGherkin.parserMod.RuleType.DocString & Double = js.native
  
  @js.native
  sealed trait Examples
    extends StObject
       with RuleType
  /* 24 */ val Examples: typings.cucumberGherkin.parserMod.RuleType.Examples & Double = js.native
  
  @js.native
  sealed trait ExamplesDefinition
    extends StObject
       with RuleType
  /* 23 */ val ExamplesDefinition: typings.cucumberGherkin.parserMod.RuleType.ExamplesDefinition & Double = js.native
  
  @js.native
  sealed trait ExamplesTable
    extends StObject
       with RuleType
  /* 25 */ val ExamplesTable: typings.cucumberGherkin.parserMod.RuleType.ExamplesTable & Double = js.native
  
  @js.native
  sealed trait Feature
    extends StObject
       with RuleType
  /* 16 */ val Feature: typings.cucumberGherkin.parserMod.RuleType.Feature & Double = js.native
  
  @js.native
  sealed trait FeatureHeader
    extends StObject
       with RuleType
  /* 17 */ val FeatureHeader: typings.cucumberGherkin.parserMod.RuleType.FeatureHeader & Double = js.native
  
  @js.native
  sealed trait GherkinDocument
    extends StObject
       with RuleType
  /* 15 */ val GherkinDocument: typings.cucumberGherkin.parserMod.RuleType.GherkinDocument & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with RuleType
  /* 0 */ val None: typings.cucumberGherkin.parserMod.RuleType.None & Double = js.native
  
  @js.native
  sealed trait Rule
    extends StObject
       with RuleType
  /* 18 */ val Rule: typings.cucumberGherkin.parserMod.RuleType.Rule & Double = js.native
  
  @js.native
  sealed trait RuleHeader
    extends StObject
       with RuleType
  /* 19 */ val RuleHeader: typings.cucumberGherkin.parserMod.RuleType.RuleHeader & Double = js.native
  
  @js.native
  sealed trait Scenario
    extends StObject
       with RuleType
  /* 22 */ val Scenario: typings.cucumberGherkin.parserMod.RuleType.Scenario & Double = js.native
  
  @js.native
  sealed trait ScenarioDefinition
    extends StObject
       with RuleType
  /* 21 */ val ScenarioDefinition: typings.cucumberGherkin.parserMod.RuleType.ScenarioDefinition & Double = js.native
  
  @js.native
  sealed trait Step
    extends StObject
       with RuleType
  /* 26 */ val Step: typings.cucumberGherkin.parserMod.RuleType.Step & Double = js.native
  
  @js.native
  sealed trait StepArg
    extends StObject
       with RuleType
  /* 27 */ val StepArg: typings.cucumberGherkin.parserMod.RuleType.StepArg & Double = js.native
  
  @js.native
  sealed trait Tags
    extends StObject
       with RuleType
  /* 30 */ val Tags: typings.cucumberGherkin.parserMod.RuleType.Tags & Double = js.native
  
  @js.native
  sealed trait _BackgroundLine
    extends StObject
       with RuleType
  /* 7 */ val _BackgroundLine: typings.cucumberGherkin.parserMod.RuleType._BackgroundLine & Double = js.native
  
  @js.native
  sealed trait _Comment
    extends StObject
       with RuleType
  /* 3 */ val _Comment: typings.cucumberGherkin.parserMod.RuleType._Comment & Double = js.native
  
  @js.native
  sealed trait _DocStringSeparator
    extends StObject
       with RuleType
  /* 11 */ val _DocStringSeparator: typings.cucumberGherkin.parserMod.RuleType._DocStringSeparator & Double = js.native
  
  @js.native
  sealed trait _EOF
    extends StObject
       with RuleType
  /* 1 */ val _EOF: typings.cucumberGherkin.parserMod.RuleType._EOF & Double = js.native
  
  @js.native
  sealed trait _Empty
    extends StObject
       with RuleType
  /* 2 */ val _Empty: typings.cucumberGherkin.parserMod.RuleType._Empty & Double = js.native
  
  @js.native
  sealed trait _ExamplesLine
    extends StObject
       with RuleType
  /* 9 */ val _ExamplesLine: typings.cucumberGherkin.parserMod.RuleType._ExamplesLine & Double = js.native
  
  @js.native
  sealed trait _FeatureLine
    extends StObject
       with RuleType
  /* 5 */ val _FeatureLine: typings.cucumberGherkin.parserMod.RuleType._FeatureLine & Double = js.native
  
  @js.native
  sealed trait _Language
    extends StObject
       with RuleType
  /* 13 */ val _Language: typings.cucumberGherkin.parserMod.RuleType._Language & Double = js.native
  
  @js.native
  sealed trait _Other
    extends StObject
       with RuleType
  /* 14 */ val _Other: typings.cucumberGherkin.parserMod.RuleType._Other & Double = js.native
  
  @js.native
  sealed trait _RuleLine
    extends StObject
       with RuleType
  /* 6 */ val _RuleLine: typings.cucumberGherkin.parserMod.RuleType._RuleLine & Double = js.native
  
  @js.native
  sealed trait _ScenarioLine
    extends StObject
       with RuleType
  /* 8 */ val _ScenarioLine: typings.cucumberGherkin.parserMod.RuleType._ScenarioLine & Double = js.native
  
  @js.native
  sealed trait _StepLine
    extends StObject
       with RuleType
  /* 10 */ val _StepLine: typings.cucumberGherkin.parserMod.RuleType._StepLine & Double = js.native
  
  @js.native
  sealed trait _TableRow
    extends StObject
       with RuleType
  /* 12 */ val _TableRow: typings.cucumberGherkin.parserMod.RuleType._TableRow & Double = js.native
  
  @js.native
  sealed trait _TagLine
    extends StObject
       with RuleType
  /* 4 */ val _TagLine: typings.cucumberGherkin.parserMod.RuleType._TagLine & Double = js.native
}
