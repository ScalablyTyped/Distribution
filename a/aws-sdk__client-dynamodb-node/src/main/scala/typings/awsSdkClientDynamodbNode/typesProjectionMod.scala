package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ALL
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.INCLUDE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.KEYS_ONLY
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProjectionMod {
  
  @js.native
  trait Projection extends StObject {
    
    /**
      * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
      */
    var NonKeyAttributes: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
    
    /**
      * <p>The set of attributes that are projected into the index:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul>
      */
    var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.native
  }
  object Projection {
    
    @scala.inline
    def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonKeyAttributes(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      @scala.inline
      def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setProjectionType(value: ALL | KEYS_ONLY | INCLUDE | String): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledProjection extends Projection {
    
    /**
      * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
      */
    @JSName("NonKeyAttributes")
    var NonKeyAttributes_UnmarshalledProjection: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledProjection {
    
    @scala.inline
    def apply(): UnmarshalledProjection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledProjection]
    }
    
    @scala.inline
    implicit class UnmarshalledProjectionMutableBuilder[Self <: UnmarshalledProjection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonKeyAttributes(value: js.Array[String]): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      @scala.inline
      def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value :_*))
    }
  }
}
