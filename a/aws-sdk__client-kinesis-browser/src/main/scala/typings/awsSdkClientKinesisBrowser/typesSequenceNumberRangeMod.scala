package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSequenceNumberRangeMod {
  
  trait SequenceNumberRange extends StObject {
    
    /**
      * <p>The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of <code>null</code>.</p>
      */
    var EndingSequenceNumber: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The starting sequence number for the range.</p>
      */
    var StartingSequenceNumber: String
  }
  object SequenceNumberRange {
    
    inline def apply(StartingSequenceNumber: String): SequenceNumberRange = {
      val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[SequenceNumberRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SequenceNumberRange] (val x: Self) extends AnyVal {
      
      inline def setEndingSequenceNumber(value: String): Self = StObject.set(x, "EndingSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setEndingSequenceNumberUndefined: Self = StObject.set(x, "EndingSequenceNumber", js.undefined)
      
      inline def setStartingSequenceNumber(value: String): Self = StObject.set(x, "StartingSequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledSequenceNumberRange = SequenceNumberRange
}
