package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectLockConfigurationOutput extends StObject {
  
  /**
    * The specified bucket's Object Lock configuration.
    */
  var ObjectLockConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockConfiguration] = js.native
}
object GetObjectLockConfigurationOutput {
  
  @scala.inline
  def apply(): GetObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectLockConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetObjectLockConfigurationOutputMutableBuilder[Self <: GetObjectLockConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectLockConfiguration(value: ObjectLockConfiguration): Self = StObject.set(x, "ObjectLockConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockConfigurationUndefined: Self = StObject.set(x, "ObjectLockConfiguration", js.undefined)
  }
}
