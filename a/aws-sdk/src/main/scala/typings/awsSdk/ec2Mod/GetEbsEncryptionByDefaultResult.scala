package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEbsEncryptionByDefaultResult extends StObject {
  
  /**
    * Indicates whether encryption by default is enabled.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.native
}
object GetEbsEncryptionByDefaultResult {
  
  @scala.inline
  def apply(): GetEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEbsEncryptionByDefaultResult]
  }
  
  @scala.inline
  implicit class GetEbsEncryptionByDefaultResultMutableBuilder[Self <: GetEbsEncryptionByDefaultResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsEncryptionByDefault(value: Boolean): Self = StObject.set(x, "EbsEncryptionByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsEncryptionByDefaultUndefined: Self = StObject.set(x, "EbsEncryptionByDefault", js.undefined)
  }
}
