package typings.cleanWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Removes files after every build (including watch mode) that match this pattern.
    * Used for files that are not created directly by Webpack.
    *
    * Use !negative patterns to exclude files
    *
    * default: []
    */
  var cleanAfterEveryBuildPatterns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Removes files once prior to Webpack compilation
    *   Not included in rebuilds (watch mode)
    *
    * Use !negative patterns to exclude files
    *
    * default: ['**\/ *']
    */
  var cleanOnceBeforeBuildPatterns: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Automatically remove all unused webpack assets on rebuild
    *
    * default: true
    */
  var cleanStaleWebpackAssets: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow clean patterns outside of process.cwd()
    *
    * requires dry option to be explicitly set
    *
    * default: false
    */
  var dangerouslyAllowCleanPatternsOutsideProject: js.UndefOr[Boolean] = js.native
  
  /**
    * Simulate the removal of files
    *
    * default: false
    */
  var dry: js.UndefOr[Boolean] = js.native
  
  /**
    * Do not allow removal of current webpack assets
    *
    * default: true
    */
  var protectWebpackAssets: js.UndefOr[Boolean] = js.native
  
  /**
    * Write Logs to Console
    * (Always enabled when dry is true)
    *
    * default: false
    */
  var verbose: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCleanAfterEveryBuildPatternsVarargs(value: String*): Self = this.set("cleanAfterEveryBuildPatterns", js.Array(value :_*))
    
    @scala.inline
    def setCleanAfterEveryBuildPatterns(value: js.Array[String]): Self = this.set("cleanAfterEveryBuildPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanAfterEveryBuildPatterns: Self = this.set("cleanAfterEveryBuildPatterns", js.undefined)
    
    @scala.inline
    def setCleanOnceBeforeBuildPatternsVarargs(value: String*): Self = this.set("cleanOnceBeforeBuildPatterns", js.Array(value :_*))
    
    @scala.inline
    def setCleanOnceBeforeBuildPatterns(value: js.Array[String]): Self = this.set("cleanOnceBeforeBuildPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanOnceBeforeBuildPatterns: Self = this.set("cleanOnceBeforeBuildPatterns", js.undefined)
    
    @scala.inline
    def setCleanStaleWebpackAssets(value: Boolean): Self = this.set("cleanStaleWebpackAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanStaleWebpackAssets: Self = this.set("cleanStaleWebpackAssets", js.undefined)
    
    @scala.inline
    def setDangerouslyAllowCleanPatternsOutsideProject(value: Boolean): Self = this.set("dangerouslyAllowCleanPatternsOutsideProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslyAllowCleanPatternsOutsideProject: Self = this.set("dangerouslyAllowCleanPatternsOutsideProject", js.undefined)
    
    @scala.inline
    def setDry(value: Boolean): Self = this.set("dry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDry: Self = this.set("dry", js.undefined)
    
    @scala.inline
    def setProtectWebpackAssets(value: Boolean): Self = this.set("protectWebpackAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectWebpackAssets: Self = this.set("protectWebpackAssets", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
