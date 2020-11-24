package typings.browserPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Used if opts.preludePath is undefined, this is used to resolve the prelude.js file location, default: 'process.cwd()'
    */
  var basedir: js.UndefOr[String] = js.native
  
  /**
    * A string to use in place of 'require' if opts.hasExports is specified, default is 'require'
    */
  var externalRequireName: js.UndefOr[String] = js.native
  
  /**
    * Whether the bundle should include require= (or the opts.externalRequireName) so that
    * require() is available outside the bundle
    */
  var hasExports: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a custom prelude, but know what you're doing first. See the prelude.js file in
    * this repo for the default prelude. If you specify a custom prelude, you must also specify
    * a valid opts.preludePath to the prelude source file for sourcemaps to work
    */
  var prelude: js.UndefOr[String] = js.native
  
  /**
    * prelude.js path if a custom opts.prelude is specified
    */
  var preludePath: js.UndefOr[String] = js.native
  
  /**
    * If given, the writable end of the stream will expect objects to be written to
    * it instead of expecting a stream of json text it will need to parse, default false
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * If given and source maps are computed, the opts.sourceMapPrefix string will be used instead of default: '//#'
    */
  var sourceMapPrefix: js.UndefOr[String] = js.native
  
  /**
    * If given and source maps are computed, the root for the output source map will be defined. (default is no root)
    */
  var sourceRoot: js.UndefOr[String] = js.native
  
  /**
    * External string name to use for UMD, if not provided, UMD declaration is not wrapped around output
    */
  var standalone: js.UndefOr[String] = js.native
  
  /**
    * Sets the internal module name to export for standalone
    */
  var standaloneModule: js.UndefOr[String] = js.native
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
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
    
    @scala.inline
    def setExternalRequireName(value: String): Self = this.set("externalRequireName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalRequireName: Self = this.set("externalRequireName", js.undefined)
    
    @scala.inline
    def setHasExports(value: Boolean): Self = this.set("hasExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasExports: Self = this.set("hasExports", js.undefined)
    
    @scala.inline
    def setPrelude(value: String): Self = this.set("prelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrelude: Self = this.set("prelude", js.undefined)
    
    @scala.inline
    def setPreludePath(value: String): Self = this.set("preludePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreludePath: Self = this.set("preludePath", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSourceMapPrefix(value: String): Self = this.set("sourceMapPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapPrefix: Self = this.set("sourceMapPrefix", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    
    @scala.inline
    def setStandalone(value: String): Self = this.set("standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
    
    @scala.inline
    def setStandaloneModule(value: String): Self = this.set("standaloneModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandaloneModule: Self = this.set("standaloneModule", js.undefined)
  }
}
