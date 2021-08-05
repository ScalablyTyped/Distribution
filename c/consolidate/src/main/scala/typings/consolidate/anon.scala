package typings.consolidate

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictotherOptions
    extends StObject
       with /* otherOptions */ StringDictionary[js.Any] {
    
    var cache: js.UndefOr[Boolean] = js.undefined
  }
  object DictotherOptions {
    
    inline def apply(): DictotherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictotherOptions]
    }
    
    extension [Self <: DictotherOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
}
