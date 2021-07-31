package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent
import typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.UnmarshalledSubscribeToShardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubscribeToShardEventStreamMod {
  
  trait SubscribeToShardEventStream extends StObject {
    
    /**
      * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
      */
    var SubscribeToShardEvent: typings.awsSdkClientKinesisBrowser.typesSubscribeToShardEventMod.SubscribeToShardEvent
  }
  object SubscribeToShardEventStream {
    
    @scala.inline
    def apply(SubscribeToShardEvent: SubscribeToShardEvent): SubscribeToShardEventStream = {
      val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeToShardEventStream]
    }
    
    @scala.inline
    implicit class SubscribeToShardEventStreamMutableBuilder[Self <: SubscribeToShardEventStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscribeToShardEvent(value: SubscribeToShardEvent): Self = StObject.set(x, "SubscribeToShardEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledSubscribeToShardEventStream
    extends StObject
       with SubscribeToShardEventStream {
    
    /**
      * <p>After you call <a>SubscribeToShard</a>, Kinesis Data Streams sends events of this type to your consumer. </p>
      */
    @JSName("SubscribeToShardEvent")
    var SubscribeToShardEvent_UnmarshalledSubscribeToShardEventStream: UnmarshalledSubscribeToShardEvent
  }
  object UnmarshalledSubscribeToShardEventStream {
    
    @scala.inline
    def apply(SubscribeToShardEvent: UnmarshalledSubscribeToShardEvent): UnmarshalledSubscribeToShardEventStream = {
      val __obj = js.Dynamic.literal(SubscribeToShardEvent = SubscribeToShardEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSubscribeToShardEventStream]
    }
    
    @scala.inline
    implicit class UnmarshalledSubscribeToShardEventStreamMutableBuilder[Self <: UnmarshalledSubscribeToShardEventStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscribeToShardEvent(value: UnmarshalledSubscribeToShardEvent): Self = StObject.set(x, "SubscribeToShardEvent", value.asInstanceOf[js.Any])
    }
  }
}
