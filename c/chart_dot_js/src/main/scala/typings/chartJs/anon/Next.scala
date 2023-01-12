package typings.chartJs.anon

import typings.chartJs.typesHelpersHelpersDotcurveMod.SplinePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  var next: SplinePoint
  
  var previous: SplinePoint
}
object Next {
  
  inline def apply(next: SplinePoint, previous: SplinePoint): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
    
    inline def setNext(value: SplinePoint): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: SplinePoint): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
