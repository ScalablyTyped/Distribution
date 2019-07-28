package typings.chrome.chromeNs.inputNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imeNs {
  type ActivateEvent = Event[js.Function2[/* engineID */ String, /* screen */ String, Unit]]
  type BlurEvent = Event[js.Function1[/* contextID */ Double, Unit]]
  type CandidateClickedEvent = Event[
    js.Function3[/* engineID */ String, /* candidateID */ Double, /* button */ String, Unit]
  ]
  type DeactivatedEvent = Event[js.Function1[/* engineID */ String, Unit]]
  type FocusEvent = Event[js.Function1[/* context */ InputContext, Unit]]
  type InputContextUpdateEvent = Event[js.Function1[/* context */ InputContext, Unit]]
  type InputResetEvent = Event[js.Function1[/* engineID */ String, Unit]]
  type KeyEventEvent = Event[js.Function2[/* engineID */ String, /* keyData */ KeyboardEvent, Unit]]
  type MenuItemActivatedEvent = Event[js.Function2[/* engineID */ String, /* name */ String, Unit]]
  type SurroundingTextChangedEvent = Event[
    js.Function2[/* engineID */ String, /* surroundingInfo */ SurroundingTextInfo, Unit]
  ]
}
