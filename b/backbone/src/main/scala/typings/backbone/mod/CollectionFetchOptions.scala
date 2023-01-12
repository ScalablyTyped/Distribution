package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionFetchOptions
  extends StObject
     with PersistenceOptions
     with CollectionSetOptions {
  
  var reset: js.UndefOr[Boolean] = js.undefined
}
object CollectionFetchOptions {
  
  inline def apply(): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionFetchOptions] (val x: Self) extends AnyVal {
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
  }
}
