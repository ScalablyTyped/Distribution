package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allframes extends js.Object {
  
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
  implicit class AllframesOps[Self <: Allframes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll_frames(value: Boolean): Self = this.set("all_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll_frames: Self = this.set("all_frames", js.undefined)
    
    @scala.inline
    def setCssVarargs(value: String*): Self = this.set("css", js.Array(value :_*))
    
    @scala.inline
    def setCss(value: js.Array[String]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setExclude_globsVarargs(value: String*): Self = this.set("exclude_globs", js.Array(value :_*))
    
    @scala.inline
    def setExclude_globs(value: js.Array[String]): Self = this.set("exclude_globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_globs: Self = this.set("exclude_globs", js.undefined)
    
    @scala.inline
    def setExclude_matchesVarargs(value: String*): Self = this.set("exclude_matches", js.Array(value :_*))
    
    @scala.inline
    def setExclude_matches(value: js.Array[String]): Self = this.set("exclude_matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_matches: Self = this.set("exclude_matches", js.undefined)
    
    @scala.inline
    def setInclude_globsVarargs(value: String*): Self = this.set("include_globs", js.Array(value :_*))
    
    @scala.inline
    def setInclude_globs(value: js.Array[String]): Self = this.set("include_globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_globs: Self = this.set("include_globs", js.undefined)
    
    @scala.inline
    def setJs_Varargs(value: String*): Self = this.set("js", js.Array(value :_*))
    
    @scala.inline
    def setJs_(value: js.Array[String]): Self = this.set("js", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
    
    @scala.inline
    def setMatch_about_blank(value: Boolean): Self = this.set("match_about_blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch_about_blank: Self = this.set("match_about_blank", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = this.set("matches", js.Array(value :_*))
    
    @scala.inline
    def setMatches(value: js.Array[String]): Self = this.set("matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    
    @scala.inline
    def setRun_at(value: String): Self = this.set("run_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun_at: Self = this.set("run_at", js.undefined)
  }
}
