package typings.centra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CentraFactory = js.Function2[
    /* url */ typings.std.URL | java.lang.String, 
    /* method */ js.UndefOr[java.lang.String], 
    typings.centra.mod.Request
  ]
}
