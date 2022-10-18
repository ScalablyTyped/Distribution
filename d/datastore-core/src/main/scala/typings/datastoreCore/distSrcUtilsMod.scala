package typings.datastoreCore

import typings.datastoreCore.datastoreCoreInts.`-1`
import typings.datastoreCore.datastoreCoreInts.`0`
import typings.datastoreCore.datastoreCoreInts.`1`
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("datastore-core/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replaceStartWith(s: String, r: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStartWith")(s.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sortAll[T](iterable: js.Iterable[T], sorter: js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortAll")(iterable.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def sortAll[T](iterable: AsyncIterable[T], sorter: js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortAll")(iterable.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
}
