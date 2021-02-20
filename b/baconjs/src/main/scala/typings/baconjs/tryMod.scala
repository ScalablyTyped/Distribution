package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryMod {
  
  @JSImport("baconjs/types/try", JSImport.Default)
  @js.native
  def default[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, EventStream[Out]] = js.native
}
