package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description extends js.Object {
  
  /** Description for this asset */
  var description: StringDictionary[String] = js.native
  
  /** File object for this asset */
  var file: StringDictionary[ContentType] = js.native
  
  /** Title for this asset */
  var title: StringDictionary[String] = js.native
}
object Description {
  
  @scala.inline
  def apply(
    description: StringDictionary[String],
    file: StringDictionary[ContentType],
    title: StringDictionary[String]
  ): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: StringDictionary[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: StringDictionary[ContentType]): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: StringDictionary[String]): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
