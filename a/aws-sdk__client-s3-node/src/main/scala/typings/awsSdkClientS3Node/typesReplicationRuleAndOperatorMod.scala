package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicationRuleAndOperatorMod {
  
  @js.native
  trait ReplicationRuleAndOperator extends StObject {
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.native
    
    /**
      * _TagSet shape
      */
    var Tags: js.UndefOr[js.Array[Tag] | Iterable[Tag]] = js.native
  }
  object ReplicationRuleAndOperator {
    
    @scala.inline
    def apply(): ReplicationRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationRuleAndOperator]
    }
    
    @scala.inline
    implicit class ReplicationRuleAndOperatorMutableBuilder[Self <: ReplicationRuleAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[Tag] | Iterable[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledReplicationRuleAndOperator extends ReplicationRuleAndOperator {
    
    /**
      * _TagSet shape
      */
    @JSName("Tags")
    var Tags_UnmarshalledReplicationRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
  }
  object UnmarshalledReplicationRuleAndOperator {
    
    @scala.inline
    def apply(): UnmarshalledReplicationRuleAndOperator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledReplicationRuleAndOperator]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicationRuleAndOperatorMutableBuilder[Self <: UnmarshalledReplicationRuleAndOperator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    }
  }
}
