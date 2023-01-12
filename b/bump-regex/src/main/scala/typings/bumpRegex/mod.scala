package typings.bumpRegex

import typings.bumpRegex.bumpRegexStrings.major
import typings.bumpRegex.bumpRegexStrings.minor
import typings.bumpRegex.bumpRegexStrings.patch
import typings.bumpRegex.bumpRegexStrings.prerelease
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: String, cb: Callback): Any = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(opts: Options, cb: Callback): Any = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("bump-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ String | js.Error | Null, /* opts */ js.UndefOr[Result], Unit]
  
  trait Options extends StObject {
    
    var `case`: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Keep the metadata of the old version after bumping
      * @default false
      */
    var keepmetadata: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var keys: js.UndefOr[js.Array[String]] = js.undefined
    
    var preid: js.UndefOr[String] = js.undefined
    
    var regex: js.UndefOr[js.RegExp] = js.undefined
    
    var str: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[major | minor | patch | prerelease] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCase(value: Boolean): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
      
      inline def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setKeepmetadata(value: Boolean): Self = StObject.set(x, "keepmetadata", value.asInstanceOf[js.Any])
      
      inline def setKeepmetadataUndefined: Self = StObject.set(x, "keepmetadata", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setPreid(value: String): Self = StObject.set(x, "preid", value.asInstanceOf[js.Any])
      
      inline def setPreidUndefined: Self = StObject.set(x, "preid", js.undefined)
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      inline def setStrUndefined: Self = StObject.set(x, "str", js.undefined)
      
      inline def setType(value: major | minor | patch | prerelease): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Result
    extends StObject
       with Options {
    
    var `new`: String
    
    var prev: String
  }
  object Result {
    
    inline def apply(`new`: String, prev: String): Result = {
      val __obj = js.Dynamic.literal(prev = prev.asInstanceOf[js.Any])
      __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setNew(value: String): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
}
