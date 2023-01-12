package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.INCLUDE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KEYS_ONLY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProjectionMod {
  
  trait Projection extends StObject {
    
    /**
      * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
      */
    var NonKeyAttributes: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>The set of attributes that are projected into the index:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul>
      */
    var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.undefined
  }
  object Projection {
    
    inline def apply(): Projection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      inline def setNonKeyAttributes(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      inline def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value*))
      
      inline def setProjectionType(value: ALL | KEYS_ONLY | INCLUDE | String): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
      
      inline def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
    }
  }
  
  trait UnmarshalledProjection
    extends StObject
       with Projection {
    
    /**
      * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
      */
    @JSName("NonKeyAttributes")
    var NonKeyAttributes_UnmarshalledProjection: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledProjection {
    
    inline def apply(): UnmarshalledProjection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledProjection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledProjection] (val x: Self) extends AnyVal {
      
      inline def setNonKeyAttributes(value: js.Array[String]): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
      
      inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
      
      inline def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value*))
    }
  }
}
