package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inclusive extends StObject {
  
  var inclusive: js.UndefOr[Boolean] = js.native
}
object Inclusive {
  
  @scala.inline
  def apply(): Inclusive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inclusive]
  }
  
  @scala.inline
  implicit class InclusiveMutableBuilder[Self <: Inclusive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
  }
}
