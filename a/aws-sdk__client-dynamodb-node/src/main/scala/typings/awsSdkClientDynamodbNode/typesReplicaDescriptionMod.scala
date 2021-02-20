package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicaDescriptionMod {
  
  @js.native
  trait ReplicaDescription extends StObject {
    
    /**
      * <p>The name of the region.</p>
      */
    var RegionName: js.UndefOr[String] = js.native
  }
  object ReplicaDescription {
    
    @scala.inline
    def apply(): ReplicaDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplicaDescription]
    }
    
    @scala.inline
    implicit class ReplicaDescriptionMutableBuilder[Self <: ReplicaDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    }
  }
  
  type UnmarshalledReplicaDescription = ReplicaDescription
}
