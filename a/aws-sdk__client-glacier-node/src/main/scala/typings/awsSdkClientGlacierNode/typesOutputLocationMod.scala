package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesS3LocationMod.S3Location
import typings.awsSdkClientGlacierNode.typesS3LocationMod.UnmarshalledS3Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputLocationMod {
  
  @js.native
  trait OutputLocation extends StObject {
    
    /**
      * <p>Describes an S3 location that will receive the results of the job request.</p>
      */
    var S3: js.UndefOr[S3Location] = js.native
  }
  object OutputLocation {
    
    @scala.inline
    def apply(): OutputLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputLocation]
    }
    
    @scala.inline
    implicit class OutputLocationMutableBuilder[Self <: OutputLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3(value: S3Location): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledOutputLocation extends OutputLocation {
    
    /**
      * <p>Describes an S3 location that will receive the results of the job request.</p>
      */
    @JSName("S3")
    var S3_UnmarshalledOutputLocation: js.UndefOr[UnmarshalledS3Location] = js.native
  }
  object UnmarshalledOutputLocation {
    
    @scala.inline
    def apply(): UnmarshalledOutputLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledOutputLocation]
    }
    
    @scala.inline
    implicit class UnmarshalledOutputLocationMutableBuilder[Self <: UnmarshalledOutputLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3(value: UnmarshalledS3Location): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    }
  }
}
