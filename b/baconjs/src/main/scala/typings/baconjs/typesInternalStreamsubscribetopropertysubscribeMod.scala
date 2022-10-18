package typings.baconjs

import typings.baconjs.typesOptionalMod.Option
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Subscribe
import typings.baconjs.typesTypesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalStreamsubscribetopropertysubscribeMod {
  
  @JSImport("baconjs/types/internal/streamsubscribetopropertysubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](initValue: Option[V], streamSubscribe: Subscribe[V]): js.Function1[/* sink */ EventSink[V], Unsub] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initValue.asInstanceOf[js.Any], streamSubscribe.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* sink */ EventSink[V], Unsub]]
}
