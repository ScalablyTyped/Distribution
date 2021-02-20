package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseInfo extends StObject {
  
  /**
    *  Name of the license. 
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *  The URL for license data. 
    */
  var url: js.UndefOr[String] = js.native
}
object LicenseInfo {
  
  @scala.inline
  def apply(): LicenseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseInfo]
  }
  
  @scala.inline
  implicit class LicenseInfoMutableBuilder[Self <: LicenseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
