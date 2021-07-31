package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetsFilter extends StObject {
  
  /**
    * The name of the attribute you want to use to filter the returned targets.
    */
  var Name: ListTargetsFilterName
  
  /**
    * The value of the attribute you want to use to filter the returned targets. For example, if you specify SNS for the Target type, you could specify an Amazon Resource Name (ARN) for a topic as the value.
    */
  var Value: ListTargetsFilterValue
}
object ListTargetsFilter {
  
  @scala.inline
  def apply(Name: ListTargetsFilterName, Value: ListTargetsFilterValue): ListTargetsFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsFilter]
  }
  
  @scala.inline
  implicit class ListTargetsFilterMutableBuilder[Self <: ListTargetsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ListTargetsFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ListTargetsFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
