package typings.cssElementQueries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-element-queries/src/ElementQueries", JSImport.Namespace)
@js.native
object elementQueriesMod extends js.Object {
  
  @js.native
  class ElementQueries () extends js.Object
  /* static members */
  @js.native
  object ElementQueries extends js.Object {
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    def init(): Unit = js.native
    
    /**
      * Attaches to DOMLoadContent
      */
    def listen(): Unit = js.native
  }
  
  @js.native
  class default () extends ElementQueries
  /* static members */
  @js.native
  object default extends js.Object {
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    def init(): Unit = js.native
    
    /**
      * Attaches to DOMLoadContent
      */
    def listen(): Unit = js.native
  }
}
