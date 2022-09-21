package typings.casperjs.mod

import typings.casperjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def create(): Casper = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Casper]
inline def create(options: CasperOptions): Casper = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Casper]

inline def selectXPath(expression: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("selectXPath")(expression.asInstanceOf[js.Any]).asInstanceOf[js.Object]

type FunctionOnTimeout = js.ThisFunction2[/* this */ Casper, /* timeout */ Double, /* details */ Any, Unit]

type FunctionThen = js.ThisFunction1[/* this */ Casper, /* response */ HttpResponse, Unit]
