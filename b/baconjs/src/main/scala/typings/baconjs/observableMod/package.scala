package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object observableMod {
  
  type ObservableConstructor = js.Function2[
    /* description */ typings.baconjs.describeMod.Desc, 
    /* subscribe */ typings.baconjs.typesMod.Subscribe[js.Any], 
    typings.baconjs.observableMod.Observable[js.Any]
  ]
}
