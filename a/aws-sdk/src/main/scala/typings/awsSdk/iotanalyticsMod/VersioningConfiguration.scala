package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersioningConfiguration extends StObject {
  
  /**
    * How many versions of dataset contents are kept. The unlimited parameter must be false.
    */
  var maxVersions: js.UndefOr[MaxVersions] = js.native
  
  /**
    * If true, unlimited versions of dataset contents are kept.
    */
  var unlimited: js.UndefOr[UnlimitedVersioning] = js.native
}
object VersioningConfiguration {
  
  @scala.inline
  def apply(): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersioningConfiguration]
  }
  
  @scala.inline
  implicit class VersioningConfigurationMutableBuilder[Self <: VersioningConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxVersions(value: MaxVersions): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
    
    @scala.inline
    def setUnlimited(value: UnlimitedVersioning): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
  }
}
