package typings.chromeLauncher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object chromeLauncherMod {
  
  type RimrafModule = js.Function2[
    /* path */ java.lang.String, 
    /* callback */ js.Function1[/* error */ typings.std.Error, scala.Unit], 
    scala.Unit
  ]
}
