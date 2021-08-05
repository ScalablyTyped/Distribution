package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStartingPositionMod {
  
  trait StartingPosition extends StObject {
    
    /**
      * _SequenceNumber shape
      */
    var SequenceNumber: js.UndefOr[String] = js.undefined
    
    /**
      * _Timestamp shape
      */
    var Timestamp: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * _ShardIteratorType shape
      */
    var Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String
  }
  object StartingPosition {
    
    inline def apply(Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): StartingPosition = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartingPosition]
    }
    
    extension [Self <: StartingPosition](x: Self) {
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
      
      inline def setTimestamp(value: Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
      
      inline def setType(value: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledStartingPosition
    extends StObject
       with StartingPosition {
    
    /**
      * _Timestamp shape
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledStartingPosition: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledStartingPosition {
    
    inline def apply(Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String): UnmarshalledStartingPosition = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledStartingPosition]
    }
    
    extension [Self <: UnmarshalledStartingPosition](x: Self) {
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    }
  }
}
