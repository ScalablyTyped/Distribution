package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConsumerDescriptionMod {
  
  trait ConsumerDescription extends StObject {
    
    /**
      * <p>When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call <a>SubscribeToShard</a>.</p> <p>If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.</p>
      */
    var ConsumerARN: String
    
    /**
      * <p/>
      */
    var ConsumerCreationTimestamp: js.Date | String | Double
    
    /**
      * <p>The name of the consumer is something you choose when you register the consumer.</p>
      */
    var ConsumerName: String
    
    /**
      * <p>A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.</p>
      */
    var ConsumerStatus: CREATING | DELETING | ACTIVE | String
    
    /**
      * <p>The ARN of the stream with which you registered the consumer.</p>
      */
    var StreamARN: String
  }
  object ConsumerDescription {
    
    inline def apply(
      ConsumerARN: String,
      ConsumerCreationTimestamp: js.Date | String | Double,
      ConsumerName: String,
      ConsumerStatus: CREATING | DELETING | ACTIVE | String,
      StreamARN: String
    ): ConsumerDescription = {
      val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerDescription]
    }
    
    extension [Self <: ConsumerDescription](x: Self) {
      
      inline def setConsumerARN(value: String): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
      
      inline def setConsumerCreationTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
      
      inline def setConsumerName(value: String): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
      
      inline def setConsumerStatus(value: CREATING | DELETING | ACTIVE | String): Self = StObject.set(x, "ConsumerStatus", value.asInstanceOf[js.Any])
      
      inline def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledConsumerDescription
    extends StObject
       with ConsumerDescription {
    
    /**
      * <p/>
      */
    @JSName("ConsumerCreationTimestamp")
    var ConsumerCreationTimestamp_UnmarshalledConsumerDescription: js.Date
  }
  object UnmarshalledConsumerDescription {
    
    inline def apply(
      ConsumerARN: String,
      ConsumerCreationTimestamp: js.Date,
      ConsumerName: String,
      ConsumerStatus: CREATING | DELETING | ACTIVE | String,
      StreamARN: String
    ): UnmarshalledConsumerDescription = {
      val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledConsumerDescription]
    }
    
    extension [Self <: UnmarshalledConsumerDescription](x: Self) {
      
      inline def setConsumerCreationTimestamp(value: js.Date): Self = StObject.set(x, "ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
