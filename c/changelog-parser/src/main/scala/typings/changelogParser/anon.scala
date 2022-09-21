package typings.changelogParser

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: String
    
    var date: String | Null
    
    var parsed: Record[String, js.Array[String]]
    
    var title: String
    
    var version: String | Null
  }
  object Body {
    
    inline def apply(body: String, parsed: Record[String, js.Array[String]], title: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], date = null, version = null)
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateNull: Self = StObject.set(x, "date", null)
      
      inline def setParsed(value: Record[String, js.Array[String]]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
  
  /* Inlined std.Pick<changelog-parser.changelog-parser.Options, 'filePath'> */
  trait PickOptionsfilePath extends StObject {
    
    var filePath: String
  }
  object PickOptionsfilePath {
    
    inline def apply(filePath: String): PickOptionsfilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickOptionsfilePath]
    }
    
    extension [Self <: PickOptionsfilePath](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<changelog-parser.changelog-parser.Options, 'text'> */
  trait PickOptionstext extends StObject {
    
    var text: String
  }
  object PickOptionstext {
    
    inline def apply(text: String): PickOptionstext = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickOptionstext]
    }
    
    extension [Self <: PickOptionstext](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
