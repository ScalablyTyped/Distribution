package typings.baconjs

import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topromiseMod {
  
  @JSImport("baconjs/types/topromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def firstToPromise[V](src: default[V]): js.Promise[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstToPromise")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[V]]
  inline def firstToPromise[V](src: default[V], PromiseCtr: js.Function): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("firstToPromise")(src.asInstanceOf[js.Any], PromiseCtr.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
  
  inline def toPromise[V](src: default[V]): js.Promise[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[V]]
  inline def toPromise[V](src: default[V], PromiseCtr: js.Function): js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPromise")(src.asInstanceOf[js.Any], PromiseCtr.asInstanceOf[js.Any])).asInstanceOf[js.Promise[V]]
}
