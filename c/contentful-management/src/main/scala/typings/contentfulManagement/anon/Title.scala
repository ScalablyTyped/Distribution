package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var description: StringDictionary[String]
  
  var file: StringDictionary[File]
  
  var title: StringDictionary[String]
}
object Title {
  
  inline def apply(
    description: StringDictionary[String],
    file: StringDictionary[File],
    title: StringDictionary[String]
  ): Title = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setDescription(value: StringDictionary[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFile(value: StringDictionary[File]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: StringDictionary[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
