package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutObjectLockConfigurationOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
}
object PutObjectLockConfigurationOutput {
  
  @scala.inline
  def apply(): PutObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectLockConfigurationOutput]
  }
  
  @scala.inline
  implicit class PutObjectLockConfigurationOutputMutableBuilder[Self <: PutObjectLockConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
