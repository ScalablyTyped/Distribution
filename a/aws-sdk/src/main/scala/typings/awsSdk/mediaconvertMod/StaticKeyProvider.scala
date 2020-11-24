package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticKeyProvider extends js.Object {
  
  /**
    * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS string. May be omitted to indicate an implicit value of 'identity'.
    */
  var KeyFormat: js.UndefOr[stringPatternIdentityAZaZ26AZaZ09163] = js.native
  
  /**
    * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of version values (1/2/3).
    */
  var KeyFormatVersions: js.UndefOr[stringPatternDD] = js.native
  
  /**
    * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
    */
  var StaticKeyValue: js.UndefOr[stringPatternAZaZ0932] = js.native
  
  /**
    * Relates to DRM implementation. The location of the license server used for protecting content.
    */
  var Url: js.UndefOr[string] = js.native
}
object StaticKeyProvider {
  
  @scala.inline
  def apply(): StaticKeyProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticKeyProvider]
  }
  
  @scala.inline
  implicit class StaticKeyProviderOps[Self <: StaticKeyProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyFormat(value: stringPatternIdentityAZaZ26AZaZ09163): Self = this.set("KeyFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFormat: Self = this.set("KeyFormat", js.undefined)
    
    @scala.inline
    def setKeyFormatVersions(value: stringPatternDD): Self = this.set("KeyFormatVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyFormatVersions: Self = this.set("KeyFormatVersions", js.undefined)
    
    @scala.inline
    def setStaticKeyValue(value: stringPatternAZaZ0932): Self = this.set("StaticKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticKeyValue: Self = this.set("StaticKeyValue", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
