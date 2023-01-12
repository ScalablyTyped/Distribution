package typings.changelogParser

import typings.changelogParser.anon.Body
import typings.changelogParser.anon.PickOptionsfilePath
import typings.changelogParser.anon.PickOptionstext
import typings.changelogParser.changelogParserStrings.filePath
import typings.changelogParser.changelogParserStrings.text
import typings.std.Exclude
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Change log parser for node.
    */
  // The implementation returns a Promise whether or not a callback is specified.
  // This type declaration reflects this.
  inline def apply(
    options: (PickOptionsfilePath & (Partial[Exclude[Options, filePath | text]])) | (PickOptionstext & (Partial[Exclude[Options, filePath | text]]))
  ): js.Promise[Changelog] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Changelog]]
  inline def apply(
    options: (PickOptionsfilePath & (Partial[Exclude[Options, filePath | text]])) | (PickOptionstext & (Partial[Exclude[Options, filePath | text]])),
    callback: js.Function2[/* error */ String | Null, /* result */ Changelog, Unit]
  ): js.Promise[Changelog] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Changelog]]
  inline def apply(options: String): js.Promise[Changelog] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Changelog]]
  inline def apply(options: String, callback: js.Function2[/* error */ String | Null, /* result */ Changelog, Unit]): js.Promise[Changelog] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Changelog]]
  
  @JSImport("changelog-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Changelog extends StObject {
    
    var description: String
    
    var title: String
    
    var versions: js.Array[Body]
  }
  object Changelog {
    
    inline def apply(description: String, title: String, versions: js.Array[Body]): Changelog = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changelog]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Changelog] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: js.Array[Body]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: Body*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Path to changelog file.
      */
    var filePath: String
    
    /**
      * Removes the markdown markup from the changelog entries by default.
      * You can change its value to false to keep the markdown.
      */
    var removeMarkdown: Boolean
    
    /**
      * Text of changelog file (you can use this instead of filePath).
      */
    var text: String
  }
  object Options {
    
    inline def apply(filePath: String, removeMarkdown: Boolean, text: String): Options = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], removeMarkdown = removeMarkdown.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setRemoveMarkdown(value: Boolean): Self = StObject.set(x, "removeMarkdown", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
