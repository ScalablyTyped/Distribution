package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectRetentionOutput extends StObject {
  
  /**
    * The container element for an object's retention settings.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.native
}
object GetObjectRetentionOutput {
  
  @scala.inline
  def apply(): GetObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectRetentionOutput]
  }
  
  @scala.inline
  implicit class GetObjectRetentionOutputMutableBuilder[Self <: GetObjectRetentionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetention(value: ObjectLockRetention): Self = StObject.set(x, "Retention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionUndefined: Self = StObject.set(x, "Retention", js.undefined)
  }
}
