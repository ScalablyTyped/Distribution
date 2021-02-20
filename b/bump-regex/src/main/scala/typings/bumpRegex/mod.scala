package typings.bumpRegex

import typings.bumpRegex.bumpRegexStrings.major
import typings.bumpRegex.bumpRegexStrings.minor
import typings.bumpRegex.bumpRegexStrings.patch
import typings.bumpRegex.bumpRegexStrings.prerelease
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bump-regex", JSImport.Namespace)
  @js.native
  def apply(opts: String, cb: Callback): js.Any = js.native
  @JSImport("bump-regex", JSImport.Namespace)
  @js.native
  def apply(opts: Options, cb: Callback): js.Any = js.native
  
  type Callback = js.Function2[/* err */ String | Error | Null, /* opts */ js.UndefOr[Result], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var `case`: js.UndefOr[Boolean] = js.native
    
    var global: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var keys: js.UndefOr[js.Array[String]] = js.native
    
    var preid: js.UndefOr[String] = js.native
    
    var regex: js.UndefOr[RegExp] = js.native
    
    var str: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[major | minor | patch | prerelease] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCase(value: Boolean): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setPreid(value: String): Self = StObject.set(x, "preid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreidUndefined: Self = StObject.set(x, "preid", js.undefined)
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrUndefined: Self = StObject.set(x, "str", js.undefined)
      
      @scala.inline
      def setType(value: major | minor | patch | prerelease): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Result extends Options {
    
    var `new`: String = js.native
    
    var prev: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(`new`: String, prev: String): Result = {
      val __obj = js.Dynamic.literal(prev = prev.asInstanceOf[js.Any])
      __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNew(value: String): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
}
