package typings.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorHandleFunction = js.Function4[
    /* err */ js.Any, 
    /* req */ typings.connect.mod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* next */ typings.connect.mod.NextFunction, 
    scala.Unit
  ]
  type HandleFunction = typings.connect.mod.SimpleHandleFunction | typings.connect.mod.NextHandleFunction | typings.connect.mod.ErrorHandleFunction
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type NextHandleFunction = js.Function3[
    /* req */ typings.connect.mod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* next */ typings.connect.mod.NextFunction, 
    scala.Unit
  ]
  type ServerHandle = typings.connect.mod.HandleFunction | typings.node.httpMod.Server
  type SimpleHandleFunction = js.Function2[
    /* req */ typings.connect.mod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    scala.Unit
  ]
}
