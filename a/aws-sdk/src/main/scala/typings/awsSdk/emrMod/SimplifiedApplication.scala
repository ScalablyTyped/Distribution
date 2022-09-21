package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplifiedApplication extends StObject {
  
  /**
    * The returned release label application name. For example, hadoop.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The returned release label application version. For example, 3.2.1.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object SimplifiedApplication {
  
  inline def apply(): SimplifiedApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimplifiedApplication]
  }
  
  extension [Self <: SimplifiedApplication](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
