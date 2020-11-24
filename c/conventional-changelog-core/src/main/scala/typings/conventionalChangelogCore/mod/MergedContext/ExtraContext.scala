package typings.conventionalChangelogCore.mod.MergedContext

import typings.conventionalChangelogCore.anon.ReadonlyPartialPackage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraContext extends js.Object {
  
  /**
    * All git semver tags found in the repository. You can't overwrite this value.
    */
  val gitSemverTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Your `package.json` data. You can't overwrite this value.
    */
  val packageData: js.UndefOr[ReadonlyPartialPackage] = js.native
}
object ExtraContext {
  
  @scala.inline
  def apply(): ExtraContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraContext]
  }
  
  @scala.inline
  implicit class ExtraContextOps[Self <: ExtraContext] (val x: Self) extends AnyVal {
    
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
    def setGitSemverTagsVarargs(value: String*): Self = this.set("gitSemverTags", js.Array(value :_*))
    
    @scala.inline
    def setGitSemverTags(value: js.Array[String]): Self = this.set("gitSemverTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitSemverTags: Self = this.set("gitSemverTags", js.undefined)
    
    @scala.inline
    def setPackageData(value: ReadonlyPartialPackage): Self = this.set("packageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageData: Self = this.set("packageData", js.undefined)
  }
}
