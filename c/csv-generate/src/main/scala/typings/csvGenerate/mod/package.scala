package typings.csvGenerate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error], 
    /* records */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type MatcherFunc = js.Function1[/* value */ js.Any, scala.Boolean]
}
