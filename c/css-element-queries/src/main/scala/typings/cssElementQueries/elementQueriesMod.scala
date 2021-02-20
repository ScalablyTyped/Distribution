package typings.cssElementQueries

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementQueriesMod {
  
  @JSImport("css-element-queries/src/ElementQueries", JSImport.Default)
  @js.native
  class default () extends ElementQueries
  /* static members */
  object default {
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    @JSImport("css-element-queries/src/ElementQueries", "default.init")
    @js.native
    def init(): Unit = js.native
    
    /**
      * Attaches to DOMLoadContent
      */
    @JSImport("css-element-queries/src/ElementQueries", "default.listen")
    @js.native
    def listen(): Unit = js.native
  }
  
  @JSImport("css-element-queries/src/ElementQueries", "ElementQueries")
  @js.native
  class ElementQueries () extends StObject
  /* static members */
  object ElementQueries {
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    @JSImport("css-element-queries/src/ElementQueries", "ElementQueries.init")
    @js.native
    def init(): Unit = js.native
    
    /**
      * Attaches to DOMLoadContent
      */
    @JSImport("css-element-queries/src/ElementQueries", "ElementQueries.listen")
    @js.native
    def listen(): Unit = js.native
  }
}
