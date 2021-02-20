package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBucketOutputMod {
  
  @js.native
  trait CreateBucketOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _Location shape
      */
    var Location: js.UndefOr[String] = js.native
  }
  object CreateBucketOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CreateBucketOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateBucketOutput]
    }
    
    @scala.inline
    implicit class CreateBucketOutputMutableBuilder[Self <: CreateBucketOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    }
  }
}
