package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsDescriptionMod.UnmarshalledReplicaSettingsDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeGlobalTableSettingsOutputMod {
  
  trait DescribeGlobalTableSettingsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The name of the global table.</p>
      */
    var GlobalTableName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The region specific settings for the global table.</p>
      */
    var ReplicaSettings: js.UndefOr[js.Array[UnmarshalledReplicaSettingsDescription]] = js.undefined
  }
  object DescribeGlobalTableSettingsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DescribeGlobalTableSettingsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
    }
    
    @scala.inline
    implicit class DescribeGlobalTableSettingsOutputMutableBuilder[Self <: DescribeGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      @scala.inline
      def setReplicaSettings(value: js.Array[UnmarshalledReplicaSettingsDescription]): Self = StObject.set(x, "ReplicaSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicaSettingsUndefined: Self = StObject.set(x, "ReplicaSettings", js.undefined)
      
      @scala.inline
      def setReplicaSettingsVarargs(value: UnmarshalledReplicaSettingsDescription*): Self = StObject.set(x, "ReplicaSettings", js.Array(value :_*))
    }
  }
}
