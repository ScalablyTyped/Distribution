package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableEbsEncryptionByDefaultResult extends StObject {
  
  /**
    * The updated status of encryption by default.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined
}
object DisableEbsEncryptionByDefaultResult {
  
  @scala.inline
  def apply(): DisableEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableEbsEncryptionByDefaultResult]
  }
  
  @scala.inline
  implicit class DisableEbsEncryptionByDefaultResultMutableBuilder[Self <: DisableEbsEncryptionByDefaultResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsEncryptionByDefault(value: Boolean): Self = StObject.set(x, "EbsEncryptionByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsEncryptionByDefaultUndefined: Self = StObject.set(x, "EbsEncryptionByDefault", js.undefined)
  }
}
