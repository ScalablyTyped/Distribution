package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesReplicaMod.Replica
import typings.awsSdkClientDynamodbNode.typesReplicaMod.UnmarshalledReplica
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalTableMod {
  
  @js.native
  trait GlobalTable extends StObject {
    
    /**
      * <p>The global table name.</p>
      */
    var GlobalTableName: js.UndefOr[String] = js.native
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    var ReplicationGroup: js.UndefOr[js.Array[Replica] | Iterable[Replica]] = js.native
  }
  object GlobalTable {
    
    @scala.inline
    def apply(): GlobalTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTable]
    }
    
    @scala.inline
    implicit class GlobalTableMutableBuilder[Self <: GlobalTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTableName(value: String): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableNameUndefined: Self = StObject.set(x, "GlobalTableName", js.undefined)
      
      @scala.inline
      def setReplicationGroup(value: js.Array[Replica] | Iterable[Replica]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      @scala.inline
      def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledGlobalTable extends GlobalTable {
    
    /**
      * <p>The regions where the global table has replicas.</p>
      */
    @JSName("ReplicationGroup")
    var ReplicationGroup_UnmarshalledGlobalTable: js.UndefOr[js.Array[UnmarshalledReplica]] = js.native
  }
  object UnmarshalledGlobalTable {
    
    @scala.inline
    def apply(): UnmarshalledGlobalTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGlobalTable]
    }
    
    @scala.inline
    implicit class UnmarshalledGlobalTableMutableBuilder[Self <: UnmarshalledGlobalTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplicationGroup(value: js.Array[UnmarshalledReplica]): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
      
      @scala.inline
      def setReplicationGroupVarargs(value: UnmarshalledReplica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
    }
  }
}
