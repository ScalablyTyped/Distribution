package typings
package cucumberLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cucumberMod {
  type EventHook = js.Function2[
    /* event */ cucumberLib.cucumberMod.eventsNs.Event, 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type GlobalHookCode = js.Function1[/* callback */ js.UndefOr[CallbackStepDefinition], scala.Unit]
  type HookCode = js.ThisFunction2[
    /* this */ World, 
    /* scenario */ HookScenarioResult, 
    /* callback */ js.UndefOr[CallbackStepDefinition], 
    scala.Unit
  ]
  type StepDefinitionCode = js.ThisFunction1[/* this */ World, /* repeated */ js.Any, js.Any]
  type SupportCodeConsumer = js.Function1[/* stepDefinitions */ StepDefinitions with Hooks, scala.Unit]
}
