package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupbyMod {
  
  @JSImport("baconjs/types/groupby", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def groupBy[V, V2](src: default[V], keyF: js.Function1[/* value */ V, String]): default[EventStream[V2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(src.asInstanceOf[js.Any], keyF.asInstanceOf[js.Any])).asInstanceOf[default[EventStream[V2]]]
  @scala.inline
  def groupBy[V, V2](src: default[V], keyF: js.Function1[/* value */ V, String], limitF: GroupTransformer[V, V2]): default[EventStream[V2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(src.asInstanceOf[js.Any], keyF.asInstanceOf[js.Any], limitF.asInstanceOf[js.Any])).asInstanceOf[default[EventStream[V2]]]
  
  type GroupTransformer[V, V2] = js.Function2[/* data */ EventStream[V], /* firstValue */ V, default[V2]]
}
