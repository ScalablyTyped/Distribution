package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionValueList extends StObject {
  
  /**
    * The list of values.
    */
  var Values: ValueStringList
}
object PartitionValueList {
  
  @scala.inline
  def apply(Values: ValueStringList): PartitionValueList = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionValueList]
  }
  
  @scala.inline
  implicit class PartitionValueListMutableBuilder[Self <: PartitionValueList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ValueString*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
