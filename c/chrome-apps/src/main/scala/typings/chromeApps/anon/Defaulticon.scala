package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.read_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaulticon extends js.Object {
  
  /** Icon */
  var default_icon: String = js.native
  
  /** What the button will display */
  var default_title: String = js.native
  
  /** ['read'] = read only mode */
  var file_access: js.UndefOr[js.Array[read_ | String]] = js.native
  
  /**
    * To match all files, use 'filesystem:*.*'
    */
  var file_filters: js.Array[String] = js.native
  
  /** Handler id */
  var id: String = js.native
}
object Defaulticon {
  
  @scala.inline
  def apply(default_icon: String, default_title: String, file_filters: js.Array[String], id: String): Defaulticon = {
    val __obj = js.Dynamic.literal(default_icon = default_icon.asInstanceOf[js.Any], default_title = default_title.asInstanceOf[js.Any], file_filters = file_filters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaulticon]
  }
  
  @scala.inline
  implicit class DefaulticonOps[Self <: Defaulticon] (val x: Self) extends AnyVal {
    
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
    def setDefault_icon(value: String): Self = this.set("default_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_title(value: String): Self = this.set("default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_filtersVarargs(value: String*): Self = this.set("file_filters", js.Array(value :_*))
    
    @scala.inline
    def setFile_filters(value: js.Array[String]): Self = this.set("file_filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_accessVarargs(value: (read_ | String)*): Self = this.set("file_access", js.Array(value :_*))
    
    @scala.inline
    def setFile_access(value: js.Array[read_ | String]): Self = this.set("file_access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_access: Self = this.set("file_access", js.undefined)
  }
}
