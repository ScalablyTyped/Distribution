package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceResult extends StObject {
  
  /**
    * The list of tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.codestarnotificationsMod.Tags] = js.native
}
object TagResourceResult {
  
  @scala.inline
  def apply(): TagResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceResult]
  }
  
  @scala.inline
  implicit class TagResourceResultMutableBuilder[Self <: TagResourceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
