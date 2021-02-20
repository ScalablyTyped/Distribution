package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFlatmapMod {
  
  @JSImport("baconjs/types/flatmap_", JSImport.Default)
  @js.native
  def default[In, Out](spawner: EventSpawner[In, Out], src: typings.baconjs.observableMod.default[In]): typings.baconjs.observableMod.default[Out] = js.native
  @JSImport("baconjs/types/flatmap_", JSImport.Default)
  @js.native
  def default[In, Out](
    spawner: EventSpawner[In, Out],
    src: typings.baconjs.observableMod.default[In],
    params: FlatMapParams
  ): typings.baconjs.observableMod.default[Out] = js.native
  
  @JSImport("baconjs/types/flatmap_", "flatMap_")
  @js.native
  def flatMap[In, Out](spawner: EventSpawner[In, Out], src: default[In]): default[Out] = js.native
  @JSImport("baconjs/types/flatmap_", "flatMap_")
  @js.native
  def flatMap[In, Out](spawner: EventSpawner[In, Out], src: default[In], params: FlatMapParams): default[Out] = js.native
  
  @JSImport("baconjs/types/flatmap_", "handleEventValueWith")
  @js.native
  def handleEventValueWith[In, Out](f: SpawnerOrObservable[In, Out]): EventSpawner[In, Out] = js.native
  
  @JSImport("baconjs/types/flatmap_", "makeObservable")
  @js.native
  def makeObservable[V](x: V): default[V] = js.native
  @JSImport("baconjs/types/flatmap_", "makeObservable")
  @js.native
  def makeObservable[V](x: Event[V]): default[V] = js.native
  @JSImport("baconjs/types/flatmap_", "makeObservable")
  @js.native
  def makeObservable[V](x: default[V]): default[V] = js.native
  
  type EventOrValue[V] = Event[V] | V
  
  type EventSpawner[V, V2] = js.Function1[/* e */ Event[V], default[V2] | EventOrValue[V2]]
  
  @js.native
  trait FlatMapParams extends StObject {
    
    var desc: js.UndefOr[Desc] = js.native
    
    var firstOnly: js.UndefOr[Boolean] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var mapError: js.UndefOr[Boolean] = js.native
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
