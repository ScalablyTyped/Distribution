package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange
import typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.UnmarshalledHashKeyRange
import typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange
import typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.UnmarshalledSequenceNumberRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesShardMod {
  
  trait Shard extends StObject {
    
    /**
      * <p>The shard ID of the shard adjacent to the shard's parent.</p>
      */
    var AdjacentParentShardId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
      */
    var HashKeyRange: typings.awsSdkClientKinesisBrowser.typesHashKeyRangeMod.HashKeyRange
    
    /**
      * <p>The shard ID of the shard's parent.</p>
      */
    var ParentShardId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The range of possible sequence numbers for the shard.</p>
      */
    var SequenceNumberRange: typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod.SequenceNumberRange
    
    /**
      * <p>The unique identifier of the shard within the stream.</p>
      */
    var ShardId: String
  }
  object Shard {
    
    inline def apply(HashKeyRange: HashKeyRange, SequenceNumberRange: SequenceNumberRange, ShardId: String): Shard = {
      val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shard]
    }
    
    extension [Self <: Shard](x: Self) {
      
      inline def setAdjacentParentShardId(value: String): Self = StObject.set(x, "AdjacentParentShardId", value.asInstanceOf[js.Any])
      
      inline def setAdjacentParentShardIdUndefined: Self = StObject.set(x, "AdjacentParentShardId", js.undefined)
      
      inline def setHashKeyRange(value: HashKeyRange): Self = StObject.set(x, "HashKeyRange", value.asInstanceOf[js.Any])
      
      inline def setParentShardId(value: String): Self = StObject.set(x, "ParentShardId", value.asInstanceOf[js.Any])
      
      inline def setParentShardIdUndefined: Self = StObject.set(x, "ParentShardId", js.undefined)
      
      inline def setSequenceNumberRange(value: SequenceNumberRange): Self = StObject.set(x, "SequenceNumberRange", value.asInstanceOf[js.Any])
      
      inline def setShardId(value: String): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledShard
    extends StObject
       with Shard {
    
    /**
      * <p>The range of possible hash key values for the shard, which is a set of ordered contiguous positive integers.</p>
      */
    @JSName("HashKeyRange")
    var HashKeyRange_UnmarshalledShard: UnmarshalledHashKeyRange
    
    /**
      * <p>The range of possible sequence numbers for the shard.</p>
      */
    @JSName("SequenceNumberRange")
    var SequenceNumberRange_UnmarshalledShard: UnmarshalledSequenceNumberRange
  }
  object UnmarshalledShard {
    
    inline def apply(
      HashKeyRange: UnmarshalledHashKeyRange,
      SequenceNumberRange: UnmarshalledSequenceNumberRange,
      ShardId: String
    ): UnmarshalledShard = {
      val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], SequenceNumberRange = SequenceNumberRange.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledShard]
    }
    
    extension [Self <: UnmarshalledShard](x: Self) {
      
      inline def setHashKeyRange(value: UnmarshalledHashKeyRange): Self = StObject.set(x, "HashKeyRange", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumberRange(value: UnmarshalledSequenceNumberRange): Self = StObject.set(x, "SequenceNumberRange", value.asInstanceOf[js.Any])
    }
  }
}
