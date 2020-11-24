package typings.baconjs

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/describe", JSImport.Namespace)
@js.native
object describeMod extends js.Object {
  
  def default(context: js.Any, method: String, args: js.Any*): Desc = js.native
  
  def describe(context: js.Any, method: String, args: js.Any*): Desc = js.native
  
  def findDeps(x: js.Any): js.Array[default[_]] = js.native
  
  @js.native
  class Desc protected () extends js.Object {
    def this(context: js.Any, method: String) = this()
    def this(context: js.Any, method: String, args: js.Array[_]) = this()
    
    /** @hidden */
    var _isDesc: Boolean = js.native
    
    var args: js.Array[_] = js.native
    
    /** @hidden */
    var cachedDeps: js.UndefOr[js.Array[default[_]]] = js.native
    
    var context: js.Any = js.native
    
    def deps(): js.Array[default[_]] = js.native
    
    var method: js.UndefOr[String] = js.native
  }
}
