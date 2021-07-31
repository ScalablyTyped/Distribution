package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod.ReplicationRuleAndOperator
import typings.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod.UnmarshalledReplicationRuleAndOperator
import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicationRuleFilterMod {
  
  trait ReplicationRuleFilter extends StObject {
    
    /**
      * <p>Container for specifying rule filters. These filters determine the subset of objects to which the rule applies. The element is required only if you specify more than one filter. For example: </p> <ul> <li> <p>You specify both a <code>Prefix</code> and a <code>Tag</code> filters. Then you wrap these in an <code>And</code> tag.</p> </li> <li> <p>You specify filter based on multiple tags. Then you wrap the <code>Tag</code> elements in an <code>And</code> tag.</p> </li> </ul>
      */
    var And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined
    
    /**
      * <p>Object keyname prefix that identifies subset of objects to which the rule applies.</p>
      */
    var Prefix: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Container for specifying a tag key and value. </p> <p>The rule applies only to objects having the tag in its tagset.</p>
      */
    var Tag: js.UndefOr[typings.awsSdkClientS3Node.typesTagMod.Tag] = js.undefined
  }
  object ReplicationRuleFilter {
    
    @scala.inline
    def apply(): ReplicationRuleFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicationRuleFilter]
    }
    
    @scala.inline
    implicit class ReplicationRuleFilterMutableBuilder[Self <: ReplicationRuleFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: ReplicationRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
  
  trait UnmarshalledReplicationRuleFilter
    extends StObject
       with ReplicationRuleFilter {
    
    /**
      * <p>Container for specifying rule filters. These filters determine the subset of objects to which the rule applies. The element is required only if you specify more than one filter. For example: </p> <ul> <li> <p>You specify both a <code>Prefix</code> and a <code>Tag</code> filters. Then you wrap these in an <code>And</code> tag.</p> </li> <li> <p>You specify filter based on multiple tags. Then you wrap the <code>Tag</code> elements in an <code>And</code> tag.</p> </li> </ul>
      */
    @JSName("And")
    var And_UnmarshalledReplicationRuleFilter: js.UndefOr[UnmarshalledReplicationRuleAndOperator] = js.undefined
    
    /**
      * <p>Container for specifying a tag key and value. </p> <p>The rule applies only to objects having the tag in its tagset.</p>
      */
    @JSName("Tag")
    var Tag_UnmarshalledReplicationRuleFilter: js.UndefOr[UnmarshalledTag] = js.undefined
  }
  object UnmarshalledReplicationRuleFilter {
    
    @scala.inline
    def apply(): UnmarshalledReplicationRuleFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledReplicationRuleFilter]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicationRuleFilterMutableBuilder[Self <: UnmarshalledReplicationRuleFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: UnmarshalledReplicationRuleAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
      
      @scala.inline
      def setTag(value: UnmarshalledTag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    }
  }
}
