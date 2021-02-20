package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  @JSImport("baconjs/types/callback", "fromCallback")
  @js.native
  def fromCallback[V](f: js.Function, args: js.Any*): EventStream[V] = js.native
  
  @JSImport("baconjs/types/callback", "fromNodeCallback")
  @js.native
  def fromNodeCallback[V](f: js.Function, args: js.Any*): EventStream[V] = js.native
}
