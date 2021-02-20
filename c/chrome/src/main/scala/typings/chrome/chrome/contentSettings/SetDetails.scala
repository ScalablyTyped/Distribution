package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDetails extends StObject {
  
  /** The pattern for the primary URL. For details on the format of a pattern, see Content Setting Patterns. */
  var primaryPattern: String = js.native
  
  /** Optional. The resource identifier for the content type.  */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  
  /** Optional. Where to set the setting (default: regular).  */
  var scope: js.UndefOr[ScopeEnum] = js.native
  
  /** Optional. The pattern for the secondary URL. Defaults to matching all URLs. For details on the format of a pattern, see Content Setting Patterns.  */
  var secondaryPattern: js.UndefOr[String] = js.native
  
  /** The setting applied by this rule. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any = js.native
}
object SetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: js.Any): SetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDetails]
  }
  
  @scala.inline
  implicit class SetDetailsMutableBuilder[Self <: SetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimaryPattern(value: String): Self = StObject.set(x, "primaryPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    @scala.inline
    def setScope(value: ScopeEnum): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSecondaryPattern(value: String): Self = StObject.set(x, "secondaryPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPatternUndefined: Self = StObject.set(x, "secondaryPattern", js.undefined)
    
    @scala.inline
    def setSetting(value: js.Any): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
