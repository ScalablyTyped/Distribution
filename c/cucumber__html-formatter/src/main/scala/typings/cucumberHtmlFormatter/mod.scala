package typings.cucumberHtmlFormatter

import typings.cucumberMessages.mod.Envelope
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/html-formatter", JSImport.Default)
  @js.native
  open class default protected () extends CucumberHtmlStream {
    /**
      * @param cssPath
      * @param jsPath
      */
    def this(cssPath: String, jsPath: String) = this()
  }
  
  @js.native
  trait CucumberHtmlStream extends Transform {
    
    def _transform(envelope: Envelope, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ val cssPath: Any = js.native
    
    /* private */ var firstMessageWritten: Any = js.native
    
    /* private */ val jsPath: Any = js.native
    
    /* private */ var postMessageWritten: Any = js.native
    
    /* private */ var preMessageWritten: Any = js.native
    
    /* private */ var readTemplate: Any = js.native
    
    /* private */ var template: Any = js.native
    
    /* private */ var writeFile: Any = js.native
    
    /* private */ var writeMessage: Any = js.native
    
    /* private */ var writePostMessage: Any = js.native
    
    /* private */ var writePreMessageUnlessAlreadyWritten: Any = js.native
    
    /* private */ var writeTemplateBetween: Any = js.native
  }
}
