package typings.baconjs.observableMod

import typings.baconjs.describeMod.Desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/observable", JSImport.Default)
@js.native
abstract class default[V] protected () extends Observable[V] {
  def this(desc: Desc) = this()
}
