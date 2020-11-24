package typings.browserResolve.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opts extends js.Object {
  
  /**
    * directory to begin resolving from
    */
  var basedir: js.UndefOr[String] = js.native
  
  /**
    * the 'browser' property to use from package.json
    * @default 'browser'
    */
  var browser: js.UndefOr[String] = js.native
  
  /**
    * the calling filename where the require() call originated (in the source)
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * modules object with id to path mappings to consult before doing manual resolution
    * (use to provide core modules)
    */
  var modules: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * transform the parsed package.json contents before looking at the main field
    */
  var packageFilter: js.UndefOr[js.Function2[/* info */ js.Any, /* pkgdir */ String, _]] = js.native
  
  /**
    * require.paths array to use if nothing is found on the normal node_modules recursive walk
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
}
object Opts {
  
  @scala.inline
  def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: String): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setModules(value: StringDictionary[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setPackageFilter(value: (/* info */ js.Any, /* pkgdir */ String) => _): Self = this.set("packageFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePackageFilter: Self = this.set("packageFilter", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
}
