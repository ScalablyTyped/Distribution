package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extension {
  import typings.chrome.chrome.events.Event
  import typings.chrome.chrome.runtime.MessageSender

  type OnRequestEvent = Event[
    (js.Function3[
      /* request */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | (js.Function2[
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ])
  ]
}
