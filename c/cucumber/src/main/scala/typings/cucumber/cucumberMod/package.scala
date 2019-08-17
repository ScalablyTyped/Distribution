package typings.cucumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cucumberMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.cucumber.cucumberMod.eventsNs.Event

  type EventHook = js.Function2[/* event */ Event, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  type GlobalHookCode = js.Function1[/* callback */ js.UndefOr[CallbackStepDefinition], Unit]
  type HookCode = js.ThisFunction2[
    /* this */ World, 
    /* scenario */ HookScenarioResult, 
    /* callback */ js.UndefOr[CallbackStepDefinition], 
    Unit
  ]
  type StepDefinitionCode = js.ThisFunction1[/* this */ World, /* repeated */ js.Any, js.Any]
  type SupportCodeConsumer = js.Function1[/* stepDefinitions */ StepDefinitions with Hooks, Unit]
  type World = StringDictionary[js.Any]
}
