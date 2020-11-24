package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object compositeunsubscribeMod {
  
  type Subscription = js.Function2[
    /* unsubAll */ typings.baconjs.typesMod.Unsub, 
    /* unsubMe */ typings.baconjs.typesMod.Unsub, 
    typings.baconjs.typesMod.Unsub
  ]
}
