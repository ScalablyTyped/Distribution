package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An annotation contains a description of a lint error, detailing the location of the error within the code, the severity of the error,
  * and an explaination as to why the error was thrown.
  */
trait Annotation extends StObject {
  
  var from: Position
  
  var message: js.UndefOr[String] = js.undefined
  
  var severity: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[Position] = js.undefined
}
object Annotation {
  
  @scala.inline
  def apply(from: Position): Annotation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Position): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setTo(value: Position): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
