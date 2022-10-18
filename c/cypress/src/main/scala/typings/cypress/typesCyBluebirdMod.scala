package typings.cypress

import org.scalablytyped.runtime.Instantiable1
import typings.cypress.anon.TypeofImportedBluebird
import typings.cypress.typesBluebirdMod.Resolvable
import typings.cypress.typesBluebirdMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCyBluebirdMod {
  
  type BluebirdStatic = TypeofImportedBluebird & (Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    ^[js.Object]
  ])
  
  type Promise[T] = ^[T]
}
