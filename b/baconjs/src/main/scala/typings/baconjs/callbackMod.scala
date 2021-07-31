package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  @JSImport("baconjs/types/callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromCallback[V](f: js.Function, args: js.Any*): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(f.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  @scala.inline
  def fromNodeCallback[V](f: js.Function, args: js.Any*): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeCallback")(f.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
