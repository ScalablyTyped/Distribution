package typings.backblazeB2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyOpts
  extends StObject
     with CommonArgs {
  
  var bucketId: js.UndefOr[String] = js.undefined
  
  var capabilities: js.Array[String]
  
  var keyName: String
  
  var namePrefix: js.UndefOr[String] = js.undefined
  
  var validDurationInSeconds: js.UndefOr[Double] = js.undefined
}
object CreateKeyOpts {
  
  inline def apply(capabilities: js.Array[String], keyName: String): CreateKeyOpts = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyOpts]
  }
  
  extension [Self <: CreateKeyOpts](x: Self) {
    
    inline def setBucketId(value: String): Self = StObject.set(x, "bucketId", value.asInstanceOf[js.Any])
    
    inline def setBucketIdUndefined: Self = StObject.set(x, "bucketId", js.undefined)
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    inline def setValidDurationInSeconds(value: Double): Self = StObject.set(x, "validDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setValidDurationInSecondsUndefined: Self = StObject.set(x, "validDurationInSeconds", js.undefined)
  }
}
