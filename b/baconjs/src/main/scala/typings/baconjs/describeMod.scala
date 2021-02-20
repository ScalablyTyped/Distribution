package typings.baconjs

import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeMod {
  
  @JSImport("baconjs/types/describe", JSImport.Default)
  @js.native
  def default(context: js.Any, method: String, args: js.Any*): Desc = js.native
  
  @JSImport("baconjs/types/describe", "Desc")
  @js.native
  class Desc protected () extends StObject {
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
  
  @JSImport("baconjs/types/describe", "describe")
  @js.native
  def describe(context: js.Any, method: String, args: js.Any*): Desc = js.native
  
  @JSImport("baconjs/types/describe", "findDeps")
  @js.native
  def findDeps(x: js.Any): js.Array[default[_]] = js.native
}
