package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesProgressMod.Progress
import typings.awsSdkClientS3Node.typesProgressMod.UnmarshalledProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProgressEventMod {
  
  trait ProgressEvent extends StObject {
    
    /**
      * <p>The Progress event details.</p>
      */
    var Details: js.UndefOr[Progress] = js.undefined
  }
  object ProgressEvent {
    
    @scala.inline
    def apply(): ProgressEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressEvent]
    }
    
    @scala.inline
    implicit class ProgressEventMutableBuilder[Self <: ProgressEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: Progress): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    }
  }
  
  trait UnmarshalledProgressEvent
    extends StObject
       with ProgressEvent {
    
    /**
      * <p>The Progress event details.</p>
      */
    @JSName("Details")
    var Details_UnmarshalledProgressEvent: js.UndefOr[UnmarshalledProgress] = js.undefined
  }
  object UnmarshalledProgressEvent {
    
    @scala.inline
    def apply(): UnmarshalledProgressEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledProgressEvent]
    }
    
    @scala.inline
    implicit class UnmarshalledProgressEventMutableBuilder[Self <: UnmarshalledProgressEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: UnmarshalledProgress): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    }
  }
}
