package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFlatmapMod {
  
  @JSImport("baconjs/types/flatmap_", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[In, Out](spawner: EventSpawner[In, Out], src: typings.baconjs.observableMod.default[In]): typings.baconjs.observableMod.default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(spawner.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[Out]]
  @scala.inline
  def default[In, Out](
    spawner: EventSpawner[In, Out],
    src: typings.baconjs.observableMod.default[In],
    params: FlatMapParams
  ): typings.baconjs.observableMod.default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(spawner.asInstanceOf[js.Any], src.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[Out]]
  
  @scala.inline
  def flatMap[In, Out](spawner: EventSpawner[In, Out], src: default[In]): default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap_")(spawner.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[default[Out]]
  @scala.inline
  def flatMap[In, Out](spawner: EventSpawner[In, Out], src: default[In], params: FlatMapParams): default[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap_")(spawner.asInstanceOf[js.Any], src.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[default[Out]]
  
  @scala.inline
  def handleEventValueWith[In, Out](f: SpawnerOrObservable[In, Out]): EventSpawner[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEventValueWith")(f.asInstanceOf[js.Any]).asInstanceOf[EventSpawner[In, Out]]
  
  @scala.inline
  def makeObservable[V](x: V): default[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(x.asInstanceOf[js.Any]).asInstanceOf[default[V]]
  @scala.inline
  def makeObservable[V](x: Event[V]): default[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(x.asInstanceOf[js.Any]).asInstanceOf[default[V]]
  @scala.inline
  def makeObservable[V](x: default[V]): default[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(x.asInstanceOf[js.Any]).asInstanceOf[default[V]]
  
  type EventOrValue[V] = Event[V] | V
  
  type EventSpawner[V, V2] = js.Function1[/* e */ Event[V], default[V2] | EventOrValue[V2]]
  
  trait FlatMapParams extends StObject {
    
    var desc: js.UndefOr[Desc] = js.undefined
    
    var firstOnly: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var mapError: js.UndefOr[Boolean] = js.undefined
  }
  object FlatMapParams {
    
    @scala.inline
    def apply(): FlatMapParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatMapParams]
    }
    
    @scala.inline
    implicit class FlatMapParamsMutableBuilder[Self <: FlatMapParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: Desc): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setFirstOnly(value: Boolean): Self = StObject.set(x, "firstOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstOnlyUndefined: Self = StObject.set(x, "firstOnly", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMapError(value: Boolean): Self = StObject.set(x, "mapError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapErrorUndefined: Self = StObject.set(x, "mapError", js.undefined)
    }
  }
  
  type SpawnerOrObservable[V, V2] = (ValueSpawner[V, V2]) | default[V2]
  
  type ValueSpawner[V, V2] = js.Function1[/* value */ V, default[V2] | EventOrValue[V2]]
}
