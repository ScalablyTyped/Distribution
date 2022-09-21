package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ForceRefresh extends StObject {
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
  }
  object ForceRefresh {
    
    inline def apply(): ForceRefresh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceRefresh]
    }
    
    extension [Self <: ForceRefresh](x: Self) {
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
    }
  }
}
