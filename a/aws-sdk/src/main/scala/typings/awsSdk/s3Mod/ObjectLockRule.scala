package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLockRule extends StObject {
  
  /**
    * The default retention period that you want to apply to new objects placed in the specified bucket.
    */
  var DefaultRetention: js.UndefOr[typings.awsSdk.s3Mod.DefaultRetention] = js.native
}
object ObjectLockRule {
  
  @scala.inline
  def apply(): ObjectLockRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockRule]
  }
  
  @scala.inline
  implicit class ObjectLockRuleMutableBuilder[Self <: ObjectLockRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRetention(value: DefaultRetention): Self = StObject.set(x, "DefaultRetention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRetentionUndefined: Self = StObject.set(x, "DefaultRetention", js.undefined)
  }
}
