package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConsumerMod {
  
  trait Consumer extends StObject {
    
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
  }
  object Consumer {
    
    inline def apply(
      ConsumerARN: String,
      ConsumerCreationTimestamp: js.Date | String | Double,
      ConsumerName: String,
      ConsumerStatus: CREATING | DELETING | ACTIVE | String
    ): Consumer = {
      val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Consumer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Consumer] (val x: Self) extends AnyVal {
      
      inline def setConsumerARN(value: String): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
      
      inline def setConsumerCreationTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
      
      inline def setConsumerName(value: String): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
      
      inline def setConsumerStatus(value: CREATING | DELETING | ACTIVE | String): Self = StObject.set(x, "ConsumerStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledConsumer
    extends StObject
       with Consumer {
    
    /**
      * <p/>
      */
    @JSName("ConsumerCreationTimestamp")
    var ConsumerCreationTimestamp_UnmarshalledConsumer: js.Date
  }
  object UnmarshalledConsumer {
    
    inline def apply(
      ConsumerARN: String,
      ConsumerCreationTimestamp: js.Date,
      ConsumerName: String,
      ConsumerStatus: CREATING | DELETING | ACTIVE | String
    ): UnmarshalledConsumer = {
      val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledConsumer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledConsumer] (val x: Self) extends AnyVal {
      
      inline def setConsumerCreationTimestamp(value: js.Date): Self = StObject.set(x, "ConsumerCreationTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
