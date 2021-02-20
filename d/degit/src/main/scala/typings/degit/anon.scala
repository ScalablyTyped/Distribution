package typings.degit

import typings.degit.degitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClearCache extends StObject {
    
    var clearCache: js.UndefOr[`true`] = js.native
  }
  object ClearCache {
    
    @scala.inline
    def apply(): ClearCache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearCache]
    }
    
    @scala.inline
    implicit class ClearCacheMutableBuilder[Self <: ClearCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearCache(value: `true`): Self = StObject.set(x, "clearCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearCacheUndefined: Self = StObject.set(x, "clearCache", js.undefined)
    }
  }
  
  @js.native
  trait Stderr extends StObject {
    
    var stderr: String = js.native
    
    var stdout: String = js.native
  }
  object Stderr {
    
    @scala.inline
    def apply(stderr: String, stdout: String): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    @scala.inline
    implicit class StderrMutableBuilder[Self <: Stderr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
