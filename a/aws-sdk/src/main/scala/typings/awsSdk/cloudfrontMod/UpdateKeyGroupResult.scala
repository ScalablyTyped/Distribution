package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateKeyGroupResult extends StObject {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The key group that was just updated.
    */
  var KeyGroup: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroup] = js.undefined
}
object UpdateKeyGroupResult {
  
  @scala.inline
  def apply(): UpdateKeyGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateKeyGroupResult]
  }
  
  @scala.inline
  implicit class UpdateKeyGroupResultMutableBuilder[Self <: UpdateKeyGroupResult] (val x: Self) extends AnyVal {
    
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
