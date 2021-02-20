package typings.dargs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[String | Boolean | Double | js.Array[String]] {
    
    var `--`: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("_")
    var _underscore: js.UndefOr[js.Array[String]] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set--`(value: js.Array[String]): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set--Undefined`: Self = StObject.set(x, "--", js.undefined)
      
      @scala.inline
      def `set--Varargs`(value: String*): Self = StObject.set(x, "--", js.Array(value :_*))
      
      @scala.inline
      def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_underscoreUndefined: Self = StObject.set(x, "_", js.undefined)
      
      @scala.inline
      def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
}
