package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesS3LocationMod.S3Location
import typings.awsSdkClientS3Browser.typesS3LocationMod.UnmarshalledS3Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOutputLocationMod {
  
  trait OutputLocation extends StObject {
    
    /**
      * <p>Describes an S3 location that will receive the results of the restore request.</p>
      */
    var S3: js.UndefOr[S3Location] = js.undefined
  }
  object OutputLocation {
    
    inline def apply(): OutputLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputLocation] (val x: Self) extends AnyVal {
      
      inline def setS3(value: S3Location): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
      
      inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    }
  }
  
  trait UnmarshalledOutputLocation
    extends StObject
       with OutputLocation {
    
    /**
      * <p>Describes an S3 location that will receive the results of the restore request.</p>
      */
    @JSName("S3")
    var S3_UnmarshalledOutputLocation: js.UndefOr[UnmarshalledS3Location] = js.undefined
  }
  object UnmarshalledOutputLocation {
    
    inline def apply(): UnmarshalledOutputLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledOutputLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledOutputLocation] (val x: Self) extends AnyVal {
      
      inline def setS3(value: UnmarshalledS3Location): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
      
      inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    }
  }
}
