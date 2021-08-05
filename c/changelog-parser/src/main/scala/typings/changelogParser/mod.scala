package typings.changelogParser

import typings.changelogParser.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def apply(options: String, callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  /**
    * Change log parser for node.
    */
  inline def apply(options: PartialOptions): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def apply(
    options: PartialOptions,
    callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]
  ): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  @JSImport("changelog-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  }
  object Options {
    
    inline def apply(filePath: String, removeMarkdown: Boolean): Options = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], removeMarkdown = removeMarkdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setRemoveMarkdown(value: Boolean): Self = StObject.set(x, "removeMarkdown", value.asInstanceOf[js.Any])
    }
  }
}
