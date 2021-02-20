package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allframes extends StObject {
  
  var all_frames: js.UndefOr[Boolean] = js.native
  
  var css: js.UndefOr[js.Array[String]] = js.native
  
  var exclude_globs: js.UndefOr[js.Array[String]] = js.native
  
  var exclude_matches: js.UndefOr[js.Array[String]] = js.native
  
  var include_globs: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("js")
  var js_ : js.UndefOr[js.Array[String]] = js.native
  
  var match_about_blank: js.UndefOr[Boolean] = js.native
  
  var matches: js.UndefOr[js.Array[String]] = js.native
  
  var run_at: js.UndefOr[String] = js.native
}
object Allframes {
  
  @scala.inline
  def apply(): Allframes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allframes]
  }
  
  @scala.inline
  implicit class AllframesMutableBuilder[Self <: Allframes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll_frames(value: Boolean): Self = StObject.set(x, "all_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_framesUndefined: Self = StObject.set(x, "all_frames", js.undefined)
    
    @scala.inline
    def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value :_*))
    
    @scala.inline
    def setExclude_globs(value: js.Array[String]): Self = StObject.set(x, "exclude_globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_globsUndefined: Self = StObject.set(x, "exclude_globs", js.undefined)
    
    @scala.inline
    def setExclude_globsVarargs(value: String*): Self = StObject.set(x, "exclude_globs", js.Array(value :_*))
    
    @scala.inline
    def setExclude_matches(value: js.Array[String]): Self = StObject.set(x, "exclude_matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_matchesUndefined: Self = StObject.set(x, "exclude_matches", js.undefined)
    
    @scala.inline
    def setExclude_matchesVarargs(value: String*): Self = StObject.set(x, "exclude_matches", js.Array(value :_*))
    
    @scala.inline
    def setInclude_globs(value: js.Array[String]): Self = StObject.set(x, "include_globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_globsUndefined: Self = StObject.set(x, "include_globs", js.undefined)
    
    @scala.inline
    def setInclude_globsVarargs(value: String*): Self = StObject.set(x, "include_globs", js.Array(value :_*))
    
    @scala.inline
    def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
    
    @scala.inline
    def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value :_*))
    
    @scala.inline
    def setMatch_about_blank(value: Boolean): Self = StObject.set(x, "match_about_blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch_about_blankUndefined: Self = StObject.set(x, "match_about_blank", js.undefined)
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setRun_at(value: String): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_atUndefined: Self = StObject.set(x, "run_at", js.undefined)
  }
}
