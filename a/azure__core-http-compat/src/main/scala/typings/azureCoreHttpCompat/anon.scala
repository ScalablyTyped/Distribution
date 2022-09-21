package typings.azureCoreHttpCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PreserveCase extends StObject {
    
    var preserveCase: js.UndefOr[Boolean] = js.undefined
  }
  object PreserveCase {
    
    inline def apply(): PreserveCase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreserveCase]
    }
    
    extension [Self <: PreserveCase](x: Self) {
      
      inline def setPreserveCase(value: Boolean): Self = StObject.set(x, "preserveCase", value.asInstanceOf[js.Any])
      
      inline def setPreserveCaseUndefined: Self = StObject.set(x, "preserveCase", js.undefined)
    }
  }
}
