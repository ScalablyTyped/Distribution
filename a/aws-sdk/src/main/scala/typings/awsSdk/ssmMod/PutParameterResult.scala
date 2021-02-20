package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutParameterResult extends StObject {
  
  /**
    * The tier assigned to the parameter.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  
  /**
    * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system returns the latest parameter value when a parameter is called.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
}
object PutParameterResult {
  
  @scala.inline
  def apply(): PutParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutParameterResult]
  }
  
  @scala.inline
  implicit class PutParameterResultMutableBuilder[Self <: PutParameterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTier(value: ParameterTier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    @scala.inline
    def setVersion(value: PSParameterVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
