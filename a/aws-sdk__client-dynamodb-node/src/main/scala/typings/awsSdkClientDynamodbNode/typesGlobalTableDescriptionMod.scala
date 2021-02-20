package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesReplicaDescriptionMod.ReplicaDescription
import typings.awsSdkClientDynamodbNode.typesReplicaDescriptionMod.UnmarshalledReplicaDescription
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableDescriptionMod {
  
  @js.native
  trait GlobalTableDescription extends StObject {
    
    /**
      * <p>The creation time of the global table.</p>
      */
    var CreationDateTime: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>The unique identifier of the global table.</p>
      */
    var GlobalTableArn: js.UndefOr[String] = js.native
    
    /**
      * <p>The global table name.</p>
      */
    var GlobalTableName: js.UndefOr[String] = js.native
    
    /**
      * <p>The current state of the global table:</p> <ul> <li> <p> <code>CREATING</code> - The global table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global table is ready for use.</p> </li> </ul>
      */
    var GlobalTableStatus: js.UndefOr[CREATING | ACTIVE | DELETING | UPDATING | String] = js.native
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    var ReplicationGroup: js.UndefOr[js.Array[ReplicaDescription] | Iterable[ReplicaDescription]] = js.native
  }
  object GlobalTableDescription {
    
    @scala.inline
    def apply(): GlobalTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableDescription]
    }
    
    @scala.inline
    implicit class GlobalTableDescriptionMutableBuilder[Self <: GlobalTableDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDateTime(value: Date | String | Double): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      @scala.inline
      def setGlobalTableArn(value: String): Self = StObject.set(x, "GlobalTableArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableArnUndefined: Self = StObject.set(x, "GlobalTableArn", js.undefined)
      
      @scala.inline
      def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      @scala.inline
      def setGlobalTableStatus(value: CREATING | ACTIVE | DELETING | UPDATING | String): Self = StObject.set(x, "GlobalTableStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableStatusUndefined: Self = StObject.set(x, "GlobalTableStatus", js.undefined)
      
      @scala.inline
      def setReplicationGroup(value: js.Array[ReplicaDescription] | Iterable[ReplicaDescription]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      @scala.inline
      def setReplicationGroupVarargs(value: ReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledGlobalTableDescription extends GlobalTableDescription {
    
    /**
      * <p>The creation time of the global table.</p>
      */
    @JSName("CreationDateTime")
    var CreationDateTime_UnmarshalledGlobalTableDescription: js.UndefOr[Date] = js.native
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    @JSName("ReplicationGroup")
    var ReplicationGroup_UnmarshalledGlobalTableDescription: js.UndefOr[js.Array[UnmarshalledReplicaDescription]] = js.native
  }
  object UnmarshalledGlobalTableDescription {
    
    @scala.inline
    def apply(): UnmarshalledGlobalTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalTableDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledGlobalTableDescriptionMutableBuilder[Self <: UnmarshalledGlobalTableDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      @scala.inline
      def setReplicationGroup(value: js.Array[UnmarshalledReplicaDescription]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      @scala.inline
      def setReplicationGroupVarargs(value: UnmarshalledReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
}
