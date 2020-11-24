package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.observableMod.Property
import typings.baconjs.typesMod.EventStreamDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/internal/transformpropertychanges", JSImport.Namespace)
@js.native
object transformpropertychangesMod extends js.Object {
  
  def default[V](property: Property[V], f: EventStreamDelay[V], desc: Desc): Property[V] = js.native
}
