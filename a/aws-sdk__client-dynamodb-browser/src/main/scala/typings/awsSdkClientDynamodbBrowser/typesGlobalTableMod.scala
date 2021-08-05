package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesReplicaMod.Replica
import typings.awsSdkClientDynamodbBrowser.typesReplicaMod.UnmarshalledReplica
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableMod {
  
  trait GlobalTable extends StObject {
    
    /**
      * <p>The global table name.</p>
      */
    var GlobalTableName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    var ReplicationGroup: js.UndefOr[js.Array[Replica] | Iterable[Replica]] = js.undefined
  }
  object GlobalTable {
    
    inline def apply(): GlobalTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTable]
    }
    
    extension [Self <: GlobalTable](x: Self) {
      
      inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setReplicationGroup(value: js.Array[Replica] | Iterable[Replica]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledGlobalTable
    extends StObject
       with GlobalTable {
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    @JSName("ReplicationGroup")
    var ReplicationGroup_UnmarshalledGlobalTable: js.UndefOr[js.Array[UnmarshalledReplica]] = js.undefined
  }
  object UnmarshalledGlobalTable {
    
    inline def apply(): UnmarshalledGlobalTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalTable]
    }
    
    extension [Self <: UnmarshalledGlobalTable](x: Self) {
      
      inline def setReplicationGroup(value: js.Array[UnmarshalledReplica]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: UnmarshalledReplica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
}
