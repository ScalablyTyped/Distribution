package typings.baconjs

import typings.baconjs.optionalMod.Option
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Subscribe
import typings.baconjs.typesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamsubscribetopropertysubscribeMod {
  
  @JSImport("baconjs/types/internal/streamsubscribetopropertysubscribe", JSImport.Default)
  @js.native
  def default[V](initValue: Option[V], streamSubscribe: Subscribe[V]): js.Function1[/* sink */ EventSink[V], Unsub] = js.native
}
