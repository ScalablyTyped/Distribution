package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GLACIER
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransitionMod {
  
  @js.native
  trait Transition extends StObject {
    
    /**
      * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
      */
    var Date: js.UndefOr[typings.std.Date | String | Double] = js.native
    
    /**
      * <p>Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.</p>
      */
    var Days: js.UndefOr[Double] = js.native
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.native
  }
  object Transition {
    
    @scala.inline
    def apply(): Transition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transition]
    }
    
    @scala.inline
    implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date | String | Double): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
      
      @scala.inline
      def setStorageClass(value: GLACIER | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledTransition extends Transition {
    
    /**
      * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
      */
    @JSName("Date")
    var Date_UnmarshalledTransition: js.UndefOr[Date] = js.native
  }
  object UnmarshalledTransition {
    
    @scala.inline
    def apply(): UnmarshalledTransition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTransition]
    }
    
    @scala.inline
    implicit class UnmarshalledTransitionMutableBuilder[Self <: UnmarshalledTransition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    }
  }
}
