package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scoping extends StObject {
  
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
  implicit class ScopingMutableBuilder[Self <: Scoping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludes(value: JobScopingBlock): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    @scala.inline
    def setIncludes(value: JobScopingBlock): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
  }
}
