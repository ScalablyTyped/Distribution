package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableEbsEncryptionByDefaultResult extends StObject {
  
  /**
    * The updated status of encryption by default.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.native
}
object EnableEbsEncryptionByDefaultResult {
  
  @scala.inline
  def apply(): EnableEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableEbsEncryptionByDefaultResult]
  }
  
  @scala.inline
  implicit class EnableEbsEncryptionByDefaultResultMutableBuilder[Self <: EnableEbsEncryptionByDefaultResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsEncryptionByDefault(value: Boolean): Self = StObject.set(x, "EbsEncryptionByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsEncryptionByDefaultUndefined: Self = StObject.set(x, "EbsEncryptionByDefault", js.undefined)
  }
}
