package typings.detectCharacterEncoding

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-character-encoding", JSImport.Namespace)
  @js.native
  def apply(buf: Buffer): Result | Null = js.native
  
  @js.native
  trait Result extends StObject {
    
    var confidence: Double = js.native
    
    var encoding: String = js.native
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
