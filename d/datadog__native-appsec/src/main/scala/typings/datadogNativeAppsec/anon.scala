package typings.datadogNativeAppsec

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Errors extends StObject {
    
    var errors: StringDictionary[js.Array[String]]
    
    var failed: Double
    
    var loaded: Double
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Errors {
    
    inline def apply(errors: StringDictionary[js.Array[String]], failed: Double, loaded: Double): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ObfuscatorKeyRegex extends StObject {
    
    var obfuscatorKeyRegex: js.UndefOr[String] = js.undefined
    
    var obfuscatorValueRegex: js.UndefOr[String] = js.undefined
  }
  object ObfuscatorKeyRegex {
    
    inline def apply(): ObfuscatorKeyRegex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObfuscatorKeyRegex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObfuscatorKeyRegex] (val x: Self) extends AnyVal {
      
      inline def setObfuscatorKeyRegex(value: String): Self = StObject.set(x, "obfuscatorKeyRegex", value.asInstanceOf[js.Any])
      
      inline def setObfuscatorKeyRegexUndefined: Self = StObject.set(x, "obfuscatorKeyRegex", js.undefined)
      
      inline def setObfuscatorValueRegex(value: String): Self = StObject.set(x, "obfuscatorValueRegex", value.asInstanceOf[js.Any])
      
      inline def setObfuscatorValueRegexUndefined: Self = StObject.set(x, "obfuscatorValueRegex", js.undefined)
    }
  }
}
