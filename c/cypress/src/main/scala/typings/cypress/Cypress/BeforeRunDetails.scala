package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeRunDetails extends StObject {
  
  var browser: js.UndefOr[Browser] = js.undefined
  
  var config: ConfigOptions[Any]
  
  var cypressVersion: String
  
  var group: js.UndefOr[String] = js.undefined
  
  var parallel: js.UndefOr[Boolean] = js.undefined
  
  var runUrl: js.UndefOr[String] = js.undefined
  
  var specPattern: js.UndefOr[js.Array[String]] = js.undefined
  
  var specs: js.UndefOr[js.Array[Spec]] = js.undefined
  
  var system: SystemDetails
  
  var tag: js.UndefOr[String] = js.undefined
}
object BeforeRunDetails {
  
  inline def apply(config: ConfigOptions[Any], cypressVersion: String, system: SystemDetails): BeforeRunDetails = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], cypressVersion = cypressVersion.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeRunDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeforeRunDetails] (val x: Self) extends AnyVal {
    
    inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setConfig(value: ConfigOptions[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCypressVersion(value: String): Self = StObject.set(x, "cypressVersion", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setRunUrl(value: String): Self = StObject.set(x, "runUrl", value.asInstanceOf[js.Any])
    
    inline def setRunUrlUndefined: Self = StObject.set(x, "runUrl", js.undefined)
    
    inline def setSpecPattern(value: js.Array[String]): Self = StObject.set(x, "specPattern", value.asInstanceOf[js.Any])
    
    inline def setSpecPatternUndefined: Self = StObject.set(x, "specPattern", js.undefined)
    
    inline def setSpecPatternVarargs(value: String*): Self = StObject.set(x, "specPattern", js.Array(value*))
    
    inline def setSpecs(value: js.Array[Spec]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    inline def setSpecsVarargs(value: Spec*): Self = StObject.set(x, "specs", js.Array(value*))
    
    inline def setSystem(value: SystemDetails): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
