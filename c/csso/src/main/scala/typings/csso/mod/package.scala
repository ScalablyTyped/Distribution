package typings.csso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AfterCompressFn = js.Function2[
    /* compressResult */ java.lang.String, 
    /* options */ typings.csso.mod.CompressOptions, 
    scala.Unit
  ]
  
  type BeforeCompressFn = js.Function2[/* ast */ js.Object, /* options */ typings.csso.mod.CompressOptions, scala.Unit]
}
