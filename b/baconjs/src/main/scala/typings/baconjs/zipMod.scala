package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipMod {
  
  @JSImport("baconjs/types/zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zip[V, V2, Out](left: default[V], right: default[V2], f: js.Function2[/* left */ V, /* right */ V2, Out]): EventStream[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[EventStream[Out]]
  
  inline def zipAsArray[V](args: (default[V] | js.Array[default[V]])*): default[js.Array[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAsArray")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[default[js.Array[V]]]
  
  inline def zipWith[Out](f: js.Function1[/* repeated */ Any, Out], streams: default[Any]*): EventStream[Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(scala.List(f.asInstanceOf[js.Any]).`++`(streams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[EventStream[Out]]
}
