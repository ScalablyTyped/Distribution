package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBrowserTreeProperties
  extends StObject
     with ComponentProperties {
  
  var ownerUri: String
}
object FileBrowserTreeProperties {
  
  inline def apply(ownerUri: String): FileBrowserTreeProperties = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserTreeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileBrowserTreeProperties] (val x: Self) extends AnyVal {
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
