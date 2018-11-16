package typings
package chromeLib.chromeNs.inputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imeNs {
  type ActivateEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* engineID */ java.lang.String, /* screen */ java.lang.String, scala.Unit]
  ]
  type BlurEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* contextID */ scala.Double, scala.Unit]]
  type CandidateClickedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* engineID */ java.lang.String, 
      /* candidateID */ scala.Double, 
      /* button */ java.lang.String, 
      scala.Unit
    ]
  ]
  type DeactivatedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  type FocusEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* context */ InputContext, scala.Unit]]
  type InputContextUpdateEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* context */ InputContext, scala.Unit]]
  type InputResetEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  type KeyEventEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* engineID */ java.lang.String, /* keyData */ KeyboardEvent, scala.Unit]
  ]
  type MenuItemActivatedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[/* engineID */ java.lang.String, /* name */ java.lang.String, scala.Unit]
  ]
  type SurroundingTextChangedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* engineID */ java.lang.String, 
      /* surroundingInfo */ SurroundingTextInfo, 
      scala.Unit
    ]
  ]
}
