package typings.changelogParser

import typings.changelogParser.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("changelog-parser", JSImport.Namespace)
  @js.native
  def apply(options: String): js.Promise[js.Object] = js.native
  @JSImport("changelog-parser", JSImport.Namespace)
  @js.native
  def apply(options: String, callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]): js.Promise[js.Object] = js.native
  /**
    * Change log parser for node.
    */
  @JSImport("changelog-parser", JSImport.Namespace)
  @js.native
  def apply(options: PartialOptions): js.Promise[js.Object] = js.native
  @JSImport("changelog-parser", JSImport.Namespace)
  @js.native
  def apply(
    options: PartialOptions,
    callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]
  ): js.Promise[js.Object] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Path to changelog file.
      */
    var filePath: String = js.native
    
    /**
      * Removes the markdown markup from the changelog entries by default.
      * You can change its value to false to keep the markdown.
      */
    var removeMarkdown: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(filePath: String, removeMarkdown: Boolean): Options = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], removeMarkdown = removeMarkdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveMarkdown(value: Boolean): Self = StObject.set(x, "removeMarkdown", value.asInstanceOf[js.Any])
    }
  }
}
