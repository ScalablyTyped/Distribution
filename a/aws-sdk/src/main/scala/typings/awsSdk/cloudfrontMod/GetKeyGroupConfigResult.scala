package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyGroupConfigResult extends StObject {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The key group configuration.
    */
  var KeyGroupConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroupConfig] = js.native
}
object GetKeyGroupConfigResult {
  
  @scala.inline
  def apply(): GetKeyGroupConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyGroupConfigResult]
  }
  
  @scala.inline
  implicit class GetKeyGroupConfigResultMutableBuilder[Self <: GetKeyGroupConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    @scala.inline
    def setKeyGroupConfig(value: KeyGroupConfig): Self = StObject.set(x, "KeyGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGroupConfigUndefined: Self = StObject.set(x, "KeyGroupConfig", js.undefined)
  }
}
