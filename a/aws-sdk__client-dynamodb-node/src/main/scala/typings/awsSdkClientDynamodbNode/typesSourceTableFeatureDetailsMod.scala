package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.GlobalSecondaryIndexInfo
import typings.awsSdkClientDynamodbNode.typesGlobalSecondaryIndexInfoMod.UnmarshalledGlobalSecondaryIndexInfo
import typings.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.LocalSecondaryIndexInfo
import typings.awsSdkClientDynamodbNode.typesLocalSecondaryIndexInfoMod.UnmarshalledLocalSecondaryIndexInfo
import typings.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription
import typings.awsSdkClientDynamodbNode.typesSsedescriptionMod.UnmarshalledSSEDescription
import typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.StreamSpecification
import typings.awsSdkClientDynamodbNode.typesStreamSpecificationMod.UnmarshalledStreamSpecification
import typings.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
import typings.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceTableFeatureDetailsMod {
  
  trait SourceTableFeatureDetails extends StObject {
    
    /**
      * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
      */
    var GlobalSecondaryIndexes: js.UndefOr[js.Array[GlobalSecondaryIndexInfo] | Iterable[GlobalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
      */
    var LocalSecondaryIndexes: js.UndefOr[js.Array[LocalSecondaryIndexInfo] | Iterable[LocalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>The description of the server-side encryption status on the table when the backup was created.</p>
      */
    var SSEDescription: js.UndefOr[typings.awsSdkClientDynamodbNode.typesSsedescriptionMod.SSEDescription] = js.undefined
    
    /**
      * <p>Stream settings on the table when the backup was created.</p>
      */
    var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
    
    /**
      * <p>Time to Live settings on the table when the backup was created.</p>
      */
    var TimeToLiveDescription: js.UndefOr[
        typings.awsSdkClientDynamodbNode.typesTimeToLiveDescriptionMod.TimeToLiveDescription
      ] = js.undefined
  }
  object SourceTableFeatureDetails {
    
    @scala.inline
    def apply(): SourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceTableFeatureDetails]
    }
    
    @scala.inline
    implicit class SourceTableFeatureDetailsMutableBuilder[Self <: SourceTableFeatureDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[GlobalSecondaryIndexInfo] | Iterable[GlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[LocalSecondaryIndexInfo] | Iterable[LocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamDescription(value: StreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      @scala.inline
      def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
  
  trait UnmarshalledSourceTableFeatureDetails
    extends StObject
       with SourceTableFeatureDetails {
    
    /**
      * <p>Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. </p>
      */
    @JSName("GlobalSecondaryIndexes")
    var GlobalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledGlobalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. </p>
      */
    @JSName("LocalSecondaryIndexes")
    var LocalSecondaryIndexes_UnmarshalledSourceTableFeatureDetails: js.UndefOr[js.Array[UnmarshalledLocalSecondaryIndexInfo]] = js.undefined
    
    /**
      * <p>The description of the server-side encryption status on the table when the backup was created.</p>
      */
    @JSName("SSEDescription")
    var SSEDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledSSEDescription] = js.undefined
    
    /**
      * <p>Stream settings on the table when the backup was created.</p>
      */
    @JSName("StreamDescription")
    var StreamDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledStreamSpecification] = js.undefined
    
    /**
      * <p>Time to Live settings on the table when the backup was created.</p>
      */
    @JSName("TimeToLiveDescription")
    var TimeToLiveDescription_UnmarshalledSourceTableFeatureDetails: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.undefined
  }
  object UnmarshalledSourceTableFeatureDetails {
    
    @scala.inline
    def apply(): UnmarshalledSourceTableFeatureDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSourceTableFeatureDetails]
    }
    
    @scala.inline
    implicit class UnmarshalledSourceTableFeatureDetailsMutableBuilder[Self <: UnmarshalledSourceTableFeatureDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalSecondaryIndexes(value: js.Array[UnmarshalledGlobalSecondaryIndexInfo]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setGlobalSecondaryIndexesVarargs(value: UnmarshalledGlobalSecondaryIndexInfo*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setLocalSecondaryIndexes(value: js.Array[UnmarshalledLocalSecondaryIndexInfo]): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
      
      @scala.inline
      def setLocalSecondaryIndexesVarargs(value: UnmarshalledLocalSecondaryIndexInfo*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
      
      @scala.inline
      def setSSEDescription(value: UnmarshalledSSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
      
      @scala.inline
      def setStreamDescription(value: UnmarshalledStreamSpecification): Self = StObject.set(x, "StreamDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamDescriptionUndefined: Self = StObject.set(x, "StreamDescription", js.undefined)
      
      @scala.inline
      def setTimeToLiveDescription(value: UnmarshalledTimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
}
