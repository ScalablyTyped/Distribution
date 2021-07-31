package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("baconjs/types/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: V2): typings.baconjs.observableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[V2]]
  @scala.inline
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: js.Function1[/* value */ V, V2]): typings.baconjs.observableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[V2]]
  @scala.inline
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: Property[V2]): typings.baconjs.observableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[V2]]
  
  @scala.inline
  def map[V, V2](src: default[V], f: V2): default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V2]]
  @scala.inline
  def map[V, V2](src: default[V], f: js.Function1[/* value */ V, V2]): default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V2]]
  @scala.inline
  def map[V, V2](src: default[V], f: Property[V2]): default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V2]]
  
  @scala.inline
  def mapT[V, V2](f: V2): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply]]
  @scala.inline
  def mapT[V, V2](f: js.Function1[/* value */ V, V2]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply]]
}
