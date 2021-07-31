package typings.detectCharacterEncoding

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(buf: Buffer): Result | Null = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Result | Null]
  
  @JSImport("detect-character-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Result extends StObject {
    
    var confidence: Double
    
    var encoding: String
  }
  object Result {
    
    @scala.inline
    def apply(confidence: Double, encoding: String): Result = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
