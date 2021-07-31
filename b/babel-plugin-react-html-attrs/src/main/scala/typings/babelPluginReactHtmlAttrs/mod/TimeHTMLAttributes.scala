package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var dateTime: js.UndefOr[String] = js.undefined
  
  var datetime: js.UndefOr[String] = js.undefined
}
object TimeHTMLAttributes {
  
  @scala.inline
  def apply[T](): TimeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TimeHTMLAttributesMutableBuilder[Self <: TimeHTMLAttributes[?], T] (val x: Self & TimeHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
