package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesReplicaMod.Replica
import typings.awsSdkClientDynamodbBrowser.typesReplicaMod.UnmarshalledReplica
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
    var ReplicationGroup: js.UndefOr[js.Array[Replica] | js.Iterable[Replica]] = js.undefined
  }
  object GlobalTable {
    
    inline def apply(): GlobalTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalTable] (val x: Self) extends AnyVal {
      
      inline def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      inline def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      inline def setReplicationGroup(value: js.Array[Replica] | js.Iterable[Replica]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledGlobalTable] (val x: Self) extends AnyVal {
      
      inline def setReplicationGroup(value: js.Array[UnmarshalledReplica]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      inline def setReplicationGroupVarargs(value: UnmarshalledReplica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value*))
    }
  }
}
