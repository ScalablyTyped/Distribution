package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyGroupResult extends StObject {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The key group that was just created.
    */
  var KeyGroup: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroup] = js.native
  
  /**
    * The URL of the key group.
    */
  var Location: js.UndefOr[String] = js.native
}
object CreateKeyGroupResult {
  
  @scala.inline
  def apply(): CreateKeyGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyGroupResult]
  }
  
  @scala.inline
  implicit class CreateKeyGroupResultMutableBuilder[Self <: CreateKeyGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setKeyGroup(value: KeyGroup): Self = StObject.set(x, "KeyGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGroupUndefined: Self = StObject.set(x, "KeyGroup", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
