package typings.cucumberGherkinUtils

import typings.cucumberMessages.mod.Background
import typings.cucumberMessages.mod.Feature
import typings.cucumberMessages.mod.GherkinDocument
import typings.cucumberMessages.mod.Rule
import typings.cucumberMessages.mod.Scenario
import typings.cucumberMessages.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGherkinDocumentWalkerMod {
  
  @JSImport("@cucumber/gherkin-utils/dist/src/GherkinDocumentWalker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GherkinDocumentWalker {
    def this(filters: IFilters) = this()
    def this(filters: Unit, handlers: IHandlers) = this()
    def this(filters: IFilters, handlers: IHandlers) = this()
    
    /* private */ /* CompleteClass */
    var copyBackground: Any = js.native
    
    /* private */ /* CompleteClass */
    var copyFeature: Any = js.native
    
    /* private */ /* CompleteClass */
    var copyRule: Any = js.native
    
    /* private */ /* CompleteClass */
    var copyScenario: Any = js.native
    
    /* private */ /* CompleteClass */
    var copyStep: Any = js.native
    
    /* private */ /* CompleteClass */
    var copyTags: Any = js.native
    
    /* private */ /* CompleteClass */
    var filterFeatureChildren: Any = js.native
    
    /* private */ /* CompleteClass */
    var filterRuleChildren: Any = js.native
    
    /* private */ /* CompleteClass */
    override val filters: Any = js.native
    
    /* private */ /* CompleteClass */
    override val handlers: Any = js.native
    
    /* protected */ /* CompleteClass */
    override def walkAllSteps(steps: js.Array[Step]): js.Array[Step] = js.native
    
    /* protected */ /* CompleteClass */
    override def walkBackground(background: Background): Background = js.native
    
    /* protected */ /* CompleteClass */
    override def walkFeature(feature: Feature): Feature = js.native
    
    /* private */ /* CompleteClass */
    var walkFeatureChildren: Any = js.native
    
    /* CompleteClass */
    override def walkGherkinDocument(gherkinDocument: GherkinDocument): GherkinDocument | Null = js.native
    
    /* protected */ /* CompleteClass */
    override def walkRule(rule: Rule): Rule = js.native
    
    /* private */ /* CompleteClass */
    var walkRuleChildren: Any = js.native
    
    /* protected */ /* CompleteClass */
    override def walkScenario(scenario: Scenario): Scenario = js.native
    
    /* protected */ /* CompleteClass */
    override def walkStep(step: Step): Step = js.native
  }
  
  @JSImport("@cucumber/gherkin-utils/dist/src/GherkinDocumentWalker", "rejectAllFilters")
  @js.native
  val rejectAllFilters: IFilters = js.native
  
  trait GherkinDocumentWalker extends StObject {
    
    /* private */ var copyBackground: Any
    
    /* private */ var copyFeature: Any
    
    /* private */ var copyRule: Any
    
    /* private */ var copyScenario: Any
    
    /* private */ var copyStep: Any
    
    /* private */ var copyTags: Any
    
    /* private */ var filterFeatureChildren: Any
    
    /* private */ var filterRuleChildren: Any
    
    /* private */ val filters: Any
    
    /* private */ val handlers: Any
    
    /* protected */ def walkAllSteps(steps: js.Array[Step]): js.Array[Step]
    
    /* protected */ def walkBackground(background: Background): Background
    
    /* protected */ def walkFeature(feature: Feature): Feature
    
    /* private */ var walkFeatureChildren: Any
    
    def walkGherkinDocument(gherkinDocument: GherkinDocument): GherkinDocument | Null
    
    /* protected */ def walkRule(rule: Rule): Rule
    
    /* private */ var walkRuleChildren: Any
    
    /* protected */ def walkScenario(scenario: Scenario): Scenario
    
    /* protected */ def walkStep(step: Step): Step
  }
  object GherkinDocumentWalker {
    
    inline def apply(
      copyBackground: Any,
      copyFeature: Any,
      copyRule: Any,
      copyScenario: Any,
      copyStep: Any,
      copyTags: Any,
      filterFeatureChildren: Any,
      filterRuleChildren: Any,
      filters: Any,
      handlers: Any,
      walkAllSteps: js.Array[Step] => js.Array[Step],
      walkBackground: Background => Background,
      walkFeature: Feature => Feature,
      walkFeatureChildren: Any,
      walkGherkinDocument: GherkinDocument => GherkinDocument | Null,
      walkRule: Rule => Rule,
      walkRuleChildren: Any,
      walkScenario: Scenario => Scenario,
      walkStep: Step => Step
    ): GherkinDocumentWalker = {
      val __obj = js.Dynamic.literal(copyBackground = copyBackground.asInstanceOf[js.Any], copyFeature = copyFeature.asInstanceOf[js.Any], copyRule = copyRule.asInstanceOf[js.Any], copyScenario = copyScenario.asInstanceOf[js.Any], copyStep = copyStep.asInstanceOf[js.Any], copyTags = copyTags.asInstanceOf[js.Any], filterFeatureChildren = filterFeatureChildren.asInstanceOf[js.Any], filterRuleChildren = filterRuleChildren.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], walkAllSteps = js.Any.fromFunction1(walkAllSteps), walkBackground = js.Any.fromFunction1(walkBackground), walkFeature = js.Any.fromFunction1(walkFeature), walkFeatureChildren = walkFeatureChildren.asInstanceOf[js.Any], walkGherkinDocument = js.Any.fromFunction1(walkGherkinDocument), walkRule = js.Any.fromFunction1(walkRule), walkRuleChildren = walkRuleChildren.asInstanceOf[js.Any], walkScenario = js.Any.fromFunction1(walkScenario), walkStep = js.Any.fromFunction1(walkStep))
      __obj.asInstanceOf[GherkinDocumentWalker]
    }
    
    extension [Self <: GherkinDocumentWalker](x: Self) {
      
      inline def setCopyBackground(value: Any): Self = StObject.set(x, "copyBackground", value.asInstanceOf[js.Any])
      
      inline def setCopyFeature(value: Any): Self = StObject.set(x, "copyFeature", value.asInstanceOf[js.Any])
      
      inline def setCopyRule(value: Any): Self = StObject.set(x, "copyRule", value.asInstanceOf[js.Any])
      
      inline def setCopyScenario(value: Any): Self = StObject.set(x, "copyScenario", value.asInstanceOf[js.Any])
      
      inline def setCopyStep(value: Any): Self = StObject.set(x, "copyStep", value.asInstanceOf[js.Any])
      
      inline def setCopyTags(value: Any): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
      
      inline def setFilterFeatureChildren(value: Any): Self = StObject.set(x, "filterFeatureChildren", value.asInstanceOf[js.Any])
      
      inline def setFilterRuleChildren(value: Any): Self = StObject.set(x, "filterRuleChildren", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setHandlers(value: Any): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setWalkAllSteps(value: js.Array[Step] => js.Array[Step]): Self = StObject.set(x, "walkAllSteps", js.Any.fromFunction1(value))
      
      inline def setWalkBackground(value: Background => Background): Self = StObject.set(x, "walkBackground", js.Any.fromFunction1(value))
      
      inline def setWalkFeature(value: Feature => Feature): Self = StObject.set(x, "walkFeature", js.Any.fromFunction1(value))
      
      inline def setWalkFeatureChildren(value: Any): Self = StObject.set(x, "walkFeatureChildren", value.asInstanceOf[js.Any])
      
      inline def setWalkGherkinDocument(value: GherkinDocument => GherkinDocument | Null): Self = StObject.set(x, "walkGherkinDocument", js.Any.fromFunction1(value))
      
      inline def setWalkRule(value: Rule => Rule): Self = StObject.set(x, "walkRule", js.Any.fromFunction1(value))
      
      inline def setWalkRuleChildren(value: Any): Self = StObject.set(x, "walkRuleChildren", value.asInstanceOf[js.Any])
      
      inline def setWalkScenario(value: Scenario => Scenario): Self = StObject.set(x, "walkScenario", js.Any.fromFunction1(value))
      
      inline def setWalkStep(value: Step => Step): Self = StObject.set(x, "walkStep", js.Any.fromFunction1(value))
    }
  }
  
  trait IFilters extends StObject {
    
    var acceptBackground: js.UndefOr[js.Function1[/* background */ Background, Boolean]] = js.undefined
    
    var acceptFeature: js.UndefOr[js.Function1[/* feature */ Feature, Boolean]] = js.undefined
    
    var acceptRule: js.UndefOr[js.Function1[/* rule */ Rule, Boolean]] = js.undefined
    
    var acceptScenario: js.UndefOr[js.Function1[/* scenario */ Scenario, Boolean]] = js.undefined
    
    var acceptStep: js.UndefOr[js.Function1[/* step */ Step, Boolean]] = js.undefined
  }
  object IFilters {
    
    inline def apply(): IFilters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilters]
    }
    
    extension [Self <: IFilters](x: Self) {
      
      inline def setAcceptBackground(value: /* background */ Background => Boolean): Self = StObject.set(x, "acceptBackground", js.Any.fromFunction1(value))
      
      inline def setAcceptBackgroundUndefined: Self = StObject.set(x, "acceptBackground", js.undefined)
      
      inline def setAcceptFeature(value: /* feature */ Feature => Boolean): Self = StObject.set(x, "acceptFeature", js.Any.fromFunction1(value))
      
      inline def setAcceptFeatureUndefined: Self = StObject.set(x, "acceptFeature", js.undefined)
      
      inline def setAcceptRule(value: /* rule */ Rule => Boolean): Self = StObject.set(x, "acceptRule", js.Any.fromFunction1(value))
      
      inline def setAcceptRuleUndefined: Self = StObject.set(x, "acceptRule", js.undefined)
      
      inline def setAcceptScenario(value: /* scenario */ Scenario => Boolean): Self = StObject.set(x, "acceptScenario", js.Any.fromFunction1(value))
      
      inline def setAcceptScenarioUndefined: Self = StObject.set(x, "acceptScenario", js.undefined)
      
      inline def setAcceptStep(value: /* step */ Step => Boolean): Self = StObject.set(x, "acceptStep", js.Any.fromFunction1(value))
      
      inline def setAcceptStepUndefined: Self = StObject.set(x, "acceptStep", js.undefined)
    }
  }
  
  trait IHandlers extends StObject {
    
    var handleBackground: js.UndefOr[js.Function1[/* background */ Background, Unit]] = js.undefined
    
    var handleFeature: js.UndefOr[js.Function1[/* feature */ Feature, Unit]] = js.undefined
    
    var handleRule: js.UndefOr[js.Function1[/* rule */ Rule, Unit]] = js.undefined
    
    var handleScenario: js.UndefOr[js.Function1[/* scenario */ Scenario, Unit]] = js.undefined
    
    var handleStep: js.UndefOr[js.Function1[/* step */ Step, Unit]] = js.undefined
  }
  object IHandlers {
    
    inline def apply(): IHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHandlers]
    }
    
    extension [Self <: IHandlers](x: Self) {
      
      inline def setHandleBackground(value: /* background */ Background => Unit): Self = StObject.set(x, "handleBackground", js.Any.fromFunction1(value))
      
      inline def setHandleBackgroundUndefined: Self = StObject.set(x, "handleBackground", js.undefined)
      
      inline def setHandleFeature(value: /* feature */ Feature => Unit): Self = StObject.set(x, "handleFeature", js.Any.fromFunction1(value))
      
      inline def setHandleFeatureUndefined: Self = StObject.set(x, "handleFeature", js.undefined)
      
      inline def setHandleRule(value: /* rule */ Rule => Unit): Self = StObject.set(x, "handleRule", js.Any.fromFunction1(value))
      
      inline def setHandleRuleUndefined: Self = StObject.set(x, "handleRule", js.undefined)
      
      inline def setHandleScenario(value: /* scenario */ Scenario => Unit): Self = StObject.set(x, "handleScenario", js.Any.fromFunction1(value))
      
      inline def setHandleScenarioUndefined: Self = StObject.set(x, "handleScenario", js.undefined)
      
      inline def setHandleStep(value: /* step */ Step => Unit): Self = StObject.set(x, "handleStep", js.Any.fromFunction1(value))
      
      inline def setHandleStepUndefined: Self = StObject.set(x, "handleStep", js.undefined)
    }
  }
}
