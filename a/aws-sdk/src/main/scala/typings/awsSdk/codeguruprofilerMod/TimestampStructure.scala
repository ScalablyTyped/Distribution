package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampStructure extends StObject {
  
  /**
    *  A Timestamp. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var value: Timestamp
}
object TimestampStructure {
  
  @scala.inline
  def apply(value: Timestamp): TimestampStructure = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampStructure]
  }
  
  @scala.inline
  implicit class TimestampStructureMutableBuilder[Self <: TimestampStructure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Timestamp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
