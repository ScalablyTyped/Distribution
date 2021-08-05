package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesReplicaDescriptionMod.ReplicaDescription
import typings.awsSdkClientDynamodbBrowser.typesReplicaDescriptionMod.UnmarshalledReplicaDescription
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableDescriptionMod {
  
  trait GlobalTableDescription extends StObject {
    
    /**
      * <p>The creation time of the global table.</p>
      */
    var CreationDateTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>The unique identifier of the global table.</p>
      */
    var GlobalTableArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The global table name.</p>
      */
    var GlobalTableName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The current state of the global table:</p> <ul> <li> <p> <code>CREATING</code> - The global table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global table is ready for use.</p> </li> </ul>
      */
    var GlobalTableStatus: js.UndefOr[CREATING | ACTIVE | DELETING | UPDATING | String] = js.undefined
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    var ReplicationGroup: js.UndefOr[js.Array[ReplicaDescription] | Iterable[ReplicaDescription]] = js.undefined
  }
  object GlobalTableDescription {
    
    inline def apply(): GlobalTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTableDescription]
    }
    
    extension [Self <: GlobalTableDescription](x: Self) {
      
      inline def setCreationDateTime(value: Date | String | Double): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      inline def setGlobalTableArn(value: String): Self = StObject.set(x, "GlobalTableArn", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableArnUndefined: Self = StObject.set(x, "GlobalTableArn", js.undefined)
      
      inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setGlobalTableStatus(value: CREATING | ACTIVE | DELETING | UPDATING | String): Self = StObject.set(x, "GlobalTableStatus", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableStatusUndefined: Self = StObject.set(x, "GlobalTableStatus", js.undefined)
      
      inline def setReplicationGroup(value: js.Array[ReplicaDescription] | Iterable[ReplicaDescription]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: ReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledGlobalTableDescription
    extends StObject
       with GlobalTableDescription {
    
    /**
      * <p>The creation time of the global table.</p>
      */
    @JSName("CreationDateTime")
    var CreationDateTime_UnmarshalledGlobalTableDescription: js.UndefOr[Date] = js.undefined
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    @JSName("ReplicationGroup")
    var ReplicationGroup_UnmarshalledGlobalTableDescription: js.UndefOr[js.Array[UnmarshalledReplicaDescription]] = js.undefined
  }
  object UnmarshalledGlobalTableDescription {
    
    inline def apply(): UnmarshalledGlobalTableDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalTableDescription]
    }
    
    extension [Self <: UnmarshalledGlobalTableDescription](x: Self) {
      
      inline def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
      
      inline def setReplicationGroup(value: js.Array[UnmarshalledReplicaDescription]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: UnmarshalledReplicaDescription*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
}
