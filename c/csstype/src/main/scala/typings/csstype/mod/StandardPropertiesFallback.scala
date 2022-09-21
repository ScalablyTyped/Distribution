package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardPropertiesFallback[TLength, TTime]
  extends StObject
     with StandardLonghandPropertiesFallback[TLength, TTime]
     with StandardShorthandPropertiesFallback[TLength, TTime]
object StandardPropertiesFallback {
  
  inline def apply[TLength, TTime](): StandardPropertiesFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardPropertiesFallback[TLength, TTime]]
  }
}
