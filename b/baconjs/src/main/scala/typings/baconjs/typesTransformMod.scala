package typings.baconjs

import typings.baconjs.typesDescribeMod.Desc
import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransformMod {
  
  @JSImport("baconjs/types/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeT[V, V2, V3](t1: Transformer[V, V2], t2: Transformer[V2, V3]): Transformer[V, V3] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeT")(t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any])).asInstanceOf[Transformer[V, V3]]
  
  inline def transformE[V, V2](src: EventStream[V], transformer: Transformer[V, V2]): EventStream[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformE")(src.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V2]]
  inline def transformE[V, V2](src: EventStream[V], transformer: Transformer[V, V2], desc: Desc): EventStream[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformE")(src.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[EventStream[V2]]
  
  inline def transformP[V, V2](src: Property[V], transformer: Transformer[V, V2]): Property[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformP")(src.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[Property[V2]]
  inline def transformP[V, V2](src: Property[V], transformer: Transformer[V, V2], desc: Desc): Property[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformP")(src.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Property[V2]]
  
  type Transformer[V1, V2] = js.Function2[/* event */ Event[V1], /* sink */ EventSink[V2], Reply]
}
