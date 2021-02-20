package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionFetchOptions
  extends CollectionSetOptions
     with PersistenceOptions {
  
  var reset: js.UndefOr[Boolean] = js.native
}
object CollectionFetchOptions {
  
  @scala.inline
  def apply(): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchOptions]
  }
  
  @scala.inline
  implicit class CollectionFetchOptionsMutableBuilder[Self <: CollectionFetchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
  }
}
