package typings.casperjs

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def create(): typings.casperjs.mod.Casper = typings.casperjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.casperjs.mod.Casper]
  @scala.inline
  def create(options: typings.casperjs.mod.CasperOptions): typings.casperjs.mod.Casper = typings.casperjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.casperjs.mod.Casper]
  
  @scala.inline
  def selectXPath(expression: java.lang.String): js.Object = typings.casperjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("selectXPath")(expression.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
