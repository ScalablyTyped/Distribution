package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceUri extends StObject {
  
  var sourceUri: js.UndefOr[String] = js.native
}
object SourceUri {
  
  @scala.inline
  def apply(): SourceUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceUri]
  }
  
  @scala.inline
  implicit class SourceUriMutableBuilder[Self <: SourceUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
  }
}
