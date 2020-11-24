package typings.browserify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options pertaining to an individual file.
  */
@js.native
trait FileOptions extends js.Object {
  
  // Basedir to use to resolve this file's path.
  var basedir: js.UndefOr[String] = js.native
  
  // If true, this is considered an entry point to your app.
  var entry: js.UndefOr[Boolean] = js.native
  
  // Expose this file under a custom dependency name.
  // require('./vendor/angular/angular.js', {expose: 'angular'}) enables require('angular')
  var expose: js.UndefOr[String] = js.native
  
  // Forward file to external() to be externalized.
  var external: js.UndefOr[Boolean] = js.native
  
  // The name/path to the file.
  var file: js.UndefOr[String] = js.native
  
  // The ID to use for require() statements.
  var id: js.UndefOr[String] = js.native
  
  // Disable transforms on file if set to false.
  var transform: js.UndefOr[Boolean] = js.native
}
object FileOptions {
  
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
    
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
    def setEntry(value: Boolean): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setExpose(value: String): Self = this.set("expose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setTransform(value: Boolean): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
