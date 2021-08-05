package typings.degit

import typings.degit.degitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearCache extends StObject {
    
    var clearCache: js.UndefOr[`true`] = js.undefined
  }
  object ClearCache {
    
    inline def apply(): ClearCache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearCache]
    }
    
    extension [Self <: ClearCache](x: Self) {
      
      inline def setClearCache(value: `true`): Self = StObject.set(x, "clearCache", value.asInstanceOf[js.Any])
      
      inline def setClearCacheUndefined: Self = StObject.set(x, "clearCache", js.undefined)
    }
  }
  
  trait Stderr extends StObject {
    
    var stderr: String
    
    var stdout: String
  }
  object Stderr {
    
    inline def apply(stderr: String, stdout: String): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    extension [Self <: Stderr](x: Self) {
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
