package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/holdwhen", JSImport.Namespace)
@js.native
object holdwhenMod extends js.Object {
  
  def holdWhen[V](src: default[V], valve: Property[Boolean]): EventStream[V] = js.native
}
