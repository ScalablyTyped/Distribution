package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  /** Description for this asset */
  var description: StringDictionary[String]
  
  /** File object for this asset */
  var file: StringDictionary[ContentType]
  
  /** Title for this asset */
  var title: StringDictionary[String]
}
object Description {
  
  inline def apply(
    description: StringDictionary[String],
    file: StringDictionary[ContentType],
    title: StringDictionary[String]
  ): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: StringDictionary[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFile(value: StringDictionary[ContentType]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: StringDictionary[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
