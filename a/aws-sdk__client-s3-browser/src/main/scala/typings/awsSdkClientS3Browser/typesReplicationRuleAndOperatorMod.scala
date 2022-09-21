package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicationRuleAndOperatorMod {
  
  trait ReplicationRuleAndOperator extends StObject {
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * _TagSet shape
      */
    var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.undefined
  }
  object ReplicationRuleAndOperator {
    
    inline def apply(): ReplicationRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationRuleAndOperator]
    }
    
    extension [Self <: ReplicationRuleAndOperator](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      inline def setTags(value: js.Array[Tag] | js.Iterable[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
  
  trait UnmarshalledReplicationRuleAndOperator
    extends StObject
       with ReplicationRuleAndOperator {
    
    /**
      * _TagSet shape
      */
    @JSName("Tags")
    var Tags_UnmarshalledReplicationRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
  }
  object UnmarshalledReplicationRuleAndOperator {
    
    inline def apply(): UnmarshalledReplicationRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledReplicationRuleAndOperator]
    }
    
    extension [Self <: UnmarshalledReplicationRuleAndOperator](x: Self) {
      
      inline def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value*))
    }
  }
}
