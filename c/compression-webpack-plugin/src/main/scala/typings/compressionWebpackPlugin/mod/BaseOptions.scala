package typings.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOptions extends js.Object {
  
  /**
    * Enable file caching
    * ⚠ Ignored in webpack 5! Please use webpack.js.org/configuration/other-options/#cache.
    * @default true
    */
  var cache: js.UndefOr[Boolean | String] = js.native
  
  /**
    * @default false
    */
  var deleteOriginalAssets: js.UndefOr[Boolean] = js.native
  
  /**
    * Exclude all assets matching any of these conditions
    */
  var exclude: js.UndefOr[Rules] = js.native
  
  /**
    * The target asset filename.
    * @default '[path].gz[query]'
    */
  var filename: js.UndefOr[String | FilenameFunction] = js.native
  
  /**
    * Include all assets matching any of these conditions
    */
  var include: js.UndefOr[Rules] = js.native
  
  /**
    * Only assets that compress better than this ratio are processed (minRatio = Compressed Size / Original Size)
    * @default 0.8
    */
  var minRatio: js.UndefOr[Double] = js.native
  
  /**
    * Include all assets that pass test assertion
    */
  var test: js.UndefOr[Rules] = js.native
  
  /**
    * Only assets bigger than this size are processed (in bytes)
    * @default 0
    */
  var threshold: js.UndefOr[Double] = js.native
}
object BaseOptions {
  
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean | String): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setDeleteOriginalAssets(value: Boolean): Self = this.set("deleteOriginalAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteOriginalAssets: Self = this.set("deleteOriginalAssets", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: Rule*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: Rules): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFilenameFunction1(value: /* info */ FileInfo => String): Self = this.set("filename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilename(value: String | FilenameFunction): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: Rule*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: Rules): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMinRatio(value: Double): Self = this.set("minRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRatio: Self = this.set("minRatio", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: Rule*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: Rules): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
