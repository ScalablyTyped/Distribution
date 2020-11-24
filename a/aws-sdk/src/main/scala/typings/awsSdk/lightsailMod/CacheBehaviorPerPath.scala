package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheBehaviorPerPath extends js.Object {
  
  /**
    * The cache behavior for the specified path. You can specify one of the following per-path cache behaviors:     cache  - This behavior caches the specified path.      dont-cache  - This behavior doesn't cache the specified path.   
    */
  var behavior: js.UndefOr[BehaviorEnum] = js.native
  
  /**
    * The path to a directory or file to cached, or not cache. Use an asterisk symbol to specify wildcard directories (path/to/assets/ *), and file types (*.html, *jpg, *js). Directories and file paths are case-sensitive. Examples:   Specify the following to cache all files in the document root of an Apache web server running on a Lightsail instance.  var/www/html/    Specify the following file to cache only the index page in the document root of an Apache web server.  var/www/html/index.html    Specify the following to cache only the .html files in the document root of an Apache web server.  var/www/html/ *.html    Specify the following to cache only the .jpg, .png, and .gif files in the images sub-directory of the document root of an Apache web server.  var/www/html/images/ *.jpg   var/www/html/images/ *.png   var/www/html/images/ *.gif  Specify the following to cache all files in the images sub-directory of the document root of an Apache web server.  var/www/html/images/   
    */
  var path: js.UndefOr[String] = js.native
}
object CacheBehaviorPerPath {
  
  @scala.inline
  def apply(): CacheBehaviorPerPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheBehaviorPerPath]
  }
  
  @scala.inline
  implicit class CacheBehaviorPerPathOps[Self <: CacheBehaviorPerPath] (val x: Self) extends AnyVal {
    
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
    def setBehavior(value: BehaviorEnum): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
