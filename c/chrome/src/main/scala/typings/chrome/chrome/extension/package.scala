package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object extension {
  
  type OnRequestEvent = typings.chrome.chrome.events.Event[
    (js.Function3[
      /* request */ js.Any, 
      /* sender */ typings.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]) | (js.Function2[
      /* sender */ typings.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ])
  ]
}
