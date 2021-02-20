package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object laterMod {
  
  @JSImport("baconjs/types/later", JSImport.Default)
  @js.native
  def default[V](delay: Double, value: V): EventStream[V] = js.native
}
