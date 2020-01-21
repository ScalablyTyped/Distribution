package typings.chrome.chrome.input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ime {
  type ActivateEvent = typings.chrome.chrome.events.Event[
    js.Function2[/* engineID */ java.lang.String, /* screen */ java.lang.String, scala.Unit]
  ]
  type BlurEvent = typings.chrome.chrome.events.Event[js.Function1[/* contextID */ scala.Double, scala.Unit]]
  type CandidateClickedEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* engineID */ java.lang.String, 
      /* candidateID */ scala.Double, 
      /* button */ java.lang.String, 
      scala.Unit
    ]
  ]
  type DeactivatedEvent = typings.chrome.chrome.events.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  type FocusEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* context */ typings.chrome.chrome.input.ime.InputContext, scala.Unit]
  ]
  type InputContextUpdateEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* context */ typings.chrome.chrome.input.ime.InputContext, scala.Unit]
  ]
  type InputResetEvent = typings.chrome.chrome.events.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  type KeyEventEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* engineID */ java.lang.String, 
      /* keyData */ typings.chrome.chrome.input.ime.KeyboardEvent, 
      scala.Unit
    ]
  ]
  type MenuItemActivatedEvent = typings.chrome.chrome.events.Event[
    js.Function2[/* engineID */ java.lang.String, /* name */ java.lang.String, scala.Unit]
  ]
  type SurroundingTextChangedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* engineID */ java.lang.String, 
      /* surroundingInfo */ typings.chrome.chrome.input.ime.SurroundingTextInfo, 
      scala.Unit
    ]
  ]
}
