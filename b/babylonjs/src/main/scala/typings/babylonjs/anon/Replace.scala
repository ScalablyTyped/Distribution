package typings.babylonjs.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replace extends StObject {
  
  var replace: String = js.native
  
  var search: RegExp = js.native
}
object Replace {
  
  @scala.inline
  def apply(replace: String, search: RegExp): Replace = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
  
  @scala.inline
  implicit class ReplaceMutableBuilder[Self <: Replace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: RegExp): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
