package typings.bugsnag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ErrorHandler = js.Function4[
    /* err */ typings.std.Error | js.Any, 
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ typings.bugsnag.mod.NextFunction, 
    scala.Unit
  ]
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  
  type RequestHandler = js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ typings.bugsnag.mod.NextFunction, 
    js.Any
  ]
}
