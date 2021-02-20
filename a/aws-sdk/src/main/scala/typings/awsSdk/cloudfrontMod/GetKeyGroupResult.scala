package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyGroupResult extends StObject {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The key group.
    */
  var KeyGroup: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroup] = js.native
}
object GetKeyGroupResult {
  
  @scala.inline
  def apply(): GetKeyGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyGroupResult]
  }
  
  @scala.inline
  implicit class GetKeyGroupResultMutableBuilder[Self <: GetKeyGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setKeyGroup(value: KeyGroup): Self = StObject.set(x, "KeyGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGroupUndefined: Self = StObject.set(x, "KeyGroup", js.undefined)
  }
}
