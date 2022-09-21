package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  @JSImport("baconjs/types/callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCallback[V](f: js.Function, args: Any*): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(List(f.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[EventStream[V]]
  
  inline def fromNodeCallback[V](f: js.Function, args: Any*): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeCallback")(List(f.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[EventStream[V]]
}
