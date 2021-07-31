package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddPermissionOutputMod {
  
  trait AddPermissionOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The permission statement you specified in the request. The response returns the same as a string using a backslash ("\") as an escape character in the JSON.</p>
      */
    var Statement: js.UndefOr[String] = js.undefined
  }
  object AddPermissionOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): AddPermissionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPermissionOutput]
    }
    
    @scala.inline
    implicit class AddPermissionOutputMutableBuilder[Self <: AddPermissionOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
    }
  }
}
