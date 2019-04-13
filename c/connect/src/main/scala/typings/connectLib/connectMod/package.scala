package typings
package connectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectMod {
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ NextFunction, 
    scala.Unit
  ]
  type HandleFunction = SimpleHandleFunction | NextHandleFunction | ErrorHandleFunction
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type NextHandleFunction = js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ NextFunction, 
    scala.Unit
  ]
  type ServerHandle = HandleFunction | nodeLib.httpMod.Server
  type SimpleHandleFunction = js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    scala.Unit
  ]
}
