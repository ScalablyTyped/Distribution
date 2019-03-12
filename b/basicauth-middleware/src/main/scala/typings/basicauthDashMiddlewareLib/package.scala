package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object basicauthDashMiddlewareLib {
  type CheckFunction = checkFunctionSync | checkFunctionPromise | checkFunctionCallback
  type checkFunctionCallback = js.Function3[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* callback */ js.Function2[/* err */ stdLib.Error | scala.Null, /* authorized */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type checkFunctionPromise = js.Function2[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    js.Thenable[scala.Boolean]
  ]
  type checkFunctionSync = js.Function2[/* username */ java.lang.String, /* password */ java.lang.String, scala.Boolean]
}
