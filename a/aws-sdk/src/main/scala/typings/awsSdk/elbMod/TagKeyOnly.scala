package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagKeyOnly extends StObject {
  
  /**
    * The name of the key.
    */
  var Key: js.UndefOr[TagKey] = js.native
}
object TagKeyOnly {
  
  @scala.inline
  def apply(): TagKeyOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKeyOnly]
  }
  
  @scala.inline
  implicit class TagKeyOnlyMutableBuilder[Self <: TagKeyOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
