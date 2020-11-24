package typings.casperjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FunctionOnTimeout = js.ThisFunction2[
    /* this */ typings.casperjs.mod.Casper, 
    /* timeout */ scala.Double, 
    /* details */ js.Any, 
    scala.Unit
  ]
  
  type FunctionThen = js.ThisFunction1[
    /* this */ typings.casperjs.mod.Casper, 
    /* response */ typings.casperjs.mod.HttpResponse, 
    scala.Unit
  ]
}
