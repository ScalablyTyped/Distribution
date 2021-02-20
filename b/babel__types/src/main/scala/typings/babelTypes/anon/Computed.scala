package typings.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Computed extends StObject {
  
  var computed: Boolean | Null = js.native
}
object Computed {
  
  @scala.inline
  def apply(): Computed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computed]
  }
  
  @scala.inline
  implicit class ComputedMutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedNull: Self = StObject.set(x, "computed", null)
  }
}
