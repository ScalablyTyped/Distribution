package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorProperties extends ComponentProperties {
  
  /**
    * The content inside the text editor
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The languge mode for this text editor. The language mode is SQL by default.
    */
  var languageMode: js.UndefOr[String] = js.native
  
  /**
    * Minimum height for editor component
    */
  var minimumHeight: js.UndefOr[Double] = js.native
}
object EditorProperties {
  
  @scala.inline
  def apply(): EditorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProperties]
  }
  
  @scala.inline
  implicit class EditorPropertiesOps[Self <: EditorProperties] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setLanguageMode(value: String): Self = this.set("languageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageMode: Self = this.set("languageMode", js.undefined)
    
    @scala.inline
    def setMinimumHeight(value: Double): Self = this.set("minimumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumHeight: Self = this.set("minimumHeight", js.undefined)
  }
}
