package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object identity {
  
  type SignInChangeEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* account */ typings.chrome.chrome.identity.AccountInfo, 
      /* signedIn */ scala.Boolean, 
      scala.Unit
    ]
  ]
}
