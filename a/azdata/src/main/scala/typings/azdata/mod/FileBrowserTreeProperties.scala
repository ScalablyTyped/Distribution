package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBrowserTreeProperties extends ComponentProperties {
  
  var ownerUri: String = js.native
}
object FileBrowserTreeProperties {
  
  @scala.inline
  def apply(ownerUri: String): FileBrowserTreeProperties = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserTreeProperties]
  }
  
  @scala.inline
  implicit class FileBrowserTreePropertiesMutableBuilder[Self <: FileBrowserTreeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
