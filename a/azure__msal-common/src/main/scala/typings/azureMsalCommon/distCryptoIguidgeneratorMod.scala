package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoIguidgeneratorMod {
  
  trait IGuidGenerator extends StObject {
    
    def generateGuid(): String
    
    def isGuid(guid: String): Boolean
  }
  object IGuidGenerator {
    
    inline def apply(generateGuid: () => String, isGuid: String => Boolean): IGuidGenerator = {
      val __obj = js.Dynamic.literal(generateGuid = js.Any.fromFunction0(generateGuid), isGuid = js.Any.fromFunction1(isGuid))
      __obj.asInstanceOf[IGuidGenerator]
    }
    
    extension [Self <: IGuidGenerator](x: Self) {
      
      inline def setGenerateGuid(value: () => String): Self = StObject.set(x, "generateGuid", js.Any.fromFunction0(value))
      
      inline def setIsGuid(value: String => Boolean): Self = StObject.set(x, "isGuid", js.Any.fromFunction1(value))
    }
  }
}
