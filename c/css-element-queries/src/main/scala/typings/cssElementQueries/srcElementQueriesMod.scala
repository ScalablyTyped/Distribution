package typings.cssElementQueries

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcElementQueriesMod {
  
  @JSImport("css-element-queries/src/ElementQueries", JSImport.Default)
  @js.native
  open class default () extends ElementQueries
  /* static members */
  object default {
    
    @JSImport("css-element-queries/src/ElementQueries", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    
    /**
      * Attaches to DOMLoadContent
      */
    inline def listen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[Unit]
  }
  
  @JSImport("css-element-queries/src/ElementQueries", "ElementQueries")
  @js.native
  open class ElementQueries () extends StObject
  /* static members */
  object ElementQueries {
    
    @JSImport("css-element-queries/src/ElementQueries", "ElementQueries")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses all available CSS and attach ResizeSensor to those elements which have rules attached.
      * Make sure this is called after 'load' event, because CSS files are not ready when domReady is fired.
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    
    /**
      * Attaches to DOMLoadContent
      */
    inline def listen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[Unit]
  }
}
