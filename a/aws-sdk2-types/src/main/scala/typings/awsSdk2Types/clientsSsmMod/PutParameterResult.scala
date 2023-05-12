package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutParameterResult extends StObject {
  
  /**
    * The tier assigned to the parameter.
    */
  var Tier: js.UndefOr[ParameterTier] = js.undefined
  
  /**
    * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new version and assigns this new version a unique ID. You can reference a parameter version ID in API operations or in Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system returns the latest parameter value when a parameter is called.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.undefined
}
object PutParameterResult {
  
  inline def apply(): PutParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutParameterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutParameterResult] (val x: Self) extends AnyVal {
    
    inline def setTier(value: ParameterTier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    inline def setVersion(value: PSParameterVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
