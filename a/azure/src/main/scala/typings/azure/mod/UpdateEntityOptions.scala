package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEntityOptions extends TimeoutIntervalOptions {
  
  var checkEtag: js.UndefOr[Boolean] = js.native
}
object UpdateEntityOptions {
  
  @scala.inline
  def apply(): UpdateEntityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEntityOptions]
  }
  
  @scala.inline
  implicit class UpdateEntityOptionsMutableBuilder[Self <: UpdateEntityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckEtag(value: Boolean): Self = StObject.set(x, "checkEtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckEtagUndefined: Self = StObject.set(x, "checkEtag", js.undefined)
  }
}
