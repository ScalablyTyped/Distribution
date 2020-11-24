package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scoping extends js.Object {
  
  /**
    * The property- or tag-based conditions that determine which objects to exclude from the analysis.
    */
  var excludes: js.UndefOr[JobScopingBlock] = js.native
  
  /**
    * The property- or tag-based conditions that determine which objects to include in the analysis.
    */
  var includes: js.UndefOr[JobScopingBlock] = js.native
}
object Scoping {
  
  @scala.inline
  def apply(): Scoping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scoping]
  }
  
  @scala.inline
  implicit class ScopingOps[Self <: Scoping] (val x: Self) extends AnyVal {
    
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
    def setExcludes(value: JobScopingBlock): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setIncludes(value: JobScopingBlock): Self = this.set("includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
  }
}
