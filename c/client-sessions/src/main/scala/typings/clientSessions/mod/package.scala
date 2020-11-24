package typings.clientSessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  
  type RequestHandler = js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ typings.clientSessions.mod.NextFunction, 
    js.Any
  ]
}
