package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Title extends StObject {
  
  var description: StringDictionary[String] = js.native
  
  var file: StringDictionary[File] = js.native
  
  var title: StringDictionary[String] = js.native
}
object Title {
  
  @scala.inline
  def apply(
    description: StringDictionary[String],
    file: StringDictionary[File],
    title: StringDictionary[String]
  ): Title = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: StringDictionary[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: StringDictionary[File]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: StringDictionary[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
